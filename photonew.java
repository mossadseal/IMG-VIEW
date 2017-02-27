package album;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class photonew extends JPanel {
 
	private String name;
	private static int h=0;
	private JLabel lblTitle=null;
	private JLabel lblAnnotation=null;
	

	
	
	 
	
	
	public JLabel getlbltitle(){
		
		
		return lblTitle;
		
	}
	
	
	public void settitle(String s){
		
		lblTitle.setText(s);
	}
	
	
	
	public JLabel getlblanot(){
		
		
		return lblAnnotation;
		
	}
	
	public String getname(){
		
		return name;
	}
	
	public void setname(String a){
		
		name=a;
		
	}
	
	
    public int getphotos(){
		
		return h;
	}

	
public void setphotos(int a){
		
		h=a;
	}
	
	/**
	 * Create the panel.
	 */
	public photonew() {
		setLayout(null);
		
		JLabel lblTitle = new JLabel("");
		lblTitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String s=name;
				
				ImageIcon im=new ImageIcon(s);
				
				
				frame fr=new frame();
				
				JLabel lbl=new JLabel();
				
				lbl.setHorizontalAlignment(JLabel.CENTER);
				
				lbl.setBounds(0,0,im.getIconWidth(),im.getIconHeight());
				
				lbl.setIcon(im);
				

				fr.setSize(im.getIconWidth(), im.getIconHeight());
				
				fr.getContentPane().add(lbl);
		
				
				fr.setVisible(true);
			}
		});
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 125, 175, 23);
		add(lblTitle);
		
		JLabel lblAnnotation = new JLabel("");
		lblAnnotation.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnnotation.setBounds(0, 148, 175, 45);
		add(lblAnnotation);
		
}
}