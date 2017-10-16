package chat;

import java.awt.*;
import javax.swing.*;

public class ChatClient {
    
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButton;

    public ChatClient() {

        this.output = new JTextArea(10,50);
        this.input = new JTextField(50);
        this.sendButton = new JButton("Send");
        this.quitButton = new JButton("Quit");
    }
    
    public void launchFrame() {

        JFrame frame = new JFrame("Bank Chat Room");
        frame.setLayout(new BorderLayout());
        
        frame.add(output, BorderLayout.CENTER);
        frame.add(input, BorderLayout.SOUTH);
        
        JPanel buttoPanel = new JPanel();
        buttoPanel.setLayout(new GridLayout(2, 1));
        buttoPanel.add(sendButton);
        buttoPanel.add(quitButton);
        
        frame.add(buttoPanel, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ChatClient myChat = new ChatClient();
        myChat.launchFrame();
    }
    
}
