import javax.swing.*;

public class Main {
    public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Formulary();
                frame.setBounds(600,300,300, 150);
                frame.setVisible(true);
            }
        });

    }
}
