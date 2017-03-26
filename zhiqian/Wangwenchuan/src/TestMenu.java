import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.* ;
import java.io.* ;



public class TestMenu extends JFrame  {
JTextArea at,at2;JPanel jp,jp2;
JLabel jl,jl2;
 JFrame HHH,FFF;
   JLabel jL,jL2,jL3,jL4;
   TextField text,text2,text3,text4;
   JPanel jpanel,jpanel2;
   JToggleButton button,button1 ;


  Scanner input;
PrintWriter output;
   StringBuffer str;

public TestMenu(){
     HHH=new JFrame(); FFF=new JFrame();
     jL=new JLabel("请输入源文件名");jL3=new JLabel("请输入源文件名");
     jL2=new JLabel("请输入目的文件名"); jL4=new JLabel("请输入目的文件名");
     text=new TextField(10); text3=new TextField(10);
     text2=new TextField(10);text4=new TextField(10);
     jpanel=new JPanel() ;jpanel2=new JPanel() ;
      button=new JToggleButton("确定") ;button1=new JToggleButton("确定") ;
   button.addActionListener(new Bt()); button1.addActionListener(new Ct());

   


	
	JMenuBar jBar=new JMenuBar();
	
	JMenu jMenu=new JMenu("菜单");
	JMenuItem jMenuItem=new JMenuItem("文件解密");




     jMenuItem.addActionListener(new Bt());//MenuItem 添加监听
    
	JMenuItem jMenuItem2=new JMenuItem("文件加密");
       jMenuItem2.addActionListener(new Ct());//MenuItem 添加监听
	jMenu.add(jMenuItem);
	jMenu.add(jMenuItem2);
	jBar.add(jMenu);
	JMenu jMenu2=new JMenu("编辑");
	jMenu2.add(new JMenuItem("复制"));
	jMenu2.add(new JMenuItem("粘贴"));
	jBar.add(jMenu2);
	jBar.setBounds(50, 50, 80, 50);
	//jBar2.setBounds(50, 100, 80, 50);
	
	setJMenuBar(jBar);

       jp=new JPanel();

       jp.setLayout(new BorderLayout());
       at=new JTextArea();at.setEditable(false);
       at.setLineWrap(true);
      //at.append("hahahahah");
       jl=new JLabel("                                      源文件");
       
       jp.add(jl,"North");
      JScrollPane jsp=new JScrollPane(at);//新建一个滚动条界面，将文本框传入  
      jp.add(jsp,"Center");//注意：将滚动条界面添加到组建中，而不是添      加文本框了
       this.getContentPane().add(jp,BorderLayout.CENTER);
        
       
        jp2=new JPanel();jp2.setLayout(new BorderLayout());
        jl2=new JLabel("                                   目的文件");
        jp2.add(jl2,"North");
        at2=new JTextArea();at2.setEditable(false);
        at2.setLineWrap(true);
       JScrollPane jsp2=new JScrollPane(at2);//新建一个滚动条界面，将文本框传入  
     
        jp2.add(jsp2,"Center");
        
     this.getContentPane().add(jp2,BorderLayout.SOUTH);
      jp2.setPreferredSize(new Dimension(260, 260));
	
	setVisible(true);
	setBounds(300, 100, 600, 600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public static void main(String[]args){


	new TestMenu();
}

 class Bt implements ActionListener{
public void actionPerformed(ActionEvent e) { 



     
  
   jpanel.add(jL);
   jpanel.add(text);
   jpanel.add(jL2);
   jpanel.add(text2);
   jpanel.add(button);
   HHH.getContentPane().add(  jpanel,BorderLayout.CENTER);
        
HHH.pack();
HHH.setSize(300,150);
HHH.setVisible(true);

if(e.getSource()==button)

{File file = new File("C:\\Users\\Administrator\\Desktop\\" + text.getText() + ".txt") ;
		try{
		 input = new Scanner(file) ;
                   }
                catch (IOException y) 
                   {
			
			y.printStackTrace();
		    }
		 str = new StringBuffer() ;
               //String str = new String() ;
		while(input.hasNext()){
			str.append(input.nextLine()).append("\n") ;
                        
		}
	
    String str1 = new String(str) ;
                      at.append(str1);/////////////

        
			int[] num = new int[26] ;
	    	        int maxnum = 0;
	    	       int k = 0 ;
	    	       for(int i=0 ;i<str.length();i++){
	    		switch(str.charAt(i)){
	    		    case 'a':num[0] = num[0] + 1 ;break;
	    		    case 'b':num[1] = num[1] + 1 ;break;
	    		    case 'c':num[2] = num[2] + 1 ;break;
	    		    case 'd':num[3] = num[3] + 1 ;break;
	    		    case 'e':num[4] = num[4] + 1 ;break;			    		    
	    		    case 'f':num[5] = num[5] + 1 ;break;
	    		    case 'g':num[6] = num[6] + 1 ;break;
	    		    case 'h':num[7] = num[7] + 1 ;break;			    		    
	    		    case 'i':num[8] = num[8] + 1 ;break;
	    		    case 'j':num[9] = num[9] + 1 ;break;			    		    
	    		    case 'k':num[10] = num[10] + 1 ;break;
	    		    case 'l':num[11] = num[11] + 1 ;break;			    		    
	    		    case 'm':num[12] = num[12] + 1 ;break;
	    		    case 'n':num[13] = num[13] + 1 ;break;
	    		    case 'o':num[14] = num[14] + 1 ;break;
	    		    case 'p':num[15] = num[15] + 1 ;break;
	    		    case 'q':num[16] = num[16] + 1 ;break;
	    		    case 'r':num[17] = num[17] + 1 ;break;
	    		    case 's':num[18] = num[18] + 1 ;break;
	    		    case 't':num[19] = num[19] + 1 ;break;
	    		    case 'u':num[20] = num[20] + 1 ;break;
	    		    case 'v':num[21] = num[21] + 1 ;break;
	    		    case 'w':num[22] = num[22] + 1 ;break;
	    		    case 'x':num[23] = num[23] + 1 ;break;
	    		    case 'y':num[24] = num[24] + 1 ;break;
	    		    case 'z':num[25] = num[25] + 1 ;break; 		    
	    		}	    		
	    	}
	    	for(int j = 0 ;j<num.length ;j++){
    			if(maxnum < num[j]) {
    				maxnum = num[j] ;
    				k = j;
    			}	
	    	}
    		int key = k - 4 ;
    		
		try{
			File result = new File("C:\\Users\\Administrator\\Desktop\\" + text2.getText() + ".txt") ;
			if(!result.exists()){     //对存放的文本进行判断是否存在，如果不存在将新建
			result.createNewFile() ;
		}

    		         output = new PrintWriter(result) ;
 }  catch (IOException x) 
                   {
			
			x.printStackTrace();
		    }
			for(int n = 0 ; n< str.length() ; n++){
				if((str.charAt(n)>='a'&&str.charAt(n)<='z')
						||(str.charAt(n)>='A'&&str.charAt(n)<='Z')){
					str.insert(n, (char) (str.charAt(n) - key)) ;
					str.deleteCharAt(n+1) ; 			
					if((str.charAt(n)<'A'&&str.charAt(n)>='A'-key)
						||(str.charAt(n)<'a'&&str.charAt(n)>='a'-key)){								
						str.insert(n, (char) (str.charAt(n) + 26)) ;				
						str.deleteCharAt(n+1) ; 	
					}
				}}

                              output.print(str);
                              output.close() ;
                         
  
                                   String str2 = new String(str) ;
                                   at2.append(str2);
                                   


}//if


} 
}
//////////////////////////////////////////////////////////////////////////
class Ct implements ActionListener{
public void actionPerformed(ActionEvent c) { 



     
  
   jpanel2.add(jL3);
   jpanel2.add(text3);
   jpanel2.add(jL4);
   jpanel2.add(text4);
   jpanel2.add(button1);
   FFF.getContentPane().add(  jpanel2,BorderLayout.CENTER);
        FFF.pack();
        FFF.setSize(300,150);
        FFF.setVisible(true);

if(c.getSource()==button1)
  {File file = new File("C:\\Users\\Administrator\\Desktop\\" + text3.getText() + ".txt") ;
		try{
		 input = new Scanner(file) ;
                   }
                catch (IOException w) 
                   {
			
			w.printStackTrace();
		    }
		 str = new StringBuffer() ;
               //String str = new String() ;
		while(input.hasNext()){
			str.append(input.nextLine()).append("\n") ;
                        
		}
	
    String str3 = new String(str) ;
                      at.append(str3);/////////////
    try{
                File result = new File("C:\\Users\\Administrator\\Desktop\\" + text4.getText() + ".txt") ;
		if(!result.exists()){     //对存放的文本进行判断是否存在，如果不存在将新建
			result.createNewFile() ;
		}
		 output = new PrintWriter(result) ;
		//利用PrintWriter类对文本写入。
         }catch (IOException z) 
                   {
			
			z.printStackTrace();
		    }
                int key=4;
		for(int i = 0 ; i<str.length() ; i++){     //利用秘钥key进行加密
			if((str.charAt(i)>='a'&&str.charAt(i)<='z') 
				||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){   //判断该字符是不是英文字母
				str.insert(i, (char) (str.charAt(i) + key)) ;
				//如果是则利用秘钥key进行加密，将加密后的字母插入string中
				str.deleteCharAt(i+1) ;                //删除原来的字符
				if((str.charAt(i)>'z'&&str.charAt(i)<='z'+key)    				
					||(str.charAt(i)<'Z'+key&&str.charAt(i)>'Z')){
					//如果加密后的字符超出字母边界，则将字符替换为前面的字母
				str.insert(i, (char) (str.charAt(i) -26)) ;  //替换为字母,插入string中
				str.deleteCharAt(i+1) ; 	   //删除原来字符
				}
			}
		}
		output.print(str) ;   //将string输出到文本中
		output.close() ;
               String str4 = new String(str) ;
               at2.append(str4);
              




}//if


}}


}
