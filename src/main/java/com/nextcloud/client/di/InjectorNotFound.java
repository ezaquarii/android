package com.nextcloud.client.di;

class InjectorNotFound extends RuntimeException {
    InjectorNotFound(Object object, Throwable cause) {
        super(
            String.format(
                "Injector not registered for %s. Have you added it to %s?",
                object.getClass().getName(),
                ComponentsModule.class.getName()
            ),
            cause
        );
    }
}
