package Ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTrabajador extends JFrame implements ActionListener {

	private JButton botLeer;

	public GuiTrabajador() {
		botLeer = new JButton("Leer");
		botLeer.addActionListener(this);
		add(botLeer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
