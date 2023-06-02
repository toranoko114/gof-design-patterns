package com.gof.design.patterns.core.Command.drawer;

import com.gof.design.patterns.core.Command.command.Command;
import java.awt.Point;

public class DrawCommand implements Command {

  protected Drawable drawable;
  private final Point position;

  public DrawCommand(Drawable drawable, Point position) {
    this.drawable = drawable;
    this.position = position;
  }

  @Override
  public void execute() {
    drawable.draw(position.x, position.y);
  }
}
