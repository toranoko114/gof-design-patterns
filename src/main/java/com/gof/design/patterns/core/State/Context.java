package com.gof.design.patterns.core.State;

public interface Context {

  void setClock(int hour);

  void changeState(State instance);

  void recordLog(String msg);

  void callSecurityCenter(String msg);
}
