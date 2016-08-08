package com.jakewharton.u2020.data;

import android.content.Context;

import com.jakewharton.u2020.AppComponent;

public final class Injector {
  private static final String INJECTOR_SERVICE = "com.jakewharton.u2020.injector";

  @SuppressWarnings({"ResourceType", "WrongConstant"}) // Explicitly doing a custom service.
  public static AppComponent obtain(Context context) {
    return (AppComponent) context.getSystemService(INJECTOR_SERVICE);
  }

  public static boolean matchesService(String name) {
    return INJECTOR_SERVICE.equals(name);
  }

  private Injector() {
    throw new AssertionError("No instances.");
  }
}
