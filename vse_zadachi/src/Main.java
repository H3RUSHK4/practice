import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main extends JFrame {
    private JTextField textField;
    public Main() {
        super("Все задания");
        createGUI();
    }
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ActionListener actionListener = new TestActionListener();
        JButton button3 = new JButton("Задача 3");
        button3.setActionCommand("https://github.com/Euros2308/-1-.-19-1-1/tree/main/%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%B03");
        panel.add(button3);
        button3.addActionListener(actionListener);
        JButton button4 = new JButton("Задача 4");
        button4.setActionCommand("https://github.com/Euros2308/-1-.-19-1-1/tree/main/%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%B04");
        panel.add(button4);
        JButton button9 = new JButton("Задача 9");
        button9.setActionCommand("https://github.com/Euros2308/-1-.-19-1-1/tree/main/%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%B09");
        panel.add(button9);
        button9.addActionListener(actionListener);
        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 200));
    }
    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL(e.getActionCommand()).toURI());
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                Main frame = new Main();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
