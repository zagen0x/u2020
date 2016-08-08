package com.jakewharton.u2020;

import com.jakewharton.u2020.data.api.oauth.OauthService;
import com.jakewharton.u2020.ui.debug.DebugView;
import com.jakewharton.u2020.ui.debug.DebugViewContainer;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alexander.bratusenko on 08/08/16.
 */
@Singleton
@Component(modules = {})
public interface AppComponent {
    void inject(U2020App app);

    void inject(OauthService service);

    void inject(DebugViewContainer debugViewContainer);

    void inject(DebugView debugView);
    
}
