import java. lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



public class FGame extends JFrame implements MouseListener, ActionListener
{
	private JLabel welcomeLabel, textLabel, imgLabel, title;
	private JTextField userTF;
	private JButton btnYes, btnNo;
	private ImageIcon bg_img;
	private Font f1;
	private Font f2;
	private JPanel panel;
	public static int a=310;
	public static int b=450;
	public static int ran1 ;
	public static int ran2;
	
	
	public FGame ()
	{
		super("Fool Game");

		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		f1 = new Font("Cambria", Font.BOLD, 30);
		f2 = new Font("Cambria", Font.BOLD, 25);
		
		title = new JLabel();
		title.setBounds(0, 0, 0, 0);
		panel.add(title);
		
		welcomeLabel = new JLabel(" WELCOME TO MY FOOL HEAVEN");
		welcomeLabel.setBounds(53,40,500,30);
		welcomeLabel.setFont(f1);
		welcomeLabel.setForeground(Color.white);
		panel.add(welcomeLabel);
		
		textLabel = new JLabel(" Are you a Fool? ");
		textLabel.setBounds(200, 150, 500, 30);
		textLabel.setFont(f2);
		textLabel.setForeground(Color.white);
		panel.add(textLabel);
				
		btnYes = new JButton("Yes");
		btnYes.setBounds(200, 450, 80, 30);
		btnYes.setForeground(Color.black);
		btnYes.setBackground(Color.white);
		btnYes.addMouseListener(this);
		btnYes.addActionListener(this);
		panel.add(btnYes);
		
		btnNo = new JButton("No");
		btnNo.setBounds(a, b, 80, 30);
		btnNo.setForeground(Color.black);
		btnNo.setBackground(Color.white);
		btnNo.addMouseListener(this);
		btnNo.addActionListener(this);
		panel.add(btnNo);
			
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
		if(me.getSource().equals(btnYes))
		{
			btnYes.setBackground(Color.yellow);
			btnYes.setForeground(Color.black);
		}
		else if(me.getSource().equals(btnNo))
		{
			btnNo.setBackground(Color.yellow);
			btnNo.setForeground(Color.black);
		}
		else{}
	}
	
		public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(btnYes))
		{
			btnYes.setForeground(Color.black);
			btnYes.setBackground(Color.white);
		}
		else if(me.getSource().equals(btnNo))
		{
			btnNo.setBackground(Color.RED);
			btnNo.setBackground(Color.white);	
			Random rV = new Random();
			ran1 = rV.nextInt(500);
			ran2 = rV.nextInt(500);
			this.a = ran1 ;
			this.b = ran2;
			btnNo.setBounds(a, b, 80, 30);
			
		
		}
		else{}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnYes.getText()))
		{
			
			NextGui ng = new NextGui(this);
			ng.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(btnNo.getText()))
		{
			NextGui2 ng2 = new NextGui2(this);
			ng2.setVisible(true);
			this.setVisible(false);
		}
		else{
			
		}
		
	}

	
}