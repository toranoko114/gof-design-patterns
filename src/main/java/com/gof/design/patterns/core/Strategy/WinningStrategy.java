package com.gof.design.patterns.core.Strategy;

import java.util.Random;

/**
 * 勝ったら次も同じ手を出す戦略を表すクラス
 */
public class WinningStrategy implements Strategy {

  private final Random random;
  private boolean won = false;
  private Hand prevHand;

  public WinningStrategy(int seed) {
    this.random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    if (!won) {
      prevHand = Hand.getHand(random.nextInt(3));
    }
    return prevHand;
  }

  @Override
  public void study(boolean win) {
    won = win;
  }
}
