package album;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class photo1 extends JPanel {

	/**
	 * Create the panel.
	 */
	
private	JPanel panelpic;
private JLabel lblPic;
private static int h=0;




public JLabel getlabel(){
	
	return lblPic;
}

public void setlabel(ImageIcon a){
	
  lblPic.setIcon(a);;
}





public JPanel getpanel(){
	
	return panelpic;
}
	
	
	public int getphotos(){
		
		return h;
	}
	
public void setphotos(int a){
		
		h=a;
	}
	
	
	public photo1() {
		setLayout(null);
		
	    panelpic = new JPanel();
		panelpic.setBounds(0, 0, 197, 157);
		add(panelpic);
		panelpic.setLayout(null);
		
	    lblPic = new JLabel("pic");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(0, 0, 197, 157);
		panelpic.add(lblPic);
		
		JLabel lblTitle = new JLabel("TITLE");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 158, 197, 29);
		add(lblTitle);
		
		JLabel lblAnnotation = new JLabel("ANNOTATION");
		lblAnnotation.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnnotation.setBounds(0, 190, 197, 65);
		add(lblAnnotation);

	}
}
