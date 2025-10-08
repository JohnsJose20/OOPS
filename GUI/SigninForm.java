import javax.swing.*;
import java.awt.*;

public class SigninForm {
public static void main(String[]args) {
		
		JFrame mainFrame = new JFrame();
		
		mainFrame.setSize(500,350);
		mainFrame.setTitle("Signup Form");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,2,10,10)); //(row,column,vertical,horizontal space)
		
		JLabel userLabel = new JLabel("User Name");
		JTextField userField = new JTextField();
		
		JLabel emailLabel = new JLabel("Email");
		JTextField emailField = new JTextField();
		
		JLabel genderLabel = new JLabel("Gender");
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		//Button Grouping
		ButtonGroup genderBtnGroup = new ButtonGroup();
		genderBtnGroup.add(male);
		genderBtnGroup.add(female);
		
		JPanel genderpanel = new JPanel();
		genderpanel.setLayout(new FlowLayout());
		genderpanel.add(male);
		genderpanel.add(female);
		
		JLabel countryLabel =new JLabel();
		String [] countries = {"India","China","Japan","America","Germany"};
		JComboBox<String> countryBox = new JComboBox<>(countries);
		
		JLabel adressLabel = new JLabel("Adress");
		JTextArea adressArea = new JTextArea(3,4);//row,column size
		
		JButton submitbtn = new JButton("Submit");
		
		panel.add(userLabel);
		panel.add(userField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(genderLabel);
		panel.add(genderpanel);
		panel.add(countryLabel);
		panel.add(countryBox);
		panel.add(adressLabel);
		panel.add(adressArea);
		panel.add(new JLabel(""));
		panel.add(submitbtn);
		
		mainFrame.add(panel);
		
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
	}
}

