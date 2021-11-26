package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;

public class ver {

	private JFrame frmOrlog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ver window = new ver();
					window.frmOrlog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOrlog = new JFrame();
		frmOrlog.setIconImage(Toolkit.getDefaultToolkit().getImage(ver.class.getResource("/view/assassins-logo-02.png")));
		frmOrlog.setTitle("Orlog");
		frmOrlog.setBounds(100, 100, 687, 454);
		frmOrlog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOrlog.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("");
		b1.setBackground(Color.ORANGE);
		b1.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-ArrowOrlog.png")));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(false);
			}
		});
		b1.setBounds(10, 344, 60, 60);
		frmOrlog.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(false);
			}
		});
		b2.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-AxeOrlog.png")));
		b2.setBackground(Color.ORANGE);
		b2.setBounds(80, 344, 60, 60);
		frmOrlog.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setEnabled(false);
			}
		});
		b3.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-HelmetOrlog.png")));
		b3.setBackground(Color.ORANGE);
		b3.setBounds(150, 344, 60, 60);
		frmOrlog.getContentPane().add(b3);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4.setEnabled(false);
			}
		});
		b4.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-ShieldOrlog.png")));
		b4.setBackground(Color.ORANGE);
		b4.setBounds(220, 344, 60, 60);
		frmOrlog.getContentPane().add(b4);
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5.setEnabled(false);
			}
		});
		b5.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-StealFavorOrlog.png")));
		b5.setBackground(Color.ORANGE);
		b5.setBounds(290, 344, 60, 60);
		frmOrlog.getContentPane().add(b5);
		
		JButton a1 = new JButton("");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setEnabled(false);
			}
		});
		a1.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-ShieldOrlog.png")));
		a1.setBackground(Color.ORANGE);
		a1.setBounds(290, 11, 60, 60);
		frmOrlog.getContentPane().add(a1);
		
		JButton a2 = new JButton("");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a2.setEnabled(false);
			}
		});
		a2.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-StealFavorOrlog.png")));
		a2.setBackground(Color.ORANGE);
		a2.setBounds(220, 11, 60, 60);
		frmOrlog.getContentPane().add(a2);
		
		JButton a3 = new JButton("");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a3.setEnabled(false);
			}
		});
		a3.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-AxeOrlog.png")));
		a3.setBackground(Color.ORANGE);
		a3.setBounds(150, 11, 60, 60);
		frmOrlog.getContentPane().add(a3);
		
		JButton a4 = new JButton("");
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a4.setEnabled(false);
			}
		});
		a4.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-AxeOrlog.png")));
		a4.setBackground(Color.ORANGE);
		a4.setBounds(80, 11, 60, 60);
		frmOrlog.getContentPane().add(a4);
		
		JButton a5 = new JButton("");
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a5.setEnabled(false);
			}
		});
		a5.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-ArrowOrlog.png")));
		a5.setBackground(Color.ORANGE);
		a5.setBounds(10, 11, 60, 60);
		frmOrlog.getContentPane().add(a5);
		
		JLabel vida1 = new JLabel("");
		vida1.setIcon(new ImageIcon(ver.class.getResource("/view/output-onlinepngtools.png")));
		vida1.setBounds(422, 364, 40, 40);
		frmOrlog.getContentPane().add(vida1);
		
		JTextPane contVida1 = new JTextPane();
		contVida1.setFont(new Font("Ink Free", Font.BOLD, 15));
		contVida1.setBackground(SystemColor.menu);
		contVida1.setEditable(false);
		contVida1.setText("30");
		contVida1.setBounds(427, 344, 40, 20);
		frmOrlog.getContentPane().add(contVida1);
		
		JLabel vida2 = new JLabel("");
		vida2.setIcon(new ImageIcon(ver.class.getResource("/view/output-onlinepngtools.png")));
		vida2.setBounds(422, 11, 40, 40);
		frmOrlog.getContentPane().add(vida2);
		
		JTextPane contVida2 = new JTextPane();
		contVida2.setText("22");
		contVida2.setFont(new Font("Ink Free", Font.BOLD, 15));
		contVida2.setEditable(false);
		contVida2.setBackground(SystemColor.menu);
		contVida2.setBounds(430, 45, 40, 20);
		frmOrlog.getContentPane().add(contVida2);
		
		JTextPane poder1 = new JTextPane();
		poder1.setText("8");
		poder1.setFont(new Font("Ink Free", Font.BOLD, 15));
		poder1.setEditable(false);
		poder1.setBackground(SystemColor.menu);
		poder1.setBounds(470, 277, 22, 20);
		frmOrlog.getContentPane().add(poder1);
		
		JButton bp1 = new JButton("4\u2318: 2 dano");
		bp1.setBounds(476, 381, 100, 23);
		frmOrlog.getContentPane().add(bp1);
		
		JButton bp2 = new JButton("8\u2318: 5 dano");
		bp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bp2.setBounds(476, 355, 100, 23);
		frmOrlog.getContentPane().add(bp2);
		
		JButton bp3 = new JButton("12\u2318: 8 dano");
		bp3.setEnabled(false);
		bp3.setBounds(476, 329, 100, 23);
		frmOrlog.getContentPane().add(bp3);
		
		JTextPane poder2 = new JTextPane();
		poder2.setText("5");
		poder2.setFont(new Font("Ink Free", Font.BOLD, 15));
		poder2.setEditable(false);
		poder2.setBackground(SystemColor.menu);
		poder2.setBounds(470, 116, 16, 20);
		frmOrlog.getContentPane().add(poder2);
		
		JButton ap1 = new JButton("4\u2318: 2 dano");
		ap1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pdd = Integer.parseInt(poder2.getText());
				if (pdd >= 4) {
					poder2.setText(""+(pdd-4));
					contVida1.setText(""+(Integer.parseInt(contVida1.getText())-4));
				}
			}
		});
		ap1.setBounds(476, 11, 100, 23);
		frmOrlog.getContentPane().add(ap1);
		
		JButton ap2 = new JButton("8\u2318: 5 dano");
		ap2.setEnabled(false);
		ap2.setBounds(476, 37, 100, 23);
		frmOrlog.getContentPane().add(ap2);
		
		JButton ap3 = new JButton("12\u2318: 8 dano");
		ap3.setEnabled(false);
		ap3.setBounds(476, 63, 100, 23);
		frmOrlog.getContentPane().add(ap3);
		
		JLabel icon1 = new JLabel("New label");
		icon1.setIcon(new ImageIcon(ver.class.getResource("/view/output-onlinepngtools (2).png")));
		icon1.setBounds(581, 15, 80, 146);
		frmOrlog.getContentPane().add(icon1);
		
		JLabel icon2 = new JLabel("New label");
		icon2.setIcon(new ImageIcon(ver.class.getResource("/view/output-onlinepngtools (2).png")));
		icon2.setBounds(581, 258, 80, 146);
		frmOrlog.getContentPane().add(icon2);
		
		JLabel icon3 = new JLabel("New label");
		icon3.setIcon(new ImageIcon(ver.class.getResource("/view/output-onlinepngtools (1).png")));
		icon3.setBounds(496, 101, 60, 60);
		frmOrlog.getContentPane().add(icon3);
		
		JLabel icon4 = new JLabel("New label");
		icon4.setIcon(new ImageIcon(ver.class.getResource("/view/output-onlinepngtools (1).png")));
		icon4.setBounds(496, 258, 60, 60);
		frmOrlog.getContentPane().add(icon4);
		
		JButton prontob = new JButton("Pronto");
		prontob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		prontob.setBounds(162, 293, 118, 40);
		frmOrlog.getContentPane().add(prontob);
		
		JButton prontoa = new JButton("Pronto");
		prontoa.setBounds(162, 82, 118, 40);
		frmOrlog.getContentPane().add(prontoa);
		
		JTextPane ContadorRound = new JTextPane();
		ContadorRound.setText("3");
		ContadorRound.setFont(new Font("Ink Free", Font.BOLD, 15));
		ContadorRound.setEditable(false);
		ContadorRound.setBackground(SystemColor.menu);
		ContadorRound.setBounds(256, 197, 39, 34);
		frmOrlog.getContentPane().add(ContadorRound);
		
		JTextPane palavra = new JTextPane();
		palavra.setText("Rodada");
		palavra.setFont(new Font("MV Boli", Font.BOLD, 22));
		palavra.setEditable(false);
		palavra.setBackground(SystemColor.menu);
		palavra.setBounds(150, 186, 89, 40);
		frmOrlog.getContentPane().add(palavra);
		
		JButton b6 = new JButton("");
		b6.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-AxeOrlog.png")));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6.setEnabled(false);
			}
		});
		b6.setSelectedIcon(new ImageIcon(ver.class.getResource("/view/ACV-ArrowOrlog.png")));
		b6.setBackground(Color.ORANGE);
		b6.setBounds(360, 344, 60, 60);
		frmOrlog.getContentPane().add(b6);
		
		JButton a6 = new JButton("");
		a6.setIcon(new ImageIcon(ver.class.getResource("/view/ACV-AxeOrlog.png")));
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a6.setEnabled(false);
			}
		});
		a6.setBackground(Color.ORANGE);
		a6.setBounds(360, 11, 60, 60);
		frmOrlog.getContentPane().add(a6);
		
		JTextPane P1 = new JTextPane();
		P1.setForeground(Color.BLUE);
		P1.setText("P1");
		P1.setFont(new Font("MV Boli", Font.BOLD, 22));
		P1.setEditable(false);
		P1.setBackground(SystemColor.menu);
		P1.setBounds(10, 293, 89, 40);
		frmOrlog.getContentPane().add(P1);
		
		JTextPane P2 = new JTextPane();
		P2.setText("P2");
		P2.setFont(new Font("MV Boli", Font.BOLD, 22));
		P2.setEditable(false);
		P2.setBackground(SystemColor.menu);
		P2.setBounds(10, 82, 89, 40);
		frmOrlog.getContentPane().add(P2);
	}
}
