package com.jakewharton.u2020;

import com.jakewharton.u2020.data.api.oauth.OauthService;
import com.jakewharton.u2020.ui.MainActivityModule;
import com.jakewharton.u2020.ui.debug.DebugView;
import com.jakewharton.u2020.ui.debug.DebugViewContainer;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alexander.bratusenko on 08/08/16.
 */
@Singleton
@Component(modules = {DebugU2020Module.class})
public interface AppComponent extends IAppComponent {

    ActivityComponent plus(MainActivityModule module);

}
