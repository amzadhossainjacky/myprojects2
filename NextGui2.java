import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NextGui2 extends JFrame implements MouseListener, ActionListener
{
	private JLabel textLabel, imgLabel;
	private JButton btnBack, btnExit;
	private ImageIcon bg_img;
	private Font f1;
	private Font f2;
	private FGame fg;
	private JPanel panel;
	
	
	public NextGui2(FGame fg)
	{
		super("This is Next GUI2");
		this.fg = fg;
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		f1 = new Font("Cambria", Font.BOLD, 30);
		f2 = new Font("Cambria", Font.BOLD, 25);
		
		textLabel = new JLabel("You are Not a Fool.");
		textLabel.setBounds(190, 150, 550, 30);
		textLabel.setFont(f2);
		textLabel.setForeground(Color.white);
		panel.add(textLabel);
				
		btnBack = new JButton("Back");
		btnBack.setBounds(200, 450, 80, 30);
		btnBack.setForeground(Color.black);
		btnBack.setBackground(Color.white);
		btnBack.addMouseListener(this);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit= new JButton("Exit");
		btnExit.setBounds(310, 450, 80, 30);
		btnExit.setForeground(Color.black);
		btnExit.setBackground(Color.white);
		btnExit.addMouseListener(this);
		btnExit.addActionListener(this);
		panel.add(btnExit);
			
		bg_img = new ImageIcon("Bgroundpic.jpg");
		imgLabel = new JLabel(bg_img);
		imgLabel.setBounds(0, 0, 600, 600);
		panel.add(imgLabel);
		
		this.add(panel);
		
	}
		
		public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
		public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(btnBack))
		{
			btnBack.setBackground(Color.yellow);
			btnBack.setForeground(Color.black);
		}
		else if(me.getSource().equals( btnExit))
		{
			 btnExit.setBackground(Color.yellow);
			 btnExit.setForeground(Color.black);
		}
		else{}
	}
	
		public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(btnBack))
		{
			btnBack.setForeground(Color.black);
			btnBack.setBackground(Color.white);
		}
		else if(me.getSource().equals( btnExit))
		{
			 btnExit.setBackground(Color.RED);
			 btnExit.setBackground(Color.white);
		}
		else{}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			fg.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		else{}
		
	}

	
}