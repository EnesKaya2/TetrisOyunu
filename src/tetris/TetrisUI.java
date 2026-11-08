import java.awt.*;
import javax.swing.*;

//İki layout var. sağ ve sol taraf.
// sol --> oyun tarafı.
// sağ --> skor ve düğmeler.

// OKUYALIM!! :)
//NOT: Oyunda 7 blok var. Bunların rengini ve kısa adlarını yazdım. Belki ihtiyacınız olur diye.
// Kare         -> Diğer ismi 'O' -> Rengi SARI = YELLOW
// Şu dik, 4'lü -> Diğer ismi 'I' -> Rengi AÇIK MAVİ = TEAL
// S Bloğu      -> Diğer ismi 'S' -> Rengi KIRMIZI = RED
// Z Bloğu      -> Diğer ismi 'Z' -> Rengi YEŞİL = GREEN
// L bloğu      -> Diğer ismi 'L' -> Rengi TURUNCU = ORANGE
// J bloğu      -> Diğer ismi 'J' -> Rengi PEMBE = PINK
// T bloğu      -> Diğer ismi 'T' -> Rengi MOR = PURPLE

//Oyun gridleri 10x20 olmak zorunda, ona göre ayarladım. çözünürlüğü değiştirmek istiyorsanız söyleyin değiştireyim.


public class TetrisUI extends JFrame {

    //alanlar
    private JLabel scoreVal;
    private JLabel levelVal;
    private JPanel previewBox;
    private int[][] nextPiece;

    public TetrisUI() {
        setTitle("Tetris UI Prototype");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        //ana layout.
        setLayout(new BorderLayout());

        //oyun tarafı paneli.
        JPanel boardPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(30, 30, 30)); //karanlık tema.
                g.fillRect(0, 0, getWidth(), getHeight());

                //grid çizimi.
                g.setColor(new Color(50,50, 50));
                for (int i = 0; i <= getWidth(); i += 50){
                    g.drawLine(i, 0, i, getHeight());
                }
                for (int j = 0; j <= getHeight(); j += 50){
                    g.drawLine(0, j, getWidth(), j);
                }


                //öylesine birkaç blok.
                //self-not: her bloğun kendine göre bir rengi olmalı.
                //renkleri değişmemeli.
                g.setColor(Color.CYAN);
                g.fillRect(100, 900, 50, 50);

                g.setColor(Color.ORANGE);
                g.fillRect(150, 900, 50, 50);
                g.fillRect(200, 900, 50, 50);
                g.fillRect(200, 850, 50, 50);

            }
        };
        boardPanel.setPreferredSize(new Dimension(500, 1000));

        //yan bar. sidebar. puan, sıradaki parça, vs vs.
        JPanel sidePanel = new JPanel();
        sidePanel.setPreferredSize(new Dimension(300, 1000));
        sidePanel.setBackground(new Color(40, 40, 40));
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));

        //yazı panelleri için yardımcılar
        
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Font valueFont = new Font("Arial", Font.PLAIN, 16);

        //SKOR, SEVİYE, VESAİRE BURADA.

        JLabel scoreTitle = createLabel("SCORE", labelFont, Color.LIGHT_GRAY);
        scoreVal = createLabel("002450", valueFont, Color.WHITE);
        
        JLabel levelTitle = createLabel("LEVEL", labelFont, Color.LIGHT_GRAY);
        levelVal = createLabel("3", valueFont, Color.WHITE);

        JLabel nextTitle = createLabel("NEXT", labelFont, Color.LIGHT_GRAY);

        //sıradaki parça kutusu
        previewBox = new JPanel() {
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());

                //örnek çizim
                g.setColor(Color.MAGENTA);
                g.fillRect(30, 20, 20, 20);
                g.fillRect(10, 40, 20, 20);
                g.fillRect(30, 40, 20, 20);
                g.fillRect(50, 40, 20, 20);
            }
        };
        previewBox.setPreferredSize(new Dimension(100, 80));
        previewBox.setMaximumSize(new Dimension(100, 80));
        previewBox.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        //düğmeler.
        JButton startBtn = new JButton("START");
        JButton resetBtn = new JButton("RESET");
        startBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
        resetBtn.setAlignmentX(Component.LEFT_ALIGNMENT);

        //yan bar, sidebar, parçaları
        sidePanel.add(scoreTitle);
        sidePanel.add(scoreVal);
        sidePanel.add(Box.createRigidArea(new Dimension(0, 20)));
        sidePanel.add(levelTitle);
        sidePanel.add(levelVal);
        sidePanel.add(Box.createRigidArea(new Dimension(0, 20)));
        sidePanel.add(nextTitle);
        sidePanel.add(Box.createRigidArea(new Dimension(0, 5)));
        sidePanel.add(previewBox);
        
        sidePanel.add(Box.createRigidArea(new Dimension(0, 30)));
        sidePanel.add(startBtn);
        sidePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        sidePanel.add(resetBtn);


        //panel
        add(boardPanel, BorderLayout.CENTER);
        add(sidePanel, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
    }

    //Methodlar.
    //NOT: Şimdilik çok bir şey yapmıyorlar ama
    //1: Sıradaki objeyi belirlemek,
    //2: Seviye vermek,
    //3: Skoru ayarlamak,
    //İçin bunları kullanabilirsiniz.

    public void setScore(int score) {
        scoreVal.setText(String.format("%06d", score));
    }

    public void setLevel(int level) {
        levelVal.setText(String.valueOf(level));
    }

    public void setNextPiece(int[][] shape) {
        this.nextPiece = shape;
        previewBox.repaint();
    }


    private JLabel createLabel(String text, Font font, Color color){
        JLabel label = new JLabel(text);
        label.setFont(font);
        label.setForeground(color);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TetrisUI().setVisible(true);

            TetrisUI ui = new TetrisUI();

        });
    }
}