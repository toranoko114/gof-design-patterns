package com.gof.design.patterns.core.Command.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {

  private final Deque<Command> commands = new ArrayDeque<>();

  @Override
  public void execute() {
    commands.forEach(Command::execute);
  }

  public void append(Command command) {
    if (command == this) {
      throw new IllegalArgumentException("無限ループになっちゃいます.");
    }
    commands.push(command);
  }

  public void undo() {
    if (!commands.isEmpty()) {
      commands.pop();
    }
  }

  public void clear() {
    commands.clear();
  }

}
