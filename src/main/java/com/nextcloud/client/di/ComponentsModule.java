package com.nextcloud.client.di;

import com.owncloud.android.ui.activity.FileDisplayActivity;
import com.owncloud.android.ui.fragment.FileDetailFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Register classes that require dependency injection. This class is used by Dagger compiler
 * only.
 */
@Module
abstract class ComponentsModule {
    @ContributesAndroidInjector abstract FileDisplayActivity fileDisplayActivity();
    @ContributesAndroidInjector abstract FileDetailFragment fileDetailFragment();
}
