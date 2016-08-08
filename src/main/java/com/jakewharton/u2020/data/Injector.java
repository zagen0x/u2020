package com.jakewharton.u2020.data;

import android.content.Context;

import com.jakewharton.u2020.AppComponent;
import com.jakewharton.u2020.IAppComponent;

public final class Injector {
  private static final String INJECTOR_SERVICE = "com.jakewharton.u2020.injector";

  @SuppressWarnings({"ResourceType", "WrongConstant"}) // Explicitly doing a custom service.
  public static IAppComponent obtain(Context context) {
    return (IAppComponent) context.getSystemService(INJECTOR_SERVICE);
  }

  public static boolean matchesService(String name) {
    return INJECTOR_SERVICE.equals(name);
  }

  private Injector() {
    throw new AssertionError("No instances.");
  }
}
