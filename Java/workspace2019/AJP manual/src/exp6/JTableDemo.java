/**
 * 
 */
package exp6;

import java.awt.*;
import javax.swing.*;

/**
 * @author Anmoldeep
 *
 */
public class JTableDemo extends JApplet{
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		final String[] colHeads = { "emp_Name", "emp_id", "emp_salary"};
		
		final Object[][] data = {
				{"Ramesh", "111", "50000" }, 
				{"Sagar", "222", "52000" },
				{"Virag", "333", "40000" },
				{"Amit", "444", "62000" },
				{"Anil", "555", "60000" }
		};
		
		JTable table = new JTable(data, colHeads);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane js = new JScrollPane(table, v, h);
		contentPane.add(js, BorderLayout.CENTER);
	}
}
