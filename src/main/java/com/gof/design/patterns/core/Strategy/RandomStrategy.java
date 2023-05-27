package com.gof.design.patterns.core.Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

  private final Random random;

  public RandomStrategy(int seed) {
    this.random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    return Hand.getHand(random.nextInt(3));
  }

  @Override
  public void study(boolean win) {
  }
}
