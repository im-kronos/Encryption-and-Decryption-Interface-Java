import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Homepage extends JFrame implements ActionListener {
    JButton caeser;
    JButton aes;
     JButton utf;
    
    JButton quitButton;


    public Homepage() {
        super("Encyption-Decryption");

        caeser = new JButton("Caeser Method");
        aes = new JButton("AES_Method");
        utf = new JButton("UTF-8 Method");
        quitButton = new JButton("Quit");

        caeser.addActionListener(this);
        aes.addActionListener(this);
        utf.addActionListener(this);
        quitButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(caeser);
        panel.add(aes);
        panel.add(utf);
        panel.add(quitButton);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == caeser) {
          //  TicTacToe game = new TicTacToe();
        } else if (e.getSource() == aes) {
           // PongGame game = new PongGame();
        }else if (e.getSource() == utf) {
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
