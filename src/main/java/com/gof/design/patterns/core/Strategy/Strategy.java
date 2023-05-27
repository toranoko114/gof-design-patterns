package com.gof.design.patterns.core.Strategy;

/**
 * じゃんけんの戦略を表すクラス
 */
public interface Strategy {

  Hand nextHand();

  void study(boolean win);
}
