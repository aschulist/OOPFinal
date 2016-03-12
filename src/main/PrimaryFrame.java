package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;

import javax.swing.JFrame;
//import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PrimaryFrame extends JFrame {

	private static final long serialVersionUID = 7864765209266502318L;
	private Button b, confirm;
	private TextArea bD, d, racialTrait;
	private GetInfo information;
	private JTextField name, nInfo;
	private boolean wasConfirmed = false;
	private boolean canConfirm = false;
	private String racialTraits;

	public PrimaryFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		name = new JTextField();
		name.setBounds(100, 0, 800, 40);
		name.setBackground(Color.WHITE);
		name.setEditable(false);
		name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			private void updateLabel(DocumentEvent e) {
				name.setText(name.getText());
			}
		});
		this.add(name);
		nInfo = new JTextField();
		nInfo.setBounds(0, 0, 100, 40);
		nInfo.setBackground(Color.WHITE);
		nInfo.setEditable(false);
		this.add(nInfo);
		b = new Button("Get Information");// creating instance of JButton
		b.setBounds(0, 80, 100, 40);// x axis, y axis, width, height
		b.addActionListener(new MyButtonListener());
		this.add(b);// adding button in JFrame
		confirm = new Button("Confirm Race");
		confirm.setBounds(0, 120, 100, 40);
		confirm.addActionListener(new ConfirmButton());
		this.add(confirm);

		bD = new TextArea();
		bD.setEditable(false);
		bD.setBounds(100, 40, 800, 100);
		bD.setBackground(Color.WHITE);
		bD.setText("This will display basic info on the selected race.");
		
		d = new TextArea();
		d.setEditable(false);
		d.setBounds(100, 140, 800, 300);
		d.setBackground(Color.WHITE);
		d.setText("Click the button for more information on the selected race.");
		
		racialTrait = new TextArea();
		racialTrait.setEditable(false);
		racialTrait.setBounds(558, 440, 380, 440);
		racialTrait.setBackground(Color.WHITE);
		racialTrait.setText("Click the button for more information on the selected race's traits.");

		this.add(bD);
		this.add(d);
		this.add(racialTrait);
		this.setSize(960, 1040);// 400 width and 500 height
		this.setLayout(null);// using no layout managers (not recommended for
								// standard swing, but useful for our purposes
								// in CSC150
		this.setVisible(true);// making the frame visible

	}

	public String getNameInfo() {
		String name = this.name.getText();
		return name;
	}

	public boolean getWasConfirmed() {
		return wasConfirmed;
	}

	public void setInfo(GetInfo i) {
		information = i;
		if (information != null) {
			bD.setText(information.getBasicDescription());
		}
	}

	public void resetWasConfirmed() {
		wasConfirmed = false;
		canConfirm = false;
	}
	
	public void setRacialTraits(String s){
		racialTraits = s;
	}

	private class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button clicked, inner class: " + LocalDateTime.now());
			d.setText(information.getDescription());
			racialTrait.setText(racialTraits);
		}
	}

	private class ConfirmButton implements ActionListener {

		private int buttonPos = 0;

		private void buttonMovement() {
			wasConfirmed = true;
			switch (buttonPos) {
			case 0:
				buttonPos++;
				racialTrait.setText(racialTraits);
				d.setText("Click the button for more information on the selected class.");
				b.setLocation(b.getX(), (b.getY() + 40));
				confirm.setLocation(confirm.getX(), (confirm.getY() + 40));
				confirm.setLabel("Confirm Class");
				break;
			case 1:
				buttonPos++;
				d.setText("Click the button for more information on stats.");
				b.setLocation(b.getX(), (b.getY() + 240));
				confirm.setLocation(confirm.getX(), (confirm.getY() + 240));
				confirm.setLabel("Confirm Stats");
				racialTrait.setLocation(558, (racialTrait.getY()) + 120);
				break;
			case 2:
				buttonPos++;
				d.setText("Click the button for more information about names.");
				nInfo.setText("Enter Name ---->");
				name.setEditable(true);
				b.setLocation(b.getX(), (b.getY() + 40));
				confirm.setLocation(0, (confirm.getY() + 40));
				confirm.setLabel("Name & Gender");
				break;
			case 3:
				d.setText("Click the button for more information on age, height, and weight.");
				confirm.setLabel("Confirm Details");
				name.setEditable(false);
				break;
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (canConfirm) {
				buttonMovement();
			}
		}
	}

	public void setCanConfirm(boolean canConfirm) {
		this.canConfirm = canConfirm;
	}

	public void paint(Graphics g) {
		super.paint(g);
	}
}
