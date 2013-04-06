package dulw;

import java.awt.Insets;
import java.util.Locale;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DialogWindow extends JDialog {

	private static final long serialVersionUID = 3281903318456907432L;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 600;

	
	public DialogWindow(JFrame owner, SignalWrapper wrapper) {
		this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Typ sygna³u: " + wrapper.getSignalType() + "\n");
		buffer.append("Rodzaj wartoœci: " + wrapper.getValuesType() + "\n");
		buffer.append("Czêstotliwoœæ próbkowania: " + wrapper.getSimplingFrequency() + "Hz\n");
		buffer.append("Amplituda: " + wrapper.getA() + "\n");
		buffer.append("Czas pocz¹tkowy: " + wrapper.getT1() + "\n");
		buffer.append("Czas trwania: " + wrapper.getD() + "\n");
		buffer.append("\n");
		buffer.append("\tDANE:\n");
		for(double[] d : wrapper.getData()){
			//TODO WARONEK DLA UROJONYCH
			buffer.append(String.format(Locale.ENGLISH, "%.3f", d[0]) + "\t\t" +
					String.format(Locale.ENGLISH, "%.3f", d[1]) + "\n");
		}
		JTextArea textArea = new JTextArea();
		textArea.setMargin(new Insets(10, 10, 10, 10));
		textArea.setText(buffer.toString());
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		this.add(scrollPane);
	}
	
}
