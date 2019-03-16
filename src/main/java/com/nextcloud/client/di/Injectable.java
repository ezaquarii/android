package com.nextcloud.client.di;

/**
 * Marks object as injectable by {@link DependencyInjector}.
 *
 * Any {@link android.app.Activity} or {@link androidx.fragment.app.Fragment} implementing
 * this interface will be automatically supplied with dependencies by {@link DependencyInjector}.
 *
 * Activities are considered fully-initialized after call to {@link android.app.Activity#onCreate(Bundle)}
 * (this means after {@code super.onCreate(savedStateInstance)} returns).
 *
 * Injectable Fragments are supplied with dependencies before {@link androidx.fragment.app.Fragment#onAttach(Context)}.
 */
public interface Injectable {
}
