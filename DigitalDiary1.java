import java.util.*;

import java.io.IOException;


class Intelligence {
	 
	void Intelligence1()/*throws IOException,InterruptedException*/ {
	
		System.out.println("WELCOME TO THE SOMAIYA IQ CHECK");
		Scanner sc=new Scanner(System.in);
		float mentalage,actualage,iq;
		System.out.println("Please enter your mental age or the a number you wish to attach to your mental maturity.");
		mentalage=sc.nextFloat();
		System.out.println("Please enter your actual age");
		actualage=sc.nextFloat();
		
		iq=(mentalage/actualage)*100;
		
		if (iq < 100)
		{
		
		System.out.print("You must introspect yourself and try to improve your brain.\n");
		
		System.out.print("Your IQ is ");
		System.out.print(iq);
		}
		if (mentalage == actualage)
		{
		 
		 System.out.print("You have a good brain!");
		 
		 System.out.print("Your IQ is ");
		 System.out.print("100");
		}
		if (iq > 100 && iq <= 159)
		{
		 
		 System.out.print("You are extremely smart! ");
		 
		 System.out.print("Your IQ is ");
		 System.out.print(iq);
		}
		if (iq > 160)
		{
		
		System.out.print("You are the next Einstein! ");
		
		System.out.print("Your IQ is ");
		System.out.print(iq);
		}

		String choice;
		System.out.println("Would you like to check your IQ again ?Y/N");
		choice=sc.next();
		Digital d=new Digital();
		if(choice.equalsIgnoreCase("Y")) {
			Intelligence1();
			
		}
		else {
		//ProcessBuilder p = new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			//Runtime.getRuntime().exec("cls");
			
			d.D();
		}
	}


}

 class Index {

	public void Index1() {
		float h;
		float w;
		float bmi;
		Scanner s=new Scanner(System.in);
		System.out.println("BODY MASS INDEX ");
		
		System.out.println("YOUR HEIGHT(in meters): ");
		h = s.nextFloat();
		
		System.out.println("YOUR WEIGHT(in kilograms): ");
		w = s.nextFloat();
		bmi = w /(h*h);
		
		System.out.println("Your BMI: \n");
		System.out.println(bmi);
		
		if (bmi < 18)
		{
		 System.out.println("\nYou are UNDERWEIGHT. ");
		}
		else if (bmi > 22)
		{
		System.out.println("\nOh No! You're a bit OVERWEIGHT!");
		}
		else
		{
		System.out.println("\nYou are PERFECTLY HEALTHY! ");
		}
		
		
		String choice;
		System.out.println("Would you like to check your BMI again ?Y/N");
		choice=s.next();
		Digital d=new Digital();
		if(choice.equalsIgnoreCase("Y")) {
			Index1();
			
		}
		else {
		//ProcessBuilder p = new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			//Runtime.getRuntime().exec("cls");
			
			d.D();
		}		
		}
	}


class Hor {
	public void Hor1() {
		Scanner s= new Scanner(System.in);
		int month;
		int date;
		System.out.println("Enter your birthdate (1-31):");
		date=s.nextInt();
		System.out.println("Enter your birth month(1-12):");
		month=s.nextInt();
		if((month==1 && date >=20)||(month==2 && date <=18)) {
			System.out.println("Your zodiac sign is AQUARIUS. Your mind is such a sprawling playground right now that you can conjure up any given image in a split second -- and it should only take you a few more split seconds after that to figure out how to rearrange reality to make room for that fantasy to come to life. Try to expand your field of awareness by taking in a more diverse media diet, rich in conflicting viewpoints and alternate sources of information.");
		}
		else if((month==2 && date >=19)||(month==3 && date <=20)) {
			System.out.println("Your zoadiac sign is PISCES. It's hard for you to predict what you might say or do when startled -- and that goes for nearly any surprising situation. Right now, you're feeling a bit more emotional than usual, so if there's anyone who's been toying with you, it might be wise to warn them that they can't count on you always being this nice. You've got two opposing forces battling it out inside you right now, and either one could win.");
		}
		else if((month==3 && date >=21)||(month==4 && date <=19)) {
			System.out.println("Your zodiac sign is ARIES. Your life has been rather interesting recently. You've challenged authority and come away virtually unscathed, and then you moved on to handle cranky relatives, jealous friends and a partner with a bit of an attitude for no good reason. It's long past time for you to take a break and allow the universe to arrange for a last-minute change of plans that is sure to work out well for you.");
		}
		else if((month==4 && date>=20)||(month==5 && date <=20)) {
			System.out.println("Your zodiac sign is TAURUS. You're always thoughtful when it comes to bonds with loved ones -- especially right now. You should happily do whatever it takes to keep these bonds just as strong as ever, even if it's inconvenient at the moment. You're paying attention to what your instincts (not your mind) tell you to do -- which means that friends and family who've always thought of you as the practical one may be quite surprised. Keep them guessing!");
		}
		else if((month==5 && date >=21)||(month==6 && date <=20)) {
			System.out.println("Your zodiac sign is GEMINI. Relationships of any kind from love to work should motor along on their own for now -- it's like you don't have to do a thing to make people happy! This may also apply to encounters with scary authority figures and even those with whom you've previously had difficulties. You should be pleasantly surprised, in fact, at what finally happens -- maybe a raise, bonus or promotion you never dreamed you'd see this soon.");
		}
		else if((month==6 && date>=21)||(month==7 && date<=22)) {
			System.out.println("Your zodiac sign is CANCER. You've been working hard to keep your life under control for quite a while, but it hasn't been all that easy for you. Don't let that bring you down at this point. If you can just manage to keep it all going for a little while longer, you should be quite pleasantly surprised at how terrifically it all turns out. Your mission now is simply to keep your eye on the ball, no matter what else might distract you.");
		}
		else if((month==7 && date>=23)||(month==8 && date<=22)) {
			System.out.println("Your zodiac sign is LEO. You definitely have moments when you feel the need to indulge yourself in some high-quality time on your own. You don't feel even a little lonely while you're at it, either! You may be able to get it all over within an evening -- try tonight. Sit down with your yearbooks, photo album or whatever else reminds you of the (more or less) good old days just reminisce. Remember that the best really is yet to come.");
		}
		else if((month==8 && date>=23)||(month==9 && date<=22)) {
			System.out.println("Your zodiac sign is VIRGO. You don't let little things slide, for the most part. You may even take delight in your reputation for focusing a bit too much on details. Right now, one little thing could easily ruin one very big, very wonderful thing -- something that's been going along quite well, otherwise. You need to remind yourself (and, more importantly, those around you) not to lose sight of the forest for the trees.");
		}
		else if((month==9 && date>=23)||(month==10 && date<=22)) {
			System.out.println("Your zodiac sign is LIBRA. You can often be more reasonable toward others than they deserve. You give almost anyone the benefit of the doubt, even if all your friends tell you not to. If someone tells you now that you're not being fair, consider the source -- and their motivations. If you can't see any reasons other than simple selfishness -- and that wouldn't be surprising -- do what your conscience tells you to do.");
		}
		else if((month==10 && date>=23)||(month==11 && date<=21)) {
			System.out.println("Your zodiac sign is SCORPIO. Someone you thought you knew quite well manages to surprise you -- and while it's not in an entirely bad way, it's certainly in an unexpected way. When someone you love acts totally out of character, you're left wondering what to do about it. You may even be a bit worried at first. Don't fret! Consider how much fun they're having while they're raising eyebrows and stirring up a conversation.");
		}
		else if((month==11 && date>=22)||(month==12 && date<=21)) {
			System.out.println("Your zodiac sign is SAGITTARIUS. If a friend or family member seems intent upon removing themselves from the world (for a while) and you're expected to drag them back, think before saying yes. You've had the need yourself to put some distance between you your people. Leave them alone as much as you can. Make sure they're all right, of course, and that they don't want for anything, but if that's all good, then so are they.");
		}
		else if((month==12 && date>=22)||(month==1 && date<=19)) {
			System.out.println("Your zodiac sign is CAPRICORN. You figured out long ago that the best way to bring your dreams to life is to tackle them as realistically as you can. You've got to work extra hard now to make your current fantasies come true. Even though you are ready, willing and able, you may not be entirely confident that you can bring it about. Remember that doubt is fatal to dreams. Get a move on!");
		}
		System.out.println(" ");
	
		String choice;
		System.out.println("Would you like to check your horoscope again ?Y/N");
		choice=s.next();
		Digital d=new Digital();
		if(choice.equalsIgnoreCase("Y")) {
			Hor1();
			
		}
		else {
		//ProcessBuilder p = new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			//Runtime.getRuntime().exec("cls");
			
			d.D();
		}
	
	
	
	}
}


class Calc {
	Scanner s=new Scanner(System.in);
	public void oper() {
		//double x,y;
		double ans;
		String op,opr1,opr2,cal,oprn;
		System.out.println("   WELCOME TO THE CALCULATOR!");
		System.out.println("Under basic calculator, we have:");
		System.out.print("1. Addition		");
		System.out.println("2. Subtraction");
		System.out.print("3. Multiplication	");
		System.out.println("4. Division");
		System.out.print("5. Exponent");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Under scientific calculator, we have:");
		System.out.print("1. Natural log(log)	");
		System.out.println("2. Sine(sin)");
		System.out.print("3. Cosine(cos)		");
		System.out.println("4. Tangent(tan)");
		System.out.print("5. Secant(sec)		");
		System.out.println("6. Cosecant(cosec)");
		System.out.print("7. Cotangent(cot)");
		System.out.println(" ");
		System.out.println("Enter which calculator you want to consider(b/s): ");
		//System.out.println("Press 'q' to Quit!");
		cal=s.next();
		String str;
		if(cal.equalsIgnoreCase("b")) {
			System.out.println("Enter the expression you wanna calculate (number<space>operator<space>number):");
			str=s.nextLine();
			str=s.nextLine();
			StringTokenizer st= new StringTokenizer(str," ");
			opr1=st.nextToken();
			op=st.nextToken();
			opr2=st.nextToken();
			//char ch=oprn.charAt(1);
			
			if(op.equals("+")) { 
				ans=add(Double.parseDouble(opr1),Double.parseDouble(opr2));
				System.out.println("The answer is "+ans);
			}
			else if(op.equals("-")) {
				ans=subt(Double.parseDouble(opr1),Double.parseDouble(opr2));
				System.out.println("The answer is "+ans);
			}
			else if(op.equals("*")) {
				ans=mult(Double.parseDouble(opr1),Double.parseDouble(opr2));
				System.out.println("The answer is "+ans);
			}
			else if(op.equals("/")) {
				ans=div(Double.parseDouble(opr1),Double.parseDouble(opr2));
				System.out.println("The answer is "+ans);
			}
			else if(op.equals("^")) {
				ans=expo(Double.parseDouble(opr1),Double.parseDouble(opr2));
				System.out.println("The answer is "+ans);
			}
		}
		else if(cal.equalsIgnoreCase("s")) {
			System.out.println("Enter the expression you wanna calculate (operator<space>number):");
			str=s.nextLine();
			str=s.nextLine();
			//System.out.println(str);
			StringTokenizer st= new StringTokenizer(str," ");
			op=st.nextToken();
			opr1=st.nextToken();
			if(op.equalsIgnoreCase("sin")) {
				ans=sine(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
			else if(op.equalsIgnoreCase("cos")) {
				ans=cosin(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
			else if(op.equalsIgnoreCase("tan")) {
				ans=tan(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
			else if(op.equalsIgnoreCase("cosec")) {
				ans=cose(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
			else if(op.equalsIgnoreCase("sec")) {
				ans=sec(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
			else if(op.equalsIgnoreCase("cot")) {
				ans=cot(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
			else if(op.equalsIgnoreCase("log")||op.equalsIgnoreCase("ln")) {
				ans=logar(Double.parseDouble(opr1));
				System.out.println("The answer is "+ans);
			}
		}
		String choice;
		System.out.println("Would you like to use your calculator again ?Y/N");
		choice=s.next();
		Digital d=new Digital();
		if(choice.equalsIgnoreCase("Y")) {
			oper();
			
		}
		else {
		//ProcessBuilder p = new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			//Runtime.getRuntime().exec("cls");
			
			d.D();
		}
	
	}
	public static double fact(double x) {
		if(x==0) return 1;
		if(x==1) return 1;
		else return x*fact(x-1);
	}
	public static double add(double x,double y) {
		return x+y;
	}
	public static double subt(double x,double y) {
		return x-y;
	}
	public static double mult(double x,double y) {
		return x*y;
	}
	public static double div(double x,double y) {
		double m=0;
		try {
			m=x/y;
		}catch(Exception e) {System.out.println("Infinity");}
		return m;
	}
	public static double expo(double x,double y) {
		return Math.pow(x,y);
	}
	public static double sine(double x) {
		return Math.sin(Math.toRadians(x));
	}
	public static double cosin(double x) {
		return Math.cos(Math.toRadians(x));
	}
	public static double tan(double x) {
		return Math.tan(Math.toRadians(x));
	}
	public static double cose(double x) {
		double cosec;
		cosec=1/sine(x);
		return cosec;
	}
	public static double sec(double x) {
		double secx;
		secx=1/cosin(x);
		return secx;
	}
	public static double cot(double x) {
		double cota;
		cota=1/tan(x);
		return cota;
	}
	public static double logar(double x) {
		return Math.log(x);
	}

}




 
class Addressmethods extends Exception{
	
	 String Firstname,Lastname,Pno;
	 int i,j; 
	 Scanner scc=new Scanner(System.in);
	 
	 public void addcontact(String b[][],int n) 
	 {
		/*Method adds contacts based on the original array of strings and number of contacts 
		/*System.out.println("Please enter the number of contacts you wish to add.");
		 n=sc.nextInt();
		
		b=new String[n][];*/
		
		System.out.println("\nPlease enter the details of your contacts.");
		for(i=0;i<n;i++) {
	    	b[i]=new String[3];
			System.out.println("First Name");
			Firstname=scc.next();
			b[i][0]=Firstname;
			System.out.println("Last Name");
			Lastname=scc.next();
			b[i][1]=Lastname;
			System.out.println("Phone Number");
			Pno=scc.next();
			b[i][2]=Pno;
			System.out.println("Contact succesfully added.\n");
		}
		System.out.println("Your contact details are:");
		for(i=0;i<n;i++) {
			//System.out.println("\n");
			for(j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
			}
		System.out.println(" ");
	 }
	 }
		public void searchcontact(String b[][],int n)throws NullPointerException {
		
		/*This method works the same way as the first. Taking the array of strings and
		 number of contacts from main.*/
			/*problem with this is that it throws exception for searching deleted element.*/
			
		System.out.println("Enter the method by which you wish to search the contact.");
		System.out.println("1.First Name.");
		System.out.println("2.Last Name.");
		System.out.println("3.Phone Number.");
		int opt=scc.nextInt();
		int flag=0;
			switch(opt) {
			case 1: System.out.println("Searching by First Name....");
			        System.out.println("Please enter the name:");
			        Firstname=scc.next();
			        try {
			        for(i=0;i<n;i++) {
			        		if(b[i][0].equals(Firstname) ){ 
			        			flag=1;
								break;
			        		}
			        }
			        if(flag==1) {
			        	System.out.println("Contact found.");
			        	for(i=0;i<n;i++) {
			        		if(b[i][0].equals(Firstname)) {
			        		System.out.println(b[i][0]);
			        		System.out.println(b[i][1]);
			        		System.out.println(b[i][2]);
			        	}
			        }
			        }
			        if(flag==0)
			        	System.out.println("Doesn't exist.");
			        }catch(Exception e) {
			        	System.out.println("Contact doesn't exist no more.");
			        }
			        break;
			case 2: System.out.println("Searching by Last Name....");
			        System.out.println("Please enter the name:");
			        Lastname=scc.next();
			        try {
			        for(i=0;i<n;i++) {
			        		if(b[i][1].equals(Lastname)) {
			        			flag=1; //Error here for searching deleted lastname
								break;
			        		}
			        }
			        if(flag==1) {
			        	System.out.println("Contact exists.");
			        	for(i=0;i<n;i++) {
			        		if(b[i][1].equals(Lastname)) {
			        		System.out.println(b[i][0]);
			        		System.out.println(b[i][1]);
			        		System.out.println(b[i][2]);
			        	}
			        	}
			        }
			        if(flag==0)
			        	System.out.println("Doesn't exist.");
			        }catch(Exception e) {
			        	System.out.println("Contact doesn't exist no more.");
			        }
			        break;
			case 3: System.out.println("Searching by Phone Number.....");
			        System.out.println("Please enter the number.");
			        Pno=scc.next();
			        try {
			        for(i=0;i<n;i++) {
			        		if(b[i][2].equals(Pno)) { //Error here for searching deleted no
			        			flag=1;
								break;
			        		}
			        }
			        if(flag==1) {
			        	System.out.println("Contact exists.");
			        	for(i=0;i<n;i++) {
			        		if(b[i][2].equals(Pno)) {
			        		System.out.println(b[i][0]);
			        		System.out.println(b[i][1]);
			        		System.out.println(b[i][2]);
			        	}
			        }
			        }
			        if(flag==0)
			        	System.out.println("Doesn't exist.");
			        }catch(Exception e) {
			        	System.out.println("Contact doesn't exist no more.");
			        }
			        
			        break;
			case 4: System.exit(0);        
			        
			}
		
		
		
		}
		
			public void deletecontact(String b[][],int n)throws NullPointerException {
		
		System.out.println("Please enter the first name of the contact you wish to delete.");
		String delName=scc.next();
		
		for(i=0;i<n;i++){
				if(b[i][0].equals(delName)) {
					b[i][0]=null;
					b[i][1]=null;
					b[i][2]=null;
				System.out.println("Contact deleted.");
				}
				
				
			}
			}
		
			public void updatecontact(String b[][],int n) {
			System.out.println("To update the phone number of the contact....");
			System.out.println("Please enter previous phone number.");
			String oldphone=scc.next();
			for(i=0;i<n;i++)
				 {
					if(b[i][2].equals(oldphone) ){
						System.out.println("Enter new number.");
						b[i][2]=scc.next();
					}
					
					
				}
			
			}
		
	
}
 class AddressBook {
	 Scanner sc=new Scanner(System.in);
	 int option,n;
	 
	 public void add() {
		//code for creating an address book. Hoping to do it with Multidimensional arrays.
	 System.out.println("Address Book ");
	 Addressmethods a= new Addressmethods();
	 
	 System.out.println("Please enter the number of contacts you wish to add.");
		 n=sc.nextInt();
		 String b[][]=new String[n][];
		a.addcontact(b,n);
		other(b,n);
	}
	
public void other(String b[][],int n) {
	Addressmethods a=new Addressmethods();
	int j=2;
do{
	System.out.println("\nPlease enter what you would like to do.");
	System.out.println("1.SEARCH AND DISPLAY CONTACT.");
	System.out.println("2.UPDATE/MODIFY");
	System.out.println("3.DELETE.");
	System.out.println("4.EXIT");
	
	int option=sc.nextInt();	
if(option==4)
	break;
	switch(option) {
	
	case 1:  System.out.println("Search for existing contact?");
	         a.searchcontact(b,n);
	         break;
	case 2:  System.out.println("Update contact?");
	         a.updatecontact(b,n);
	         break;
	case 3:  System.out.println("Delete contact?");
	         a.deletecontact(b,n);
	         break;
	case 4: break;
	         
	
	}




}while(option!=4);
String choice;
System.out.println("Would you like to use your address book again ?Y/N");
choice=sc.next();
Digital d=new Digital();
if(choice.equalsIgnoreCase("Y")) {
	add();
	
}
else {
//ProcessBuilder p = new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	//Runtime.getRuntime().exec("cls");
	
	d.D();
}

	}
 
}






 class Digital {
	public void D() {
		Scanner s=new Scanner(System.in);
	int opt;
	
	do {
		System.out.println("\n                           What would you like to choose?");
		
		System.out.println("                              1.Body Mass Index.");
		System.out.println("                              2.Intelligence quotient");
		System.out.println("                              3.Horoscope");
		System.out.println("                              4.Calculator.");
		System.out.println("                              5.Address Book.");
		
		opt=s.nextInt();
		
		switch(opt) {
	case 1:  Index i=new Index();
	          i.Index1();
	          break;
	case 2:  Intelligence t=new Intelligence();
	          t.Intelligence1();
	          break;
	case 3:  Hor h=new Hor();
	           h.Hor1();
	           break;
	case 4:  Calc c=new Calc();
	           c.oper();
	          break;
	case 5:  AddressBook d=new AddressBook();
	          d.add();
	          break;
	case 6: break;
	         
	}
		break;
	}while(opt!=6);
	
	}
	
}

public class DigitalDiary1{
	public static void main(String args[]) {
		Digital d=new Digital();
		
			System.out.println("                          WELCOME TO YOUR PERSONAL DIGITAL DIARY.");
		System.out.println("Avinash Bharadwaj                                                              Brinda Ashar");
		d.D();
	}
}
