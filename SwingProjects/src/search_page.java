package Test;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.UIManager;

import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.Panel;

public class search_page  extends JFrame{
   private JTextField textField;
   private JTextField textField_2;
   private JTextField textField_1;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   
   
   
   public search_page() {
	   
      getContentPane().setEnabled(false);
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료하면 백그라운드에 안남고 완벽하게 끄는거 
      
      
      getContentPane().setBackground(new Color(255, 250, 250));//프레임 색깔 
      getContentPane().setLayout(null);//임의적으로 내가 마음대로 편집하게 하는 레이아웃 
      setSize(780,750);//프레임 사이즈 
      
      setLocationRelativeTo(null);
      
      textField = new JTextField();// 검색 텍스트창 
      textField.setBackground(SystemColor.controlHighlight);
      textField.setFont(new Font("굴림", Font.PLAIN, 20));
      textField.setBounds(94, 182, 365, 38);
      getContentPane().add(textField);
      textField.setColumns(10);//검색 텍스트창 여기까지 
      
      JButton btnNewButton = new JButton("\uAC80\uC0C9");//검색 버튼 
      btnNewButton.setBackground(SystemColor.controlHighlight);
      btnNewButton.addActionListener(new ActionListener() {//검색 버튼을 누름과 동시에 
         public void actionPerformed(ActionEvent e) { // 검색 완료창 불러옴 
            new Search_end_page();//검색 완료창 불러오는 코드 
            
            setVisible(false);//검색 완료창을 부르면서 자기창 비활성화 코드 
         }
      });
      btnNewButton.setFont(new Font("HY엽서M", Font.PLAIN, 15));
      btnNewButton.setBounds(459, 182, 74, 38);
      getContentPane().add(btnNewButton);
      
      JButton btnNewButton_2 = new JButton("logout"); //로그아웃버튼 
      btnNewButton_2.setForeground(SystemColor.controlHighlight);
      btnNewButton_2.setBorderPainted(false);//버튼의 테두리 없앰 
      btnNewButton_2.setContentAreaFilled(false);//버튼 바탕 채우기 없앰
      btnNewButton_2.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
      btnNewButton_2.addActionListener(new ActionListener() { //로그아웃 버튼을 누름과 동시에 로그아웃 되었습니다 팝업창 만들어줘야함  
         public void actionPerformed(ActionEvent e) {//그와 동시에 로그인 페이지로 다시 넘어감 
            
//                 new Login_page();//로그인 페이지 불러오는 함수
            
             setVisible(false);//로그인 페이지 불러오는 동시에 자기창 비활성화 
            
         }
      });
      btnNewButton_2.setBounds(627, 1, 127, 56);
      getContentPane().add(btnNewButton_2);//로그아웃 버튼 ㅕㅇ기까지 
      
      JButton btnNewButton_3 = new JButton("shop");//샵 버튼 
      btnNewButton_3.setForeground(SystemColor.window);
      btnNewButton_3.setBackground(new Color(0, 153, 0));
      
      btnNewButton_3.setContentAreaFilled(false);//버튼 바탕 채우기 없앰 
      btnNewButton_3.setBorderPainted(false);//버튼의 테두리 없앰 
      
      btnNewButton_3.addActionListener(new ActionListener() {//샵버튼 누르는 동시에 
         public void actionPerformed(ActionEvent e) {//구매창 을 불러오는 함수 
            
//            new shop_page();//구매창 불러오는 함수
            
             setVisible(false);//불러옴과 동시에 자기창 비활성화 
         }
      });
      
      btnNewButton_3.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
      btnNewButton_3.setBounds(470, -1, 95, 56);
      getContentPane().add(btnNewButton_3);
      
      
      JButton btnNewButton_4 = new JButton("My");//프로필  버튼 
      btnNewButton_4.setForeground(SystemColor.window);
      btnNewButton_4.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
      btnNewButton_4.setContentAreaFilled(false);//버튼 바탕 채우기 없앰 
      btnNewButton_4.setBorderPainted(false);//버튼의 테두리 없앰 
      
      btnNewButton_4.addActionListener(new ActionListener() {// 프로필 버튼을 누름과 동시에 프로필창 불러옴 
         
         @Override
         public void actionPerformed(ActionEvent e) { 
            
//            new Pprofile(); // 프로필창 불러오는 함수 
            setVisible(false);//프로필창 불러옴과 동시에 자기창 비활성화 
            
         }
      });
      btnNewButton_4.setBounds(555, -1, 95, 56);
      getContentPane().add(btnNewButton_4);
      
      
      Panel pane1 = new Panel(); // 추천매뉴 를 깔기위해 깔아놓는 판넬 , 도화지라고 보면됌 
      pane1.setBackground(SystemColor.controlHighlight);
      
      pane1.setBounds(45, 290, 684, 212);
      getContentPane().add(pane1);
      pane1.setLayout(null);//추천매뉴 판넬 여기까지  
      
      Button button = new Button("이미지1"); // 추천매뉴 이미지 1
      button.setBounds(10, 30, 152, 114);
      pane1.add(button);
      
      Button button_1 = new Button("이미지2");//추천매뉴 이미지 2
      button_1.setBounds(179, 30, 152, 114);
      pane1.add(button_1);
      
      Button button_2 = new Button("이미지3");//추천매뉴 이미지 3
      button_2.setBounds(350, 30, 152, 114);
      pane1.add(button_2);
      
      Button button_3 = new Button("이미지4");//추천매뉴 이미지 3
      button_3.setBounds(522, 30, 152, 114);
      pane1.add(button_3);
      
      textField_1 = new JTextField(); //추천매뉴 이미지 1 의 매뉴이름 
      textField_1.setBackground(SystemColor.controlHighlight);
      textField_1.setBounds(10, 150, 152, 36);
      pane1.add(textField_1);
      textField_1.setColumns(10);//추천매뉴 이미지 1 의 매뉴이름  여기까지 
      
      textField_3 = new JTextField();// 추천매뉴 이미지2의 매뉴이름 
      textField_3.setBackground(SystemColor.controlHighlight);
      textField_3.setColumns(10);
      textField_3.setBounds(179, 150, 152, 36);
      pane1.add(textField_3);////추천매뉴 이미지 2 의 매뉴이름 여기까지  
      
      textField_4 = new JTextField();//추천매뉴 이미지 3의 매뉴이름
      textField_4.setBackground(SystemColor.controlHighlight);
      textField_4.setColumns(10);
      textField_4.setBounds(350, 150, 152, 36);
      pane1.add(textField_4);//추천매뉴 이미지 3 의 매뉴이름 여기까지 
      
      textField_5 = new JTextField();//추천매뉴 이미지4의 매뉴이름
      textField_5.setBackground(SystemColor.controlHighlight);
      textField_5.setColumns(10);
      textField_5.setBounds(522, 150, 152, 36);
      pane1.add(textField_5);//추천매뉴 이미지4의 매뉴이름 여기까지 
      
      JPanel panel = new MyPanel();//배너를 넣을 J패널 광택아 배너 부탁한다 ㅋㅋ
      panel.setBounds(58, 549, 653, 132);
      getContentPane().add(panel);
      
      
      
     
      
      
      
      
      
      
      
      
      
      
      
      JLabel lblNewLabel = new JLabel("BangGuSuck");
      lblNewLabel.setBackground(SystemColor.controlHighlight);
      lblNewLabel.setForeground(SystemColor.controlHighlight);
      lblNewLabel.setFont(new Font("Sitka Banner", Font.PLAIN, 49));
      lblNewLabel.setIcon(null);
      lblNewLabel.setBounds(274, 80, 244, 97);
      getContentPane().add(lblNewLabel);
      
      JButton btnNewButton_1 = new JButton("\uC7AC\uB8CC\uAC80\uC0C9");
      btnNewButton_1.setBackground(SystemColor.controlHighlight);
      btnNewButton_1.setFont(new Font("HY엽서M", Font.PLAIN, 15));
      btnNewButton_1.setBounds(528, 182, 122, 38);
      getContentPane().add(btnNewButton_1);
      
      
      
      
      JLabel lblNewLabel_1 = new JLabel("New label");
      lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rhals\\Downloads\\wallpaperbetter.com_1920x1080 (11).jpg"));
      lblNewLabel_1.setBounds(0, 0, 766, 713);
      getContentPane().add(lblNewLabel_1);
      

   

      btnNewButton_1.addActionListener(new ActionListener() {//검색 버튼을 누름과 동시에 
          public void actionPerformed(ActionEvent e) { // 검색 완료창 불러옴 
              new check();//재료검색창 불러오는 코드 
              
              setVisible(false);//재료검색창 부르면서 자신 비활성화 코드
          }
      });
      
      
      
      
      
      setVisible(true); // 이게 없으면 창이 안보임 
      
      
      
      
      
      
   }
   

class MyPanel extends JPanel{
	ImageIcon testImg = 
			new ImageIcon("C:/Users/hhkkt/Desktop/test.png");
	Image finalImg = testImg.getImage();
	int a = 650;
//	int b = 850;
	public MyPanel() {
		setFocusable(true);
		new Thread(new Runnable() {
			public void run() {
				while(true){
					a--;
//					b--;
					if(a <-200) {
						a = 800;
					}
//					if(b <-200) {
//						b = 800;
//					}
					repaint();
					try {
						Thread.sleep(1);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(finalImg,a,0,200, 130,this);
//		g.drawImage(finalImg,b,0,200, 130,this);
	}
}

   public static void main(String[] args) {
      
      new  search_page();// 위에 클래스를 호출하는 함수 
      
      
   }
}