package nl.hanze.designpatterns.views;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import nl.hanze.designpatterns.stocks.Stock;

public class TextView extends JPanel implements View {
	private static final long serialVersionUID = 1L;
	private JTextPane textPane;
	
	public TextView() {
		textPane = new JTextPane();
		textPane.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(250, 145));
		scrollPane.setMinimumSize(new Dimension(10, 10));
		
		this.add(scrollPane);
	}
	
	public void update(Stock stock) {
		String text = textPane.getText();
		text += stock.getName() + ": " + stock.getPrice() + "\n";
		System.out.println(text);
		textPane.setText(text);
	}

}
