package com.gof.design.patterns.core.Command;

import com.gof.design.patterns.core.Command.command.Command;
import com.gof.design.patterns.core.Command.command.MacroCommand;
import com.gof.design.patterns.core.Command.drawer.DrawCanvas;
import com.gof.design.patterns.core.Command.drawer.DrawCommand;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements MouseMotionListener, WindowListener {

  private final MacroCommand history = new MacroCommand();
  private final DrawCanvas canvas = new DrawCanvas(400, 400, history);

  public Main(String title) {
    super(title);
    this.addWindowListener(this);
    canvas.addMouseMotionListener(this);
    JButton clearButton = new JButton("clear");
    clearButton.addActionListener(e -> {
      history.clear();
      canvas.repaint();
    });

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(clearButton);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    setVisible(true);
  }


  @Override
  public void mouseMoved(MouseEvent e) {

  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Command command = new DrawCommand(canvas, e.getPoint());
    history.append(command);
    command.execute();
  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  @Override
  public void windowOpened(WindowEvent e) {

  }

  @Override
  public void windowClosed(WindowEvent e) {

  }

  @Override
  public void windowIconified(WindowEvent e) {

  }

  @Override
  public void windowDeiconified(WindowEvent e) {

  }

  @Override
  public void windowActivated(WindowEvent e) {

  }

  @Override
  public void windowDeactivated(WindowEvent e) {

  }

  public static void main(String[] args) {
    new Main("Command Pattern Sample");
  }
}
