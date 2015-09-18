package nl.hanze.designpatterns.views;

import java.awt.Dimension;

import javax.swing.JPanel;

import nl.hanze.designpatterns.stocks.Stock;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraphView extends JPanel implements View {
	private static final long serialVersionUID = 1L;
	private DefaultCategoryDataset dataset;
	private JFreeChart lineChart;
	private int n;
	
	public GraphView() {
		dataset = new DefaultCategoryDataset();		
		
		lineChart = ChartFactory.createLineChart(
		         "Stock Values",
		         "Time","Value",
		         dataset,
		         PlotOrientation.VERTICAL,
		         false,false,false);
		lineChart.setAntiAlias(true);
		
		
		ChartPanel chartPanel = new ChartPanel(lineChart) {
            private static final long serialVersionUID = 1L;

			@Override
            public Dimension getPreferredSize() {
                return new Dimension(600, 300);
            }
        };
		
        this.add(chartPanel);
	}
	
	public void update(Stock stock) {
		dataset.addValue(stock.getPrice(), stock.getName(), Integer.toString(++n));
	}
}
