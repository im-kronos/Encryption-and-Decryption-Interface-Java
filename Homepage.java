import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Homepage extends JFrame implements ActionListener {
    JButton EncryptionButton;
    JButton Decryption;
    JButton quitButton;


    public Homepage() {
        super("Encyption-Decryption");

        EncryptionButton = new JButton("Encryption");
        Decryption = new JButton("Decryption");

        quitButton = new JButton("Quit");

        EncryptionButton.addActionListener(this);
        Decryption.addActionListener(this);
        quitButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(EncryptionButton);
        panel.add(Decryption);
        panel.add(quitButton);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == EncryptionButton) {
          //  TicTacToe game = new TicTacToe();
        } else if (e.getSource() == Decryption) {
           // PongGame game = new PongGame();
        }
           //{
            //Homepage frame = new Homepage();
           // }
           else if (e.getSource() == quitButton)
            {
            System.exit(0);
            }
        
        }

    public static void main(String[] args) {
        Homepage project = new Homepage();
    }
}
