 package project2;

 import java.io.*;

 public class Main {
 	
 	public double score=0;
 	public int a=7;
 	InputStreamReader reader=new InputStreamReader(System.in);
 	BufferedReader input=new BufferedReader(reader);
 	
 	public static void main(String[] args) throws Exception{
 		// TODO Auto-generated method stub
 		KBC kbc=new KBC();
 		kbc.display();
 		kbc.q1();
 		kbc.q2();
 		kbc.q3();
 		kbc.q4();
 		kbc.q5();
 		kbc.q6();
 		kbc.q7();
 	}

 }