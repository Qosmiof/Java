package org.qosmiof2.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.qosmiof2.grades.Ocene;

public class GuiDodajOcene {

	static JFrame frame1 = new JFrame("Dodaj oceno");
	static JButton button1 = new JButton();
	static JPanel panel1 = new JPanel();
	static JComboBox<Ocene> cb = new JComboBox<>(Ocene.values());
	static JComboBox cb1 = new JComboBox();

	public static void GuiDodajOceno() {

		frame1.setBounds(600, 100, 240, 150);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		frame1.add(panel1);

		panel1.setLayout(null);
		panel1.add(button1);
		panel1.add(cb);
		panel1.add(cb1);

		cb1.addItem("5");
		cb1.addItem("4");
		cb1.addItem("3");
		cb1.addItem("2");
		cb1.addItem("1");
		cb1.setBounds(145, 10, 50, 50);

		cb.setBounds(10, 10, 100, 50);
		button1.setBounds(60, 70, 100, 30);
		button1.setText("Dodaj");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String ocena;
				String selected = cb.getSelectedItem().toString();
				int stevilka = Integer.parseInt(cb1.getSelectedItem().toString());
				
				if (selected.equals("Slovenšèina")) {
					ocena = Ocene.Slovenšèina.getOcena();
					Ocene.Slovenšèina.setOcena(ocena + stevilka + ", ");
					
				} else if (selected.equals("Matematika")) {
					ocena = Ocene.Matematika.getOcena();
					Ocene.Matematika.setOcena(Ocene.Matematika.getOcena() +  stevilka + ", ");

				} else if (selected.equals("Zgodovina")) {
					Ocene.Zgodovina.setOcena(Ocene.Zgodovina.getOcena()
							+ stevilka + ", ");
				} else if (selected.equals("Anglešèina")) {
					Ocene.Anglešèina.setOcena(Ocene.Anglešèina.getOcena()
							+ stevilka + ", ");
				} else if (selected.equals("Nemšèina")) {
					Ocene.Nemšèina.setOcena(Ocene.Nemšèina.getOcena()
							+ stevilka + ", ");
				} else if (selected.equals("Likovna")) {
					Ocene.Likovna.setOcena(Ocene.Likovna.getOcena()
							+ stevilka + ", ");
				} else if (selected.equals("Glasba")) {
					Ocene.Glasba.setOcena(Ocene.Glasba.getOcena() + stevilka
							+ ", ");
				} else if (selected.equals("Športna")) {
					Ocene.Športna.setOcena(Ocene.Športna.getOcena() + stevilka
							+ ", ");
				} else if (selected.equals("Fizika")) {
					Ocene.Fizika.setOcena(Ocene.Fizika.getOcena() + stevilka
							+ ", ");
				} 
				else if (selected.equals("Biologija")) {
					Ocene.Biologija.setOcena(Ocene.Biologija.getOcena() + stevilka
							+ ", ");
				} else {  
					Ocene.Geografija.setOcena(Ocene.Geografija.getOcena() + stevilka
							+ ", ");
				} 
				

				Gui.label.setText("Slovenšèina: "
						+ Ocene.Slovenšèina.getOcena());
				Gui.label.setBounds(10, 10, 500, 20);

				Gui.label1.setText("Matematika: " + Ocene.Matematika.getOcena());
				Gui.label1.setBounds(10, 30, 500, 20);

				Gui.label2.setText("Zgodovina: " + Ocene.Zgodovina.getOcena());
				Gui.label2.setBounds(10, 50, 500, 20);

				Gui.label3.setText("Anglešèina: " + Ocene.Anglešèina.getOcena());
				Gui.label3.setBounds(10, 70, 500, 20);

				Gui.label4.setText("Nemšèina: " + Ocene.Nemšèina.getOcena());
				Gui.label4.setBounds(10, 90, 500, 20);

				Gui.label5.setText("Glasba: " + Ocene.Glasba.getOcena());
				Gui.label5.setBounds(10, 110, 500, 20);

				Gui.label6.setText("Likovna: " + Ocene.Likovna.getOcena());
				Gui.label6.setBounds(10, 130, 500, 20);

				Gui.label7.setText("Športna: " + Ocene.Športna.getOcena());
				Gui.label7.setBounds(10, 150, 500, 20);

				Gui.label8.setText("Fizika: " + Ocene.Fizika.getOcena());
				Gui.label8.setBounds(10, 170, 500, 20);

				Gui.label9.setText("Biologija: " + Ocene.Biologija.getOcena());
				Gui.label9.setBounds(10, 190, 500, 20);

				Gui.label10.setText("Geografija: "
						+ Ocene.Geografija.getOcena());
				Gui.label10.setBounds(10, 210, 500, 20);

			}

		});

	}
}
