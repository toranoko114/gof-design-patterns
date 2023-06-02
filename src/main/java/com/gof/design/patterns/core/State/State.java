package com.gof.design.patterns.core.State;

public interface State {

  void doClock(Context context, int hour);

  void doUse(Context context);

  void doAlarm(Context context);

  void doPhone(Context context);

}
