package com.nextcloud.client.di;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.android.support.AndroidSupportInjection;

class FragmentInjector extends FragmentManager.FragmentLifecycleCallbacks {
    @Override
    public void onFragmentPreAttached(@NonNull FragmentManager fm, @NonNull Fragment f, @NonNull Context context) {
        super.onFragmentPreAttached(fm, f, context);
        if(f instanceof Injectable) {
            try {
                AndroidSupportInjection.inject(f);
            } catch (IllegalArgumentException directCause) {
                // this provides a cause description that is a bit more friendly for developers
                throw new InjectorNotFound(f, directCause);
            }
        }
    }
}
