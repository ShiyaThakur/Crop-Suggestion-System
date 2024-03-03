
import java.util.*;


import java.sql.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;
public class Register {
public static void main(String args[]) {

		
	
	//REGISTER PAGE
	JFrame RegisterPage = new JFrame();
	RegisterPage.setLayout(null);
	RegisterPage.setBounds(0,0,1000,600);
	Color RegisterBackground= new Color(158,88,26);
	RegisterPage.getContentPane().setBackground(RegisterBackground);
	
	JLabel title = new JLabel("Welcome to EGroww");
	Font FTitle = new Font("Serif", Font.BOLD, 30);
    title.setForeground(Color.white);
	title.setFont(FTitle);
	title.setBounds(350, 40, 500, 25);
	RegisterPage.add(title);
	
	
	JPanel RegPanel = new JPanel();
	RegPanel.setBounds(30,125,480,320);
	RegisterPage.add(RegPanel);
	RegPanel.setLayout(null);
	Color col = new Color(193,122,60);
	RegPanel.setBackground(col);
	
	
	JLabel Register = new JLabel("REGISTRATION");
     Register.setBounds(175, 10, 200, 35);
     Font regFont = new Font("Serif", Font.BOLD, 20);
     Register.setForeground(Color.white);
     Register.setFont(regFont);
     RegPanel.add(Register);
     
     
     JLabel name = new JLabel("Name");
     name.setBounds(50, 60, 100, 20);
     Font textFont = new Font("Serif", Font.PLAIN, 20);
     name.setFont(textFont);
     name.setForeground(Color.white);
     RegPanel.add(name);
     
     JTextField entername = new JTextField();
     entername.setBounds(210, 60 , 200, 20);
     Font enterFont = new Font("Serif" , Font.PLAIN, 15);
     RegPanel.add(entername);
     entername.setBackground(col);
     entername.setForeground(Color.white);
     entername.setFont(enterFont);
     
     
     JLabel Contactno = new JLabel("Contact Number");
     Contactno.setBounds(49, 100, 200, 20);
     Contactno.setFont(textFont);
     Contactno.setForeground(Color.white);
     RegPanel.add(Contactno);
     
     JTextField enterContact = new JTextField();
     enterContact.setBounds(210, 100 , 200, 20);
     RegPanel.add(enterContact);
     enterContact.setBackground(col);
     enterContact.setForeground(Color.white);
     enterContact.setFont(enterFont);
     
     
     JLabel Username = new JLabel("Username");
     Username.setBounds(49, 140, 200, 20);
     Username.setFont(textFont);
     Username.setForeground(Color.white);
     RegPanel.add(Username);
     
     JTextField enterUsername = new JTextField();
     enterUsername.setBounds(210, 140 , 200, 20);
     RegPanel.add(enterUsername);
     enterUsername.setBackground(col);
     enterUsername.setForeground(Color.white);
     enterUsername.setFont(enterFont);
     
     
     JLabel PWord = new JLabel("Password");
     PWord.setBounds(49, 180, 200, 20);
     PWord.setFont(textFont);
     PWord.setForeground(Color.white);
     RegPanel.add(PWord);
     
     JPasswordField enterPword = new JPasswordField();
     enterPword.setBounds(210, 180 , 200, 20);
     RegPanel.add(enterPword);
     enterPword.setBackground(col);
     enterPword.setForeground(Color.white);
     enterPword.setFont(enterFont);
     
     JLabel Pword2 = new JLabel("Confirm Password");
     Pword2.setBounds(49,220,300,20);
     Pword2.setFont(textFont);
     Pword2.setForeground(Color.white);
     RegPanel.add(Pword2);
     
     
     JPasswordField enterPword2 = new JPasswordField();
     enterPword2.setBounds(210, 220 , 200, 20);
     RegPanel.add(enterPword2);
     enterPword2.setBackground(col);
     enterPword2.setForeground(Color.white);
     enterPword2.setFont(enterFont);
     
   
    
     
     
     JButton registerButton = new JButton("REGISTER");
     Font RegFont = new Font("Serif", Font.PLAIN, 15);
     registerButton.setBounds(175, 270, 150, 25);
     registerButton.setFont(RegFont);
     registerButton.setForeground(Color.white);
     registerButton.setBackground(RegisterBackground);
     RegPanel.add(registerButton);
     
     
     JLabel askLogin = new JLabel("Already Registererd?");
     askLogin.setBounds(800,40,200,20);
     RegisterPage.add(askLogin);
     askLogin.setForeground(Color.white);
     askLogin.setFont(RegFont);
     
     JButton login = new JButton("LOGIN");
     login.setBounds(810, 65, 100, 20);
     login.setFont(RegFont);
     RegisterPage.add(login);
     login.setBackground(col);
     login.setBorder(null);
     login.setForeground(Color.white);
     
     
     JLabel afterRegister = new JLabel();
     afterRegister.setBounds(160,450,300,20);
     RegisterPage.add(afterRegister);
     afterRegister.setForeground(Color.white);
     afterRegister.setFont(RegFont);
     
     
     
     ImageIcon gardenpic = new ImageIcon("croptwo.png");
     JLabel icon = new JLabel();
     icon.getPreferredSize();
     icon.setBounds(0,0,1000,600);
     icon.setIcon(gardenpic);
     RegisterPage.add(icon);
     
   //REGISTERPAGE ENDS
     
  //LOGIN PAGE
  		JFrame frame = new JFrame("EGroww"); 
  		frame.setBounds(0,0, 1000, 600);
  		Color colframe= new Color(158,88,26);
  		
  		
  		
  		frame.getContentPane().setBackground(colframe);
  		
  		// Creating panel 
  		JPanel panel = new JPanel();
  	    panel.setBounds(260, 150, 450, 250);
  		frame.add(panel);
  		panel.setLayout(null);
  		panel.setVisible(true);
  		Color col1 = new Color(193,122,60);
  		panel.setBackground(col1);
  		
  		
  		//welcome title
  		JLabel title1 = new JLabel("Welcome to EGroww");
  		Font FTitle1 = new Font("Serif", Font.BOLD, 30);
  	    title1.setForeground(Color.white);
  		title1.setFont(FTitle1);
  		title1.setBounds(350, 40, 500, 25);
  		frame.add(title1);
  		
  		
  		//Username
  		JLabel textuser = new JLabel("Username");
  		textuser.setBounds(20, 50, 200, 50);
  		panel.add(textuser);
  		Font f1 = new Font("Serif", Font.PLAIN, 20);
  		textuser.setFont(f1);
  		textuser.setForeground(Color.white);
  		
  		//Username entryfield
  		JTextField enteruser = new JTextField();
  		enteruser.setBounds(170, 65, 200, 20);
  		panel.add(enteruser);
  		Font f2 = new Font("Serif", Font.PLAIN, 18);
  		enteruser.setFont(f2);
  		
  	    //password 
  		JLabel textpassword = new JLabel("Password");
  		textpassword.setBounds(20, 90, 200, 50);
  		panel.add(textpassword);
  		textpassword.setFont(f1);
  		textpassword.setForeground(Color.white);
  	
  		
  		//password entryField
  		JPasswordField password = new JPasswordField();
  		password.setBounds(170, 105, 200, 20);
  		panel.add(password);
  		password.setFont(f2);
  	
  		
  		
  		//Login button
  		JButton loginbutton = new JButton("LOGIN");
  		loginbutton.setBounds(175, 160, 100, 30);
  		panel.add(loginbutton);
  		Font buttonfont = new Font("Serif", Font.PLAIN,12);
  		loginbutton.setFont(buttonfont);
  		loginbutton.setBackground(colframe);
  		loginbutton.setForeground(Color.white);
  		
  		
  		JButton adminLogin = new JButton("ADMIN LOGIN");
  		adminLogin.setBounds(800, 65, 150, 30);
  		frame.add(adminLogin);
  		adminLogin.setFont(buttonfont);
  		adminLogin.setBackground(colframe);
  		adminLogin.setForeground(Color.white);
  		
  		
  		ImageIcon image = new ImageIcon("croptwo.png");
  		JLabel newImage = new JLabel();
  		newImage.getPreferredSize();
  		newImage.setLayout(null);
  		newImage.setBounds(0,0,1000,600);
  		newImage.setIcon(image);
  		frame.add(newImage);
  		
  		
  		
  		
  		frame.setResizable(false);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		frame.setLayout(null);
  		//frame.setVisible(true);
     
  		//LOGINPAGE ENDS
  		
     //ADMINLOGIN PAGE
  		
  		JFrame adminframe = new JFrame("EGroww"); 
  		adminframe.setBounds(0,0, 1000, 600);
  		
  		
  		adminframe.getContentPane().setBackground(colframe);
  		
  		// Creating panel 
  		JPanel adminpanel = new JPanel();
  	    adminpanel.setBounds(260, 150, 450, 250);
  		adminframe.add(adminpanel);
  		adminpanel.setLayout(null);
  		adminpanel.setVisible(true);
  		adminpanel.setBackground(col1);
  		
  		
  		//welcome title
  		JLabel admintitle1 = new JLabel("Welcome to EGroww");
  	    admintitle1.setForeground(Color.white);
  		admintitle1.setFont(FTitle1);
  		admintitle1.setBounds(350, 40, 500, 25);
  		adminframe.add(admintitle1);
  		
  		
  		JLabel Admin = new JLabel("ADMIN LOGIN");
        Admin.setBounds(175, 15, 200, 30);
        Font adminfont = new Font("Serif", Font.BOLD, 15);
        Admin.setFont(adminfont);
        adminpanel.add(Admin);
        
 
  		//Username
  		JLabel admintextuser = new JLabel("Username");
  		admintextuser.setBounds(20, 50, 200, 50);
  		adminpanel.add(admintextuser);
  		admintextuser.setFont(f1);
  		admintextuser.setForeground(Color.white);
  		
  		//Username entryfield
  		JTextField adminenteruser = new JTextField();
  		adminenteruser.setBounds(170, 65, 200, 21);
  		adminpanel.add(adminenteruser);
  		adminenteruser.setText("Admin");
  		adminenteruser.setEditable(false);
  		adminenteruser.setFont(f1);
  		
  	    //password 
  		JLabel admintextpassword = new JLabel("Password");
  		admintextpassword.setBounds(20, 90, 200, 50);
  		adminpanel.add(admintextpassword);
  		admintextpassword.setFont(f1);
  		admintextpassword.setForeground(Color.white);
  	
  		
  		//password entryField
  		JPasswordField adminpassword = new JPasswordField();
  		adminpassword.setBounds(170, 105, 200, 20);
  		adminpanel.add(adminpassword);
  		adminpassword.setFont(f2);
  	
  		
  		
  		//Login button
  		JButton adminloginbutton = new JButton("LOGIN");
  		adminloginbutton.setBounds(175, 160, 100, 30);
  		adminpanel.add(adminloginbutton);
  		adminloginbutton.setFont(buttonfont);
  		adminloginbutton.setBackground(colframe);
  		adminloginbutton.setForeground(Color.white);
  		
  		
  		JLabel adminnewImage = new JLabel();
  		adminnewImage.getPreferredSize();
  		adminnewImage.setLayout(null);
  		adminnewImage.setBounds(0,0,1000,600);
  		adminnewImage.setIcon(image);
  		adminframe.add(adminnewImage);
  		
  		
  		
  		adminframe.setResizable(false);
  		adminframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		adminframe.setLayout(null);
  		//adminLogin page ends
  		
  		
  		
  		//AdminMainPage
  		JFrame adminpage = new JFrame();
  		adminpage.setBounds(0, 0, 1000, 600);
  		adminpage.setLayout(null);
  		adminpage.getContentPane().setBackground(colframe);
  		
  		JPanel adminpagepanel = new JPanel();
  		adminpagepanel.setBounds(50, 100, 600, 450);
  		adminpagepanel.setLayout(null);
  		adminpagepanel.setBackground(col1);
  		adminpage.add(adminpagepanel);
  		
  		
  		JLabel addcontent = new JLabel("Add Your Contents Here");
  		addcontent.setBounds(300, 40, 500, 40);
  		addcontent.setFont(FTitle);
  		addcontent.setForeground(Color.white);
  		adminpage.add(addcontent);
  		
  		
  		JLabel addcrop = new JLabel("Crop Type");
  		addcrop.setBounds(100, 30, 200, 32);
  		Font admintextfont = new Font("Serif", Font.PLAIN, 25);
  		addcrop.setForeground(Color.white);
  		addcrop.setFont(admintextfont);
  		adminpagepanel.add(addcrop);
  		
  		
  		JTextField entercrop = new JTextField();
  		entercrop.setBounds(300, 30, 200, 32);
  		entercrop.setFont(admintextfont);
  		entercrop.setBackground(col1);
  		entercrop.setForeground(Color.white);
  		adminpagepanel.add(entercrop);
  		
  		
  		JLabel addSoil = new JLabel("Soil Type");
  		addSoil.setBounds(100, 100, 200, 32);
  		addSoil.setFont(admintextfont);
  		addSoil.setForeground(Color.white);
  		adminpagepanel.add(addSoil);
  		
  		
  		JTextField enterSoil = new JTextField();
  		enterSoil.setBounds(300, 100, 200, 32);
  		enterSoil.setFont(admintextfont);
  		enterSoil.setBackground(col1);
      	enterSoil.setForeground(Color.white);
  		adminpagepanel.add(enterSoil);
  		
  		
  		JLabel addSeason = new JLabel("Season");
  		addSeason.setBounds(100, 170, 200, 32);
  		addSeason.setFont(admintextfont);
  		addSeason.setForeground(Color.white);
  		adminpagepanel.add(addSeason);
  		
  		
  		JTextField enterSeason = new JTextField();
  		enterSeason.setBounds(300, 170, 200, 32);
  		enterSeason.setFont(admintextfont);
  		enterSeason.setBackground(col1);
  		enterSeason.setForeground(Color.white);
  		adminpagepanel.add(enterSeason);
  		
  		JLabel addTemp = new JLabel("Temperature");
  		addTemp.setBounds(100, 250, 200, 32);
  		addTemp.setFont(admintextfont);
  		addTemp.setForeground(Color.white);
  		adminpagepanel.add(addTemp);
  		
  		
  		JTextField enterTemp = new JTextField();
  		enterTemp.setBounds(300, 250, 200, 32);
  		enterTemp.setFont(admintextfont);
  		enterTemp.setBackground(col1);
  		enterTemp.setForeground(Color.white);
  		adminpagepanel.add(enterTemp);
  		
  		
  		JLabel adddesc = new JLabel("Description");
  		adddesc.setBounds(100, 330, 200, 32);
  		adddesc.setFont(admintextfont);
  		adddesc.setForeground(Color.white);
  		adminpagepanel.add(adddesc);
  		
  		
  		JTextField enterdesc = new JTextField();
  		enterdesc.setBounds(300, 330, 200, 32);
  		enterdesc.setFont(admintextfont);
  		enterdesc.setBackground(col1);
  		enterdesc.setForeground(Color.white);
  		adminpagepanel.add(enterdesc);
  		
  		JButton adminpagebtn = new JButton("ENTER");
  		adminpagebtn.setBounds(220,400,150,30);
  		adminpagebtn.setFont(admintextfont);
  		adminpagebtn.setBackground(colframe);
  		adminpagebtn.setForeground(Color.white);
  		adminpagepanel.add(adminpagebtn);
  		
  		
  		JButton exitbtn = new JButton("Exit");
  		exitbtn.setBounds(850,500,100,30);
  		exitbtn.setFont(admintextfont);
  		exitbtn.setBackground(colframe);
  		exitbtn.setForeground(Color.white);
  		adminpage.add(exitbtn);
  		
  		
  		JLabel adminBackgrnd= new JLabel();
  		ImageIcon adbackgnd = new ImageIcon("AdminPage.jpg");
  		adminBackgrnd.setLayout(null);
  		adminBackgrnd.setBounds(0,0,1000,600);
  		adminBackgrnd.setIcon(adbackgnd);
  		adminpage.add(adminBackgrnd);
  		
  		
  		adminpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		adminpage.setResizable(false);
  		adminpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		//adminMainPage ends
  		
  		
  		
     //TYPEOFSOIL PAGE
     Color colframe1= new Color(158,88,26);
		
     JFrame Pageone = new JFrame();
    Pageone.setBounds(0, 0, 1000, 600);
    Pageone.setLayout(null);

     
    JLabel entersoil = new JLabel("Select your Soil Type");
    entersoil.setBounds(100, 100, 500, 40);
    Font soil = new Font("Serif", Font.BOLD, 30);
    entersoil.setFont(soil);
    Pageone.add(entersoil);

    entersoil.setForeground(Color.black);

     

     String objects[]= {"Clay","Sand","Silt","Loam"};
     @SuppressWarnings({ "rawtypes", "unchecked" })
    JComboBox soiltype = new JComboBox(objects);
     soiltype.setBounds(430,100,200,40);
     
     soiltype.setBackground(colframe1);
     Font soil1 = new Font("Serif", Font.PLAIN, 25);
     soiltype.setFont(soil1);
     Pageone.add(soiltype);
     
     
     ImageIcon imagesoil1 = new ImageIcon("Clay Soil.jpeg");
     JLabel soilclay= new JLabel();
     soilclay.setLayout(null);
     soilclay.setBounds(100,300,150,150);
     soilclay.setIcon(imagesoil1);
     Pageone.add(soilclay);


     JLabel soilname1 = new JLabel("CLAY");
     soilname1.setBounds(135, 460, 100, 35);
     Pageone.add(soilname1);
     soilname1.setForeground(Color.white);
     Font soilnames = new Font("Serif", Font.BOLD, 30);
     soilname1.setFont(soilnames);



     ImageIcon imagesoil2 = new ImageIcon("Sand soil.jpeg");
     JLabel soilsand= new JLabel();
     soilsand.setLayout(null);
     soilsand.setBounds(300,300,150,150);
     soilsand.setIcon(imagesoil2);
     Pageone.add(soilsand);


     JLabel soilname2 = new JLabel("SAND");
     soilname2.setBounds(335, 460, 100, 35);
     Pageone.add(soilname1);
     soilname2.setForeground(Color.white);
     soilname2.setFont(soilnames);
     Pageone.add(soilname2);



     ImageIcon imagesoil3 = new ImageIcon("Silt Soil.jpeg");
     JLabel soilsilt= new JLabel();
     soilsilt.setLayout(null);
     soilsilt.setBounds(500,300,150,150);
     soilsilt.setIcon(imagesoil3);
     Pageone.add(soilsilt);



     JLabel soilname3= new JLabel("SILT");
     soilname3.setBounds(535, 460, 100, 35);
     Pageone.add(soilname3);
     soilname3.setForeground(Color.white);
     soilname3.setFont(soilnames);
     Pageone.add(soilname3);


     ImageIcon imagesoil4 = new ImageIcon("Loam Soil.jpeg");
     JLabel soilloam= new JLabel();
     soilloam.setLayout(null);
     soilloam.setBounds(700,300,150,150);
     soilloam.setIcon(imagesoil4);
     Pageone.add(soilloam);


     JLabel soilname4 = new JLabel("LOAM");
     soilname4.setBounds(735, 460, 100, 30);
     Pageone.add(soilname4);
     soilname4.setForeground(Color.white);
     soilname4.setFont(soilnames);
     Pageone.add(soilname4);



     
     JButton next = new JButton("NEXT");
 	next.setBounds(425,500,100,40);
 	Pageone.add(next);
 	next.setFont(RegFont);
 	next.setForeground(Color.white);
 	next.setBackground(colframe1);
 	
 	
     ImageIcon imageback = new ImageIcon("cropfour.png");
    	JLabel pageImage = new JLabel();
    	pageImage.getPreferredSize();
    	pageImage.setLayout(null);
    	pageImage.setBounds(0,0,1000,600);
    	pageImage.setIcon(imageback);
    	Pageone.add(pageImage);
    
    	
   // Pageone.setVisible(true);
    Pageone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Pageone.setResizable(false);
 //TYPEOFSOILPAGE ENDS
    
   
  //Temperature and Climate
    JFrame ClimateFrame = new JFrame();
    ClimateFrame.setBounds(0, 0, 1000, 600);
    ClimateFrame.setLayout(null);
    
   // JPanel seasonpanel = new JPanel();
   // seasonpanel.setBounds(50,80,200,35);
   // seasonpanel.setBackground(Color.white);
   // ClimateFrame.add(seasonpanel);
    
    
    JLabel selectclimate = new JLabel("Please select the Season");
    selectclimate.setBounds(30, 80, 200, 50);
    selectclimate.setFont(textFont);
    ClimateFrame.add(selectclimate);
    
    String Season[] = {"Summer", "Winter", "Rainy"};
    JComboBox<Object> season = new JComboBox<Object>(Season);
    season.setBounds(400, 83, 120, 37);
    season.setFont(textFont);
    ClimateFrame.add(season);
    
    
    JLabel seasonBack = new JLabel();
    ImageIcon seasonimg = new ImageIcon("seasons.jpeg");
    seasonBack.setBounds(0, 0, 1000, 300);
    seasonBack.setLayout(null);
    seasonBack.setIcon(seasonimg);
    ClimateFrame.add(seasonBack);
    
    
    JLabel selectTemp = new JLabel("Please select the Temperature");
    selectTemp.setBounds(30, 360, 250, 50);
    selectTemp.setFont(textFont);
    ClimateFrame.add(selectTemp);
    
    
    JSlider temp = new JSlider(JSlider.HORIZONTAL,0,50,15);
   temp.setMajorTickSpacing(10);
    temp.setMinorTickSpacing(2);
    temp.setPaintTicks(true);
    temp.setPaintLabels(true);
    temp.setFont(textFont);
    temp.setBackground(colframe);
    temp.setBounds(400, 360, 200, 50);
     ClimateFrame.add(temp);
    

    JButton climateBtn = new JButton("Get My Crops");
    climateBtn.setBounds(400,470,150,30);
    Font buttonfont2 = new Font("Serif", Font.BOLD, 15);
    climateBtn.setFont(buttonfont2);
    ClimateFrame.add(climateBtn);
    
    JLabel tempBack = new JLabel();
    ImageIcon tempimg = new ImageIcon("Temp.png");
    tempBack.setBounds(0,300,1000,300);
    tempBack.setLayout(null);
    tempBack.setIcon(tempimg);
    ClimateFrame.add(tempBack);
    //ClimateandTemperature ends
    
    //CROPTYPEPAGE
    JFrame croppage = new JFrame();
    croppage.setBounds(0, 0, 1000, 600);
    croppage.setLayout(null);
    croppage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JLabel yourcrop = new JLabel("Best Suited Crop for You");
    yourcrop.setBounds(120, 60, 700, 35);
    Font crop = new Font("Serif", Font.BOLD, 30);
    yourcrop.setForeground(Color.black);
    yourcrop.setFont(crop);
    croppage.add(yourcrop);
   
   
   JLabel crop1 = new JLabel();
   crop1.setBounds(360,170,700,120);
   Font cropfont = new Font("Serif", Font.BOLD, 40);
   crop1.setFont(cropfont);
   croppage.add(crop1);
  
   JLabel crop2 = new JLabel();
   crop2.setBounds(150,250,700,120);
   Font cropfont2= new Font("Serif", Font.BOLD, 35);
   crop2.setFont(cropfont2);
   croppage.add(crop2);
   

 JLabel croppagebackground = new JLabel();
  croppagebackground.setBounds(0, 0, 1000, 600);
  croppagebackground.setIcon(imageback);
  croppage.add(croppagebackground);
    
    
    
    JButton back = new JButton("Back");
    back.setBounds(425,450,100,40);
    back.setFont(RegFont);
    back.setBackground(colframe1);
    back.setForeground(Color.white);
    croppage.add(back);
    

    registerButton.addActionListener(new ActionListener() {
   	 public void actionPerformed(ActionEvent e) {
   		 
   	if(entername.getText().trim().isEmpty() || enterContact.getText().trim().isEmpty() || enterUsername.getText().trim().isEmpty() || enterPword.getPassword().toString().trim().isEmpty() ||enterPword2.getPassword().toString().trim().isEmpty())	{
   		JOptionPane.showMessageDialog( enteruser, "Please enter all the Feilds", "Error", JOptionPane.ERROR_MESSAGE);
   	}
   	else if(!entername.getText().trim().isEmpty() || !enterContact.getText().trim().isEmpty() || !enterUsername.getText().trim().isEmpty() || !enterPword.getPassword().toString().trim().isEmpty() ||!enterPword2.getPassword().toString().trim().isEmpty()) {
   		if(!Arrays.equals(enterPword.getPassword(), enterPword2.getPassword())){
   			JOptionPane.showMessageDialog( enteruser, "Please enter correct passwords", "Error", JOptionPane.ERROR_MESSAGE);
   		}
   			else if(Arrays.equals(enterPword.getPassword(), enterPword2.getPassword())){
   			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "Vaish@23");
			Statement s1 = c.createStatement();
			
String query1=String.format("insert into register (Name, ContactNo, Username,password, ConfirmPassword) values('%s', '%s' , '%s', '%s', '%s')", entername.getText(), enterContact.getText(), enterUsername.getText(), String.valueOf(enterPword.getPassword()), String.valueOf(enterPword2.getPassword()));

               s1.executeUpdate(query1);
			c.close();
			
			
				}
				catch(Exception e1){
					
				}
   		
   	 afterRegister.setText("Registration Completed Successfully");
   	 
   }
   	 }
   	 }
    });
     
    login.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			RegisterPage.dispose();
			frame.setVisible(true);
		}
    	
    });
    
    loginbutton.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "Vaish@23");
				Statement s2= c.createStatement();
				
	if(enteruser.getText().isEmpty() || password.getPassword().toString().isEmpty()) {
		JOptionPane.showMessageDialog( enteruser, "Please enter all the Feilds", "Error", JOptionPane.ERROR_MESSAGE);
	}
	else {
	PreparedStatement st= (PreparedStatement)c.prepareStatement("select *  from register where Username=? and Password=?");
    st.setString(1, enteruser.getText());
    st.setString(2,String.valueOf(password.getPassword()));
    ResultSet r1= st.executeQuery();
    if(r1.next()) {
    	String query2=String.format("insert into login (Username,Password) values('%s', '%s')", enteruser.getText(),String.valueOf(password.getPassword()));
    	s2.executeUpdate(query2);
    	c.close();
    	frame.dispose();
         Pageone.setVisible(true);
         
    	
    }
    else {
    	JOptionPane.showMessageDialog( enteruser, "User not registered. Please register", "Error", JOptionPane.ERROR_MESSAGE);
    }
	}
				
				
					}
					catch(Exception e1){
						
					}
			
		}
	});
    
    
   adminLogin.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		adminframe.setVisible(true);
		
	}
	   
   });
   
   adminloginbutton.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1="1234";
		String s2=String.valueOf(adminpassword.getPassword());
		
		if(s2.isEmpty()) {
			JOptionPane.showMessageDialog( enteruser, "Please enter the default password", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(!s1.equals(s2)) {
			
			JOptionPane.showMessageDialog( enteruser, "Entered Password does not match with the default password", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else {
		adminframe.dispose();
		adminpage.setVisible(true);
	}
	}
   });
   
   adminpagebtn.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "Vaish@23");
			Statement s2= c.createStatement();
	
			if(!entercrop.getText().isEmpty() && !enterSoil.getText().isEmpty()) {
				String q1 = String.format("Insert into soiltable (crop,soil)values ('%s' , '%s')", entercrop.getText(), enterSoil.getText());
				s2.executeUpdate(q1);
			}
			
			if(!entercrop.getText().isEmpty() && !enterTemp.getText().isEmpty()) {
				String q1 = String.format("Insert into Temptable (crop,temperature)values ('%s' , '%s')", entercrop.getText(), enterTemp.getText());
				s2.executeUpdate(q1);
			}
			
			if(!entercrop.getText().isEmpty() && !enterSeason.getText().isEmpty()) {
				String q1 = String.format("Insert into Climatetable (crop,climate)values ('%s' , '%s')", entercrop.getText(), enterSeason.getText());
				s2.executeUpdate(q1);
			}
			
			if(!entercrop.getText().isEmpty() && !enterdesc.getText().isEmpty()) {
				String q1 = String.format("Insert into Cropstable (crop,cropInfo)values ('%s' , '%s')", entercrop.getText(), enterdesc.getText());
				s2.executeUpdate(q1);
			}
			
			
			
			c.close();
			
			
		}
		catch(Exception e1) {
			
		}
		
	}
	   
   });
   
   exitbtn.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		adminpage.dispose();
		
	}
	   
   });
   
    next.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			Pageone.dispose();
		     
			ClimateFrame.setVisible(true);
			
		}
    	
   });
    
  
  climateBtn.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
 try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "Vaish@23");
PreparedStatement st= (PreparedStatement)c.prepareStatement("select *  from Cropstable where crop in (select crop from Temptable where temperature=? and crop in (select crop from Climatetable where climate=? and crop in (select crop from Soiltable where soil = ? ) ))");
st.setInt(1, temp.getValue());
st.setString(2,season.getSelectedItem().toString());
st.setString(3,soiltype.getSelectedItem().toString());

ResultSet r1= st.executeQuery();

if(!r1.next()) {
	crop1.setText("No Match Found");
}
else {
	crop1.setText(r1.getString(1));
	crop2.setText(r1.getString(2));
}  

    ClimateFrame.dispose();
	croppage.setVisible(true);
		
c.close();
			}
			catch(Exception e1){
				
			}
	
		  
	  }
  });
  
  back.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
	croppage.dispose();
	Pageone.setVisible(true);
		
	}
  });

	RegisterPage.setVisible(true);
	RegisterPage.setResizable(false);
	RegisterPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}

