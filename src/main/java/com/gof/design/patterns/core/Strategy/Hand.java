package com.gof.design.patterns.core.Strategy;

/**
 * じゃんけんの手を表すクラス
 */
public enum Hand {
  ROCK("グー", 0),
  SCISSORS("チョキ", 1),
  PAPER("パー", 2);

  Hand(String label, int handValue) {
    this.label = label;
    this.handValue = handValue;
  }

  @Override
  public String toString() {
    return label;
  }

  private final String label;
  private final int handValue;

  private static final Hand[] hands = {ROCK, SCISSORS, PAPER};

  public static Hand getHand(int handValue) {
    return hands[handValue];
  }

  private int fight(Hand h) {
    if (this == h) {
      return 0;
    } else if ((this.handValue + 1) % 3 == h.handValue) {
      return 1;
    } else {
      return -1;
    }
  }

  public boolean isStrongerThan(Hand h) {
    return fight(h) == 1;
  }

  public boolean isWeakerThan(Hand h) {
    return fight(h) == -1;
  }
  
}
