package Test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

class check extends JFrame{
	
	check(){
		Container c = getContentPane();
		setLayout(new GridLayout(2,1));
		JPanel ckpa1 = new JPanel();
		add(ckpa1);
		
		JCheckBox jcb1 = new JCheckBox("a");
		JCheckBox jcb2 = new JCheckBox("b");
		JCheckBox jcb3 = new JCheckBox("c");
		JCheckBox jcb4 = new JCheckBox("d");
		JCheckBox jcb5 = new JCheckBox("e");
		JCheckBox jcb6 = new JCheckBox("f");
		JCheckBox jcb7 = new JCheckBox("g");
		JCheckBox jcb8 = new JCheckBox("h");
		JCheckBox jcb9 = new JCheckBox("i");
		ckpa1.add(jcb1);
		ckpa1.add(jcb2);
		ckpa1.add(jcb3);
		ckpa1.add(jcb4);
		ckpa1.add(jcb5);
		ckpa1.add(jcb6);
		ckpa1.add(jcb7);
		ckpa1.add(jcb8);
		ckpa1.add(jcb9);
		
		JPanel ckpa2 = new JPanel();
		ckpa2.setLayout(new GridLayout(1,2));
		JButton ckbt1 = new JButton("확인");
		JButton ckbt2 = new JButton("취소");
		ckpa2.add(ckbt1);
		ckpa2.add(ckbt2);
		add(ckpa2);
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		ckbt1.addActionListener(new ActionListener() {//검색 버튼을 누름과 동시에 
	          public void actionPerformed(ActionEvent e) { // 검색 완료창 불러옴 
//	              new check();//재료검색창 불러오는 코드 
	              
	              setVisible(false);//재료검색창 부르면서 자신 비활성화 코드
	          }
	      });
		ckbt2.addActionListener(new ActionListener() {//검색 버튼을 누름과 동시에 
	          public void actionPerformed(ActionEvent e) { // 검색 완료창 불러옴 
	              new search_page();//재료검색창 불러오는 코드 
	              
	              setVisible(false);//재료검색창 부르면서 자신 비활성화 코드
	          }
	      });
		
		
	}
	
public static void main(String[] args) {
	
}}

