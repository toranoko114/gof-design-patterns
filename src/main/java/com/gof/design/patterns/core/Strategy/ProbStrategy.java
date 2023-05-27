package com.gof.design.patterns.core.Strategy;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 1回前の手から次の手を確率的に計算する戦略を表すクラス
 */
public class ProbStrategy implements Strategy {

  private final Random random;
  private int prevHandValue = 0;
  private int currentHandValue = 0;
  private final int[][] history = {
      {1, 1, 1},
      {1, 1, 1},
      {1, 1, 1}
  };

  public ProbStrategy(int seed) {
    this.random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    int bet = random.nextInt(getSum(currentHandValue));
    int handValue;
    if (bet < history[currentHandValue][0]) {
      handValue = 0;
    } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
      handValue = 1;
    } else {
      handValue = 2;
    }
    prevHandValue = currentHandValue;
    currentHandValue = handValue;
    return Hand.getHand(handValue);
  }

  private int getSum(int handValue) {
    AtomicInteger sum = new AtomicInteger();
    IntStream.range(0, 3).forEach(i -> sum.addAndGet(history[handValue][i]));
    return sum.get();
  }

  @Override
  public void study(boolean win) {
    if (win) {
      history[prevHandValue][currentHandValue]++;
    } else {
      history[prevHandValue][(currentHandValue + 1) % 3]++;
      history[prevHandValue][(currentHandValue + 2) % 3]++;
    }
  }
}
