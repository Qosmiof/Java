package org.qosmiof2.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.qosmiof2.grades.Ocene;
import org.qosmiof2.gui.Gui;

/**
 * @author Qosmiof2
 * 
 */

public class Main {

	public static void main(String[] args) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
		}

		File file2 = new File("C:/Ocene");
		if(!file2.exists()){
			new File("C:/Ocene(Ne briši!! Za program)").mkdir();
		}
		
		File file = new File("C:/Ocene(Ne briši!! Za program)/Ocene.txt");
		if (!file.exists()) {
			new File("C:/Ocene(Ne briši!! Za program)/Ocene.txt");
		}

		try {
			File file1 = new File("C:/Ocene(Ne briši!! Za program)/Ocene.txt");
			if (file1.exists()) {
				FileReader fr = new FileReader(file1);
				BufferedReader br = new BufferedReader(fr);

				Ocene.Slovenšèina.setOcena("" + br.readLine().toString());
				Ocene.Matematika.setOcena("" + br.readLine().toString());
				Ocene.Zgodovina.setOcena("" + br.readLine().toString());
				Ocene.Anglešèina.setOcena("" + br.readLine().toString());
				Ocene.Nemšèina.setOcena("" + br.readLine().toString());
				Ocene.Glasba.setOcena("" + br.readLine().toString());
				Ocene.Likovna.setOcena("" + br.readLine().toString());
				Ocene.Športna.setOcena("" + br.readLine().toString());
				Ocene.Fizika.setOcena("" + br.readLine().toString());
				Ocene.Biologija.setOcena("" + br.readLine().toString());
				Ocene.Geografija.setOcena("" + br.readLine().toString());
				br.close();
			}
		} catch (Exception e) {
		}

		Gui.Gui();

	}
}
