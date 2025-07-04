package project2;

import java.io.*;

public class KBC implements Interface {
	public double score=0;
	public int a=7;
	InputStreamReader reader=new InputStreamReader(System.in);
	BufferedReader input=new BufferedReader(reader);

	@Override
	public void result() throws Exception {
		// TODO Auto-generated method stub
		if (score==0) {
			System.out.printf("your prformance is alarming weak!");		
		}
		else if(score==500000) {
			System.out.println("Congratulations\nyou won 50,000,000$");
		}
		else {
			System.out.println("Better luck next time !!!");
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("____________________");
		System.out.println("Hello! Everyone,here starts the KBC- Koun Banega Corepati !!!");
		System.out.println("Answer all the questions and win 50,000,000$");
		System.out.println("Rules:\n1.Only one chance of answering will be given\n2.For every question you will get a chance to win the exclusive price");
		System.out.println("___________________");
	}

	@Override
	public void q1() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Q1: Who is the king of the world?");
		System.out.println("1:Alpha\n2:Beta\n3:Gamma\n4:None\nSelect your answer :  ");
		String n=input.readLine();
		a=Integer.parseInt(n);
		if(a==1) {
			System.out.println("Congratulations!");
			score=100000;
		}else {
			System.out.println("wrong answer!!\ncorrect answer is 1:Alpha.");
			System.out.println("your first answer is wrong");
			System.out.println("Sorry.you cannot win the prize");
		}
		System.out.println("you have won "+score+"$");
	}

	@Override
	public void q2() throws Exception {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("Q2: The symbol of element gold in modern periodic table?");
		System.out.println("1:Au\n2:Gd\n3:Sn\n4:Tn\nSelect your answer :  ");
		String n=input.readLine();
		a=Integer.parseInt(n);
		if((a==1)&&(score>=100000)) {
			System.out.println("Congratulations!");
			score=500000;
		}else if(a==1) {
			System.out.println("Correct answer but you can't win the prize,but you can proceed further");
		}else {
			System.out.println("wrong answer!!\ncorrect answer is 1:Au.");
		}
		System.out.println("Your AMOUNT is"+score+"$");
	}

	@Override
	public void q3() throws Exception {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("Q3: Which of these is an Operating System?");
		System.out.println("1:DOS\n2:Windows 2000\n3:BASIC\n4:UNIX\nselect your answer :  ");
		String n=input.readLine();
		a=Integer.parseInt(n);
		if((a==3)&&(score>=500000)) {
			System.out.println("Congratulations!!");
			score=100000;
		}else if(a==3) {
			System.out.println("correct answer but you can't win the prize,but you can proceed further");
		}else {
			System.out.println("Wrong Answer !!\ncorrect answer is 3: BASIC.");
		}
		System.out.println("your AMOUNT is "+score+"$");

	}

	@Override
	public void q4() throws Exception {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("Q4: Which of these is not a part of MS-Office ?");
		System.out.println("1:MS-Access\n2:FoxPro\n3:MS-Excel\n4:MS-PowerPoint\nSelect your option :  ");
		String n= input.readLine();
		a=Integer.parseInt(n);
		if((a==2)&&(score>=100000)) {
			System.out.println("Congratulations!!");
			score=200000;
		}else if(a==2) {
			System.out.println("correct answer but you can't win the prize,but you can proceed further");
		}else {
			System.out.println("Wrong Answer !!\ncorrect answer is 2: FoxPro.");
		}
		System.out.println("your AMOUNT is "+score+"$");
	}

	@Override
	public void q5() throws Exception {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("Q5: Which of these is a computer language ?");
		System.out.println("1:Pascal\n2:dBASE\n3:Oracle\n4:UNIX\nSelect your option :  ");
		String n= input.readLine();
		a=Integer.parseInt(n);
		if((a==1)&&(score>=200000)) {
			System.out.println("Congratulations!!");
			score=300000;
		}else if(a==1) {
			System.out.println("correct answer but you can't win the prize,but you can proceed further");
		}else {
			System.out.println("Wrong Answer !!\ncorrect answer is 1: Pascal.");
		}
		System.out.println("your AMOUNT is "+score+"$");
	}

	@Override
	public void q6() throws Exception {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("Q6: Which of these is a High Level language ?");
		System.out.println("1:DOS\n2:JAVA\n3:BASIC\n4:BLUEJ\nSelect your option :  ");
		String n= input.readLine();
		a=Integer.parseInt(n);
		if((a==2)&&(score>=300000)) {
			System.out.println("Congratulations!!");
			score=400000;
		}else if(a==2) {
			System.out.println("correct answer but you can't win the prize,but you can proceed further");
		}else {
			System.out.println("Wrong Answer !!\ncorrect answer is 2: JAVA.");
		}
		System.out.println("your AMOUNT is "+score+"$");
	}

	@Override
	public void q7() throws Exception {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("Q6: Which of these is not an Database Program ?");
		System.out.println("1:MS-Excess\n2:dBASE\n3:FoxPro\n4:Bluej\nSelect your option :  ");
		String n= input.readLine();
		a=Integer.parseInt(n);
		if((a==4)&&(score>=400000)) {
			System.out.println("Congratulations!!");
			score=500000;
		}else if(a==4) {
			System.out.println("correct answer but you can't win the prize,but you can proceed further");
		}else {
			System.out.println("Wrong Answer !!\ncorrect answer is 4: Bluej.");
		}
		System.out.println("your AMOUNT is "+score+"$");
	}

}