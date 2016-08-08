package com.jakewharton.u2020;

import com.jakewharton.u2020.data.api.oauth.OauthService;
import com.jakewharton.u2020.ui.debug.DebugView;
import com.jakewharton.u2020.ui.debug.DebugViewContainer;

/**
 * Created by alexander.bratusenko on 08/08/16.
 */
public interface IAppComponent {
    void inject(U2020App app);

    void inject(OauthService service);

    void inject(DebugViewContainer debugViewContainer);

    void inject(DebugView debugView);

}
