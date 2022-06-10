package ioPackage;

/* CONFIDENTIAL - INTELLECTUAL PROPERTY OF DEPARTMENT OF COMPUTATAIONAL SCIENCES */


import java.io.*;  
public class JavaIoDemo {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\JavaIo.txt");  
             FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Desktop\\DocsCipherX.txt");
             
             
             /*String s = "This is the demo for Java IO";
             byte b[] = s.getBytes();
             fout.write(b);    
             fout.close(); 
             for(int i = 0; i < b.length; i++) {
            	 System.out.print(b[i]);
             }*/
             //int inp = fin.read();
             
             
             /*int i;
             while((i = fin.read())!=-1) {
            	 System.out.print((char)i);
             }
             fin.close();*/
             
             
             /*BufferedOutputStream bos = new BufferedOutputStream(fout);
             String s = "Now We are using  buffered output";
             byte b[] = s.getBytes();
             bos.write(b);
             bos.flush();
             fout.close();
             bos.close();*/
             
             
             /*BufferedInputStream bin = new BufferedInputStream(fin);
             int i;
             while((i = bin.read())!=-1) {
            	 System.out.println((char)i);
             }
             //bin.flush();
             fout.close();
             bin.close();*/
             
             //===============================================================
             /* From Here Onwards we are going to demonstrate the Writer Class */
             
             
             /*Writer w = new FileWriter("D:\\JavaIo.txt");
             String s = "this is file writer";
             w.write(s);
             w.close();*/
             
             
             
           //======================
             //=========================================
             /* From Here Onwards we are going to demonstrate the Reader Class */
             
             /*Reader r = new FileReader("C:\\Users\\HP\\Desktop\\DocsCipherX.txt");
             int data = r.read();
             while(data  != -1) {
            	 System.out.print((char) data);
            	 data = r.read();
             }
             r.close();*/
             
             
             
             FileWriter fw = new FileWriter("D:\\JavaIo.txt");
             BufferedWriter bw = new BufferedWriter(fw);
             String s = "Buffer writer demo";
             bw.write(s);
             bw.flush();
             fw.close();
             bw.close();
             
             
             
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
             
             
          
      }    
}  
