/**
 * This package contains application Dependency Injection code, based on Dagger 2.
 *
 * To enable dependency injection for a component, such as {@link android.app.Activity}, {@link androidx.fragment.app.Fragment}
 * or {@link android.app.Service}, component must be first registered in {@link com.nextcloud.client.di.ComponentsModule}.
 *
 * {@link com.nextcloud.client.di.ComponentsModule} will be used by Dagger compiler to create injector for a given class.
 *
 * @see com.nextcloud.client.di.InjectorNotFound
 */
package com.nextcloud.client.di;
