package nl.hanze.designpatterns.views;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import nl.hanze.designpatterns.stocks.Stock;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class GraphView extends JPanel implements View {
	private static final long serialVersionUID = 1L;
	private TimeSeriesCollection dataset;
	private JFreeChart lineChart;
	private Map<Class<?>, TimeSeries> series;
	
	public GraphView() {
		series = new HashMap<Class<?>, TimeSeries>();
		dataset = new TimeSeriesCollection();		
		
		lineChart = ChartFactory.createTimeSeriesChart(
		         "Stock Values",
		         "Time",
		         "Value",
		         dataset,
		         true,
		         true,
		         false);
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
	
	public synchronized void update(Stock stock) {
		TimeSeries ts = series.get(stock.getClass());
		
		if(ts == null) {
			ts = new TimeSeries(stock.getName());
			series.put(stock.getClass(), ts);
			dataset.addSeries(ts);
		}
		
		ts.add(new Second(), stock.getPrice());
	}
}
