package com.jakewharton.u2020.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.jakewharton.u2020.IAppComponent;
import com.jakewharton.u2020.R;
import com.jakewharton.u2020.data.Injector;

public final class DebugActivity extends Activity {
  private IAppComponent appComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    appComponent = Injector.obtain(getApplication());
    setContentView(R.layout.debug_activity);
  }

  @Override public Object getSystemService(@NonNull String name) {
    if (Injector.matchesService(name)) {
      return appComponent;
    }
    return super.getSystemService(name);
  }
}
