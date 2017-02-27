package album;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
 

public class photoalbum {

	
	 
	private JFrame frmAlbum;
    static private JFileChooser fc=new JFileChooser();
	boolean flag=false;
	static LinkedList<photonew>ph=new LinkedList<photonew>();
		
	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					photoalbum window = new photoalbum();
					window.frmAlbum.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	
	
	
	public photoalbum() {
		initialize();
	}

	
	
	
	
	
	
	
	
	private void initialize() {
		frmAlbum = new JFrame();
		frmAlbum.setTitle("ALBUM");
		frmAlbum.setBounds(100, 100, 402, 366);
		frmAlbum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlbum.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	
		JMenuBar menuBar = new JMenuBar();
		frmAlbum.setJMenuBar(menuBar);
	
		
		JMenuItem mntmUploadPhoto = new JMenuItem("UPLOAD PHOTO");
		mntmUploadPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
	
				
				int m=fc.showOpenDialog(mntmUploadPhoto);
				if(m==JFileChooser.APPROVE_OPTION){
					
					
		
					
					String s=fc.getSelectedFile().getAbsolutePath();
					ImageIcon image=new ImageIcon(s);
			
								
				ph.add(new photonew()); 
				int q= ph.get(0).getphotos();
					
				if(q<10){

					JLabel lbl=new JLabel();
					JLabel lbl1=new JLabel();
				    lbl.setIcon(image);
				    lbl1.setIcon(image);
					
					lbl.setBounds(0,0,175,125);
				    
					
					lbl1.setBounds(0,0,260,178);
					
					lbl.setHorizontalAlignment(JLabel.CENTER);
					lbl1.setHorizontalAlignment(JLabel.CENTER);
					
				   ph.get(q).setname(s);
					
				   ph.get(q).add(lbl);
			
					
				   frmAlbum.getContentPane().add(ph.get(q));
					
					
					
				   ph.get(0).setphotos(q+1); 
					
					flag=false;
					
					title tt=new title();
					
                   tt.method(lbl1);
                   
                    
              
				
					
				}					
				
				
					else{
						
						
						JOptionPane.showMessageDialog(null, "A maximum of only 10 photos can be uploaded");
						
						
					}
				
				
				}
				
				
				
				if(m==JFileChooser.CANCEL_OPTION){
					
					//do nothing
				}
				
				
			  
			}
		});
		menuBar.add(mntmUploadPhoto);
		frmAlbum.getContentPane().setLayout(new GridLayout(3, 4, 0, 0));
	}
		

	
	
	
	
	
	
	
	
	public class title extends JFrame {
	

		private JPanel contentPane;
		private JTextField textFieldtitle=null; 
		private JTextArea textAreaanot=null;
		private JButton btnSave=null;
		private String title="title";
	    private String anot="anot";
	
	    
	    
	    
	    
		
		public String gettitle(){
			
			return title;
			
		}
		
		public void method(JLabel l) {
			
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
					title t=new title();
					t.getContentPane().add(l);
							t.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			
			
		}

		public String getanot(){
			
			return anot;
		}
		
		
		public JTextField gettextfield(){
			
			return textFieldtitle;
		}
		
		public JTextArea gettextarea(){
			
			return textAreaanot;
		}
		
		
		
		
		
		
		
		
		
		public title() {
				addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent arg0) {
						
						if(!flag){
						JLabel lbe = new JLabel("DEFAULT TITLE");
						lbe.setHorizontalAlignment(SwingConstants.CENTER);
						lbe.setBounds(0, 125, 175, 23);
						
						ph.get(ph.get(0).getphotos()-1).add(lbe);
				 		
						JLabel lbs = new JLabel("DEFAULT");
						lbs.setHorizontalAlignment(SwingConstants.CENTER);
						lbs.setBounds(0, 148, 175, 45);
					
						ph.get(ph.get(0).getphotos()-1).add(lbs);
						}
						
					}
				});
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 311, 341);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
		    JLabel lblTitle = new JLabel("Title");
			lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblTitle.setBounds(10, 178, 69, 22);
			contentPane.add(lblTitle);
			
			JLabel lblAnnotation = new JLabel("Annotation");
			lblAnnotation.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblAnnotation.setBounds(10, 234, 93, 29);
			contentPane.add(lblAnnotation);
			
			textFieldtitle = new JTextField();
			textFieldtitle.setText("title");
			
			textFieldtitle.setBounds(114, 182, 181, 20);
			contentPane.add(textFieldtitle);
			textFieldtitle.setColumns(10);
			
		    textAreaanot = new JTextArea();
		    textAreaanot.setText("anot");
			textAreaanot.setBounds(113, 213, 182, 79);
			contentPane.add(textAreaanot);
			
			btnSave = new JButton("save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				
					
					title=textFieldtitle.getText();
					anot=textAreaanot.getText();
				
					if(title.length()<=20&&anot.length()<=100){
					
					
					int m=ph.get(0).getphotos();
							
					JLabel lbt = new JLabel(title);
					lbt.setHorizontalAlignment(SwingConstants.CENTER);
					lbt.setBounds(0, 125, 175, 23);
					 
					ph.get(m-1).add(lbt);
					flag=true;
					
					JLabel lba = new JLabel(anot);
					lba.setHorizontalAlignment(SwingConstants.CENTER);
					lba.setBounds(0, 148, 175, 45);
				
					ph.get(m-1).add(lba);
					
	
					}
					
					else{
						
						
						if(title.length()>20){
						JOptionPane.showMessageDialog(null,"title exceed 20 characters" );}
						
						if(anot.length()>100){
							JOptionPane.showMessageDialog(null,"anotation exceed 100 characters");
						}
						
					}
					
					
					
					
					
					
					
			
				}
			});
			btnSave.setBounds(10, 269, 89, 23);
			contentPane.add(btnSave);
		}
	}

	
	
}
