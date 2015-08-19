package com.jakewharton.u2020.ui.trending;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.u2020.R;
import com.jakewharton.u2020.ui.misc.EnumAdapter;

final class TrendingTimespanAdapter extends EnumAdapter<TrendingTimespan>
    implements ThemedSpinnerAdapter {
  private final ThemedSpinnerAdapter.Helper helper;

  public TrendingTimespanAdapter(Context context) {
    super(context, TrendingTimespan.class);
    helper = new ThemedSpinnerAdapter.Helper(context);
  }

  @Override public View newView(LayoutInflater inflater, int position, ViewGroup container) {
    return inflater.inflate(R.layout.trending_timespan_view, container, false);
  }

  @Override
  public View newDropDownView(LayoutInflater inflater, int position, ViewGroup container) {
    return helper.getDropDownViewInflater()
        .inflate(R.layout.trending_timespan_view, container, false);
  }

  @Override public void setDropDownViewTheme(Resources.Theme theme) {
    helper.setDropDownViewTheme(theme);
  }

  @Nullable @Override public Resources.Theme getDropDownViewTheme() {
    return helper.getDropDownViewTheme();
  }
}
