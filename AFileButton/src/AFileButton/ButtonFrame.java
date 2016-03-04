package AFileButton;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.util.Random;


public class ButtonFrame extends JFrame implements ActionListener // an inheritance. It also uses an actionlistener - JH
{
	private final JButton[] buttons; // create array of buttons - JH
	private static final String[] names = {"Epicurus", "Aristotle", "Plato"}; // - JH
	private final Container container;			// frame container - JH
	private final GridLayout gridLayout1;		// grid layout - JH
	
	
	public ButtonFrame()		//constructor with no arguments - JH
	{
		super("Select a Button");
		gridLayout1 = new GridLayout(3, 3, 5, 5); 	// grid layout has gaps of 5 between buttons - JH
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		
		for (int count = 0; count < names.length; count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);		// adds buttons to jframe - JH
		}
	}
		// handle button events. Add event to each button selection - JH
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		
		if (event.getSource() == buttons[0])
			try {
				Epicurus.myEpicurus();
											} catch (IOException e) {
				e.printStackTrace();
			}

		if (event.getSource() == buttons[1]) // if 2 is selected
		{
				try{
					Aristotle.myAristotle();
				} catch (IOException e) { e.printStackTrace(); }
		}
		
		
		if (event.getSource() == buttons[2]) // if 3 is selected
			try{
				Plato.myPlato();
			} catch (IOException e) { e.printStackTrace(); }
	
				
				
			
	{// Set layout
					
		container.setLayout(gridLayout1);
	}
	}
}