package com.gof.design.patterns.core.State;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    SafeFrame frame = new SafeFrame("State Sample");
    while (true) {
      IntStream.range(0, 24).forEach(
          i -> {
            frame.setClock(i);
            try {
              Thread.sleep(1000);
            } catch (InterruptedException e) {
              throw new RuntimeException("エラーです.");
            }
          }
      );
    }
  }
}
