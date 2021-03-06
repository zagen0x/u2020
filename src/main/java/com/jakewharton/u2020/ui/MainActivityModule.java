package com.jakewharton.u2020.ui;

import android.support.v4.widget.DrawerLayout;

import com.jakewharton.u2020.PerActivity;
import com.jakewharton.u2020.U2020Module;
import com.jakewharton.u2020.ui.trending.TrendingView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public final class MainActivityModule {
    private final MainActivity mainActivity;

    MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @PerActivity
    DrawerLayout provideDrawerLayout() {
        return mainActivity.drawerLayout;
    }
}
