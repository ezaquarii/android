package com.nextcloud.client.di;

import android.app.Application;
import android.content.Context;

import com.nextcloud.client.preferences.AppPreferences;
import com.nextcloud.client.preferences.PreferenceManager;

import dagger.Module;
import dagger.Provides;

@Module(includes = {ComponentsModule.class})
class AppModule {

    @Provides
    Context context(Application application) {
        return application.getApplicationContext();
    }

    @Provides
    AppPreferences preferences(Application application) {
        return PreferenceManager.fromContext(application);
    }
}
