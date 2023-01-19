package JavaProgramForSelenium;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class JavaSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		JButton b=new JButton("Browse");
		b.setBounds(100,100,95,30);
		frame.add(b);
		frame.setLayout(null);
		frame.setSize(800,700);
		frame.setVisible(true);
		frame.setBackground(Color.WHITE);
		JFileChooser filechooser=new JFileChooser(FileSystemView.getFileSystemView());
		filechooser.showSaveDialog(filechooser);
		FileNameExtensionFilter restriction=new FileNameExtensionFilter("Text File", "txt");
		filechooser.addChoosableFileFilter(restriction);
		filechooser.setMultiSelectionEnabled(true);
		//filechooser.showOpenDialog(null);

	}

}
