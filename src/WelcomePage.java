
import java.awt.*;
import javax.swing.*;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	
	WelcomePage(String userID){
		
		welcomeLabel.setBounds(5,5,1000,500);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello, "+userID+ "\n You have successfully been Admitted into BUP,ICT!");
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
