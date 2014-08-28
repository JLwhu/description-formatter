package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.filechooser.FileNameExtensionFilter;

import IO.TaxonDescriptionTxtIO;

public class DescriptionFormatter {
	protected static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(DescriptionFormatter.class);
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	
	private String inputfilepath;
	private String outputdirpath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DescriptionFormatter window = new DescriptionFormatter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DescriptionFormatter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(25, 32, 245, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Open File");
		btnNewButton.setAction(action);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showOpenDialog(frame);
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"txt Files", "txt");
			//	chooser.setFileFilter(filter);
			//	chooser.setMultiSelectionEnabled(true);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					textField.setText(file.getAbsolutePath());
					inputfilepath = file.getAbsolutePath();
				}
			}
		});
		btnNewButton.setBounds(266, 33, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(25, 71, 245, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOutputPath = new JButton("Output Path");
		btnOutputPath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
				int returnVal = chooser.showOpenDialog(frame);
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"txt Files", "txt");
			//	chooser.setFileFilter(filter);
			//	chooser.setMultiSelectionEnabled(true);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					textField_1.setText(file.getAbsolutePath());
					outputdirpath = file.getAbsolutePath();
				}
			}
		});
		btnOutputPath.setBounds(266, 72, 117, 29);
		frame.getContentPane().add(btnOutputPath);
		
		JButton btnStartFormatting = new JButton("Start Formatting");
		btnStartFormatting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TaxonDescriptionTxtIO taxonio = new TaxonDescriptionTxtIO();
				try {
					taxonio.inputTxtFile(inputfilepath, outputdirpath);
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE); 
					e.printStackTrace();
	                StringWriter sw = new StringWriter();PrintWriter pw = new PrintWriter(sw);e.printStackTrace(pw);
	                LOGGER.error(sw.toString());					
				}
				
			}
		});
		btnStartFormatting.setBounds(90, 111, 155, 29);
		frame.getContentPane().add(btnStartFormatting);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Open File");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
