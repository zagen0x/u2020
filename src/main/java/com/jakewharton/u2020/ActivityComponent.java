package com.jakewharton.u2020;

import com.jakewharton.u2020.ui.MainActivity;
import com.jakewharton.u2020.ui.MainActivityModule;
import com.jakewharton.u2020.ui.trending.TrendingView;

import dagger.Subcomponent;

/**
 * Created by alexander.bratusenko on 08/08/16.
 */
@PerActivity
@Subcomponent(modules = {MainActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    void inject(TrendingView view);
}
