package org.jqassistant.plugin.nexusiq.impl.resolver;

import java.util.HashMap;
import java.util.Map;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;

import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@RequiredArgsConstructor(access = PRIVATE)
public class ResolverFactory {

    private final Map<Class<?>, Resolver<?, ?>> resolvers;

    public <V, D extends Descriptor> Resolver<V, D> getResolver(V value, Class<D> descriptorType) {
        return getResolver(value.getClass(), descriptorType);
    }

    public <V, D extends Descriptor> Resolver<V, D> getResolver(Class<?> valueType, Class<D> descriptorType) {
        return (Resolver<V, D>) resolvers.computeIfAbsent(valueType, t -> new Resolver<V, D>() {
            @Override
            public Class<V> getValueType() {
                return (Class<V>) t.getClass();
            }

            @Override
            public Class<D> getDescriptorType() {
                return descriptorType;
            }

            @Override
            public D resolve(V type, ScannerContext scannerContext) {
                return scannerContext.getStore()
                    .create(descriptorType);
            }
        });
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Map<Class<?>, Resolver<?, ?>> resolvers = new HashMap<>();

        public <T, D extends Descriptor> Builder resolver(Resolver<T, D> resolver) {
            resolvers.put(resolver.getValueType(), resolver);
            return this;
        }

        public ResolverFactory build() {
            return new ResolverFactory(resolvers);
        }
    }
}
