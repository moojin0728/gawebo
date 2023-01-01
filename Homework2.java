package homework;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Homework2 extends JFrame {
	Container contentPane;
	JPanel b;
	JPanel under;
	JPanel user;
	JPanel pc;
	JButton Gawe = new JButton("");
	JButton Muk = new JButton("");
	JButton Bo = new JButton("");
	JLabel User;
	JLabel Pc;
	
	JLabel testgawe;
	JLabel testmuk;
	JLabel testbo;
	JLabel testgawepc;
	JLabel testmukpc;
	JLabel testbopc;
	
	JLabel win;
	JLabel draw;
	JLabel lose;
	JLabel reasult;
	int usernumber;
	int pcnumber;
	Homework2() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		under = new JPanel();
		under.setBackground(Color.GREEN);
		under.setOpaque(true);
		reasult = new JLabel("결과 : ");
		reasult.setFont(new Font("",Font.CENTER_BASELINE,25));
		reasult.setForeground(Color.RED);
		win = new JLabel("WoW! 이겼습니다.");
		win.setFont(new Font("",Font.CENTER_BASELINE,25));
		win.setForeground(Color.RED);
		draw = new JLabel("비겼습니다.");
		draw.setFont(new Font("",Font.CENTER_BASELINE,25));
		draw.setForeground(Color.RED);
		lose = new JLabel("헉! 졌습니다.");
		lose.setFont(new Font("",Font.CENTER_BASELINE,25));
		lose.setForeground(Color.RED);
		under.add(reasult);
		under.add(win);
		under.add(lose);
		under.add(draw);
		win.setVisible(false);
		draw.setVisible(false);
		lose.setVisible(false);
		
		
		JPanel t = new JPanel();
		t.setLayout(new FlowLayout());
		GridLayout top = new GridLayout(1,3);
		top.setHgap(30);
		top.setVgap(50);
		b = new JPanel();
		b.setLayout(top);
		b.setBackground(new Color(255,255,204));
		Gawe.setBackground(Color.WHITE);
		JLabel gawe = new JLabel("     가 위     ");
		gawe.setFont(new Font("",Font.BOLD,13));
		gawe.setForeground(Color.MAGENTA);
		Gawe.add(gawe);
		JLabel muk = new JLabel("     바 위     ");
		muk.setFont(new Font("",Font.BOLD,13));
		muk.setForeground(Color.GREEN);
		Muk.add(muk);
		Muk.setBackground(Color.WHITE);
		JLabel bo = new JLabel("       보     ");
		bo.setFont(new Font("",Font.BOLD,13));
		bo.setForeground(Color.BLUE);
		Bo.setBackground(Color.WHITE);
		Bo.add(bo);
		b.add(Gawe);
		b.add(Muk);
		b.add(Bo);
		t.add(b);
		
		GridLayout center = new GridLayout(3,3);
		center.setHgap(0);
		center.setVgap(0);
		JPanel C = new JPanel();
		C.setLayout(center);
		JLabel L1 = new JLabel("      당신의 선택");
		L1.setForeground(Color.BLUE);
		L1.setFont(new Font("",Font.BOLD,22));
		C.add(L1);
		JLabel L2 = new JLabel("    ");
		C.add(L2);
		JLabel L3 = new JLabel("COMPUTER");
		L3.setForeground(Color.RED);
		L3.setFont(new Font("",Font.BOLD,18));
		C.add(L3);
		JLabel L4 = new JLabel("    ");
		C.add(L4);
		JLabel L5 = new JLabel("   Vs");
		L5.setForeground(Color.BLACK);
		L5.setFont(new Font("",Font.BOLD,40));
		C.add(L5);
		JLabel L6 = new JLabel("      ");
		C.add(L6);
		User = new JLabel("시작전");
		User.setForeground(Color.BLUE);
		User.setFont(new Font("",Font.BOLD,30));
		
		user = new JPanel();
		user.setLayout(new FlowLayout());
		user.setBackground(new Color(255,255,204));
		user.add(User);
		user.setSize(100,100);
		
		ImageIcon imageIcongawe = new ImageIcon("C:\\Users\\김무진\\Documents\\gawe.png");
		Image scaleImagegawe = imageIcongawe.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon imageIcongawe2 = new ImageIcon(scaleImagegawe);
		testgawe = new JLabel(imageIcongawe2);
		testgawe.setSize(20,20);
		user.add(testgawe);
		testgawe.setVisible(false);
		
		ImageIcon imageIconmuk = new ImageIcon("C:\\Users\\김무진\\Documents\\muk.png");
		Image scaleImagemuk = imageIconmuk.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon imageIconmuk2 = new ImageIcon(scaleImagemuk);
		testmuk = new JLabel(imageIconmuk2);
		testmuk.setSize(20,20);
		user.add(testmuk);
		testmuk.setVisible(false);
		
		ImageIcon imageIconbo = new ImageIcon("C:\\Users\\김무진\\Documents\\bo.png");
		Image scaleImagebo = imageIconbo.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon imageIconbo2 = new ImageIcon(scaleImagebo);
		testbo = new JLabel(imageIconbo2);
		testbo.setSize(20,20);
		user.add(testbo);
		testbo.setVisible(false);
		
		C.add(user);
		
		Pc = new JLabel("시작전");
		Pc.setForeground(Color.RED);
		Pc.setFont(new Font("",Font.BOLD,30));
		pc = new JPanel();
		pc.add(Pc);
		pc.setBackground(new Color(255,255,204));
		JLabel L8 = new JLabel("      ");
		
		ImageIcon imageIcongawepc = new ImageIcon("C:\\Users\\김무진\\Documents\\gawe.png");
		Image scaleImagegawepc = imageIcongawepc.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon imageIcongawepc2 = new ImageIcon(scaleImagegawepc);
		testgawepc = new JLabel(imageIcongawepc2);
		testgawepc.setSize(20,20);
		pc.add(testgawepc);
		testgawepc.setVisible(false);
		
		ImageIcon imageIconmukpc = new ImageIcon("C:\\Users\\김무진\\Documents\\muk.png");
		Image scaleImagemukpc = imageIconmukpc.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon imageIconmukepc2 = new ImageIcon(scaleImagemukpc);
		testmukpc = new JLabel(imageIconmukepc2);
		testmukpc.setSize(20,20);
		pc.add(testmukpc);
		testmukpc.setVisible(false);
		
		ImageIcon imageIconbopc = new ImageIcon("C:\\Users\\김무진\\Documents\\bo.png");
		Image scaleImagebopc = imageIconbopc.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon imageIconb0pc2 = new ImageIcon(scaleImagebopc);
		testbopc = new JLabel(imageIconb0pc2);
		testbopc.setSize(20,20);
		pc.add(testbopc);
		testbopc.setVisible(false);
		
		C.add(L8);
		C.add(pc);
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(5,5));
		t.setBackground(new Color(255,255,204));
		C.setBackground(new Color(255,255,204));
		contentPane.setBackground(new Color(255,255,204));
		contentPane.add(under,BorderLayout.SOUTH);
		contentPane.add(t,BorderLayout.NORTH);
		contentPane.add(C,BorderLayout.CENTER);
		
		Gawe.addMouseListener(new GaweClick());
		Muk.addMouseListener(new MukClick());
		Bo.addMouseListener(new BoClick());
		setSize(500,500);
		setVisible(true);
		
		
	}
	class GaweClick implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			//MyPanelGawe panel = new MyPanelGawe();
			User.setVisible(false);
			testbo.setVisible(false);
			testmuk.setVisible(false);
			testgawe.setVisible(true);
			usernumber = 0;
			computer();	
		}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	class MukClick implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			User.setVisible(false);
			testgawe.setVisible(false);
			testbo.setVisible(false);
			testmuk.setVisible(true);
			usernumber = 1;
			computer();
		}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	class BoClick implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			User.setVisible(false);
			testgawe.setVisible(false);
			testmuk.setVisible(false);
			testbo.setVisible(true);
			usernumber = 2;
			computer();
		}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	public void computer() {
		//랜덤으로 가위바위보
		//UI 표시 
		//사용자랑 이겼는지
		//UI 표시
		pcnumber = (int)(Math.random()*3);
		if(pcnumber == 0)
		{
			Pc.setVisible(false);
			testmukpc.setVisible(false);
			testbopc.setVisible(false);
			testgawepc.setVisible(true);
		}
		else if(pcnumber == 1)
		{
			Pc.setVisible(false);
			testbopc.setVisible(false);
			testgawepc.setVisible(false);
			testmukpc.setVisible(true);
		}
		else
		{
			Pc.setVisible(false);
			testgawepc.setVisible(false);
			testmukpc.setVisible(false);
			testbopc.setVisible(true);
		}
		winner();
	}
	public void winner() {
		if(usernumber==pcnumber)
		{
			win.setVisible(false);
			lose.setVisible(false);
			draw.setVisible(true);
			return ;
		}
		if(usernumber == 0)
		{
			if(pcnumber==1)
			{
				win.setVisible(false);
				lose.setVisible(true);
				draw.setVisible(false);
				return ;
			}
			else
			{
				win.setVisible(true);
				lose.setVisible(false);
				draw.setVisible(false);
				return ;
			}
		}
		else if(usernumber == 1)
		{
			if(pcnumber==0)
			{
				win.setVisible(true);
				lose.setVisible(false);
				draw.setVisible(false);
				return ;
			}
			else
			{
				win.setVisible(false);
				lose.setVisible(true);
				draw.setVisible(false);
				return ;
			}
		}
		else if(usernumber == 2)
		{
			if(pcnumber==1)
			{
				win.setVisible(true);
				lose.setVisible(false);
				draw.setVisible(false);
				return ;
			}
			else
			{
				win.setVisible(false);
				lose.setVisible(true);
				draw.setVisible(false);
				return ;
			}
		}
	}
	
	public static void main(String[] args) {
		new Homework2();
	}
}
