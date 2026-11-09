/*
 * Sorumlu : Emir + Görkem
 * Video   : 1, 7, 8, 9
 * Görev   : Ana sınıf (main). Oyunu başlatır.
 */
package tetris;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class Tetris
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tetris");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JPanel placeholder = new JPanel();
            placeholder.setBounds(50, 30, 250, 500);
            placeholder.setBackground(new Color(238, 238, 238));
            placeholder.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            frame.add(placeholder);

            GameArea ga = new GameArea(placeholder, 10);
            frame.add(ga);

            InputMap im = frame.getRootPane().getInputMap();
            ActionMap am = frame.getRootPane().getActionMap();

            im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
            im.put(KeyStroke.getKeyStroke("LEFT"), "left");
            im.put(KeyStroke.getKeyStroke("UP"), "up");
            im.put(KeyStroke.getKeyStroke("DOWN"), "down");
            im.put(KeyStroke.getKeyStroke("SPACE"), "drop");

            am.put("right", new AbstractAction() {
                public void actionPerformed(ActionEvent e) { ga.moveBlockRight(); }
            });
            am.put("left", new AbstractAction() {
                public void actionPerformed(ActionEvent e) { ga.moveBlockLeft(); }
            });
            am.put("up", new AbstractAction() {
                public void actionPerformed(ActionEvent e) { ga.rotateBlock(); }
            });
            am.put("down", new AbstractAction() {
                public void actionPerformed(ActionEvent e) { ga.moveBlockDown(); }
            });
            am.put("drop", new AbstractAction() {
                public void actionPerformed(ActionEvent e) { ga.DropBlock(); }
            });

            frame.setSize(370, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            new GameThread(ga).start();
        });
    }
}
