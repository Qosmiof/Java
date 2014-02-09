package org.qosmiof2.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.qosmiof2.grades.Ocene;

public class Gui {
	static JFrame frame = new JFrame("Redovalnica");
	static JButton button = new JButton();
	static JButton button1 = new JButton("Poèisti");
	static JPanel panel = new JPanel();
	public static JLabel label, label1, label2, label3, label4, label5, label6,
			label7, label8, label9, label10, label11;

	public static void Gui() {

		label = new JLabel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();

		frame.setVisible(true);
		frame.setBounds(300, 100, 300, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		panel.add(label8);
		panel.add(label9);
		panel.add(label10);
		panel.add(label11);
		panel.add(button);
		panel.add(button1);

		label.setText("Slovenšèina: " + Ocene.Slovenšèina.getOcena());
		label.setBounds(10, 10, 500, 20);

		label1.setText("Matematika: " + Ocene.Matematika.getOcena());
		label1.setBounds(10, 30, 500, 20);

		label2.setText("Zgodovina: " + Ocene.Zgodovina.getOcena());
		label2.setBounds(10, 50, 500, 20);

		label3.setText("Anglešèina: " + Ocene.Anglešèina.getOcena());
		label3.setBounds(10, 70, 500, 20);

		label4.setText("Nemšèina: " + Ocene.Nemšèina.getOcena());
		label4.setBounds(10, 90, 500, 20);

		label5.setText("Glasba: " + Ocene.Glasba.getOcena());
		label5.setBounds(10, 110, 500, 20);

		label6.setText("Likovna: " + Ocene.Glasba.getOcena());
		label6.setBounds(10, 130, 500, 20);

		label7.setText("Športna: " + Ocene.Športna.getOcena());
		label7.setBounds(10, 150, 500, 20);

		label8.setText("Fizika: " + Ocene.Fizika.getOcena());
		label8.setBounds(10, 170, 500, 20);

		label9.setText("Biologija: " + Ocene.Biologija.getOcena());
		label9.setBounds(10, 190, 500, 20);

		label10.setText("Geografija: " + Ocene.Geografija.getOcena());
		label10.setBounds(10, 210, 500, 20);
		
		label11.setText("Kemija: " + Ocene.Kemija.getOcena());
		label11.setBounds(10, 230, 500, 20);

		button.setText("Dodaj oceno!");
		button.setBounds(45, 260, 200, 50);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GuiDodajOcene.GuiDodajOceno();
				//In english it would be: GuiAddGrader.GuiAddGrades();

			}

		});
		button1.setBounds(70, 320, 150,  30);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:/Ocene(Ne briši!! Za program)/Ocene.txt");
					
					FileWriter fr1 = new FileWriter(file);
					BufferedWriter br1 = new BufferedWriter(fr1);

					br1.flush();
					br1.close();
					
					Ocene.Slovenšèina.setOcena("");
					Ocene.Matematika.setOcena("");
					Ocene.Zgodovina.setOcena("");
					Ocene.Anglešèina.setOcena("");
					Ocene.Nemšèina.setOcena("");
					Ocene.Glasba.setOcena("");
					Ocene.Likovna.setOcena("");
					Ocene.Športna.setOcena("");
					Ocene.Fizika.setOcena("");
					Ocene.Biologija.setOcena("");
					Ocene.Geografija.setOcena("");
					
					label.setText("Slovenšèina: " + Ocene.Slovenšèina.getOcena());
					label1.setText("Matematika: " + Ocene.Matematika.getOcena());
					label2.setText("Zgodovina: " + Ocene.Zgodovina.getOcena());
					label3.setText("Anglešèina: " + Ocene.Anglešèina.getOcena());
					label4.setText("Nemšèina: " + Ocene.Nemšèina.getOcena());
					label5.setText("Glasba: " + Ocene.Glasba.getOcena());
					label6.setText("Likovna: " + Ocene.Glasba.getOcena());
					label7.setText("Športna: " + Ocene.Športna.getOcena());
					label8.setText("Fizika: " + Ocene.Fizika.getOcena());
					label9.setText("Biologija: " + Ocene.Biologija.getOcena());
					label10.setText("Geografija: " + Ocene.Geografija.getOcena());
					
				} catch (IOException e1) {
					System.out.println("Error");
				}
				
			}
			
		});

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				try {
					File file = new File("C:/Ocene(Ne briši!! Za program)/Ocene.txt");
					
					FileWriter fr = new FileWriter(file);
					BufferedWriter br = new BufferedWriter(fr);

					br.write("" + Ocene.Slovenšèina.getOcena());
					br.newLine();
					br.write("" + Ocene.Matematika.getOcena());
					br.newLine();
					br.write("" + Ocene.Zgodovina.getOcena());
					br.newLine();
					br.write("" + Ocene.Anglešèina.getOcena());
					br.newLine();
					br.write("" + Ocene.Nemšèina.getOcena());
					br.newLine();
					br.write("" + Ocene.Glasba.getOcena());
					br.newLine();
					br.write("" + Ocene.Likovna.getOcena());
					br.newLine();
					br.write("" + Ocene.Športna.getOcena());
					br.newLine();
					br.write("" + Ocene.Fizika.getOcena());
					br.newLine();
					br.write("" + Ocene.Biologija.getOcena());
					br.newLine();
					br.write("" + Ocene.Geografija.getOcena());
					br.close();
				} catch (IOException e1) {
					System.out.println("Error");
				}
			}
		});
	}
}
