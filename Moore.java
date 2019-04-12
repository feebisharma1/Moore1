import java.util.*;
public class Moore {
	private char state;
	private String output;
	int zero;
	int one;
	
	public Moore() {
		state = ' ';
		output = " ";
		zero = 0;
		one = 0;
	}
	public Moore(char newstate, String newoutput, int newzero, int newone ) {
		state = newstate;
		output = newoutput;
		zero = newzero;
		one = newone;
	}
	
	char getstate() {s
		
		return state;
	}
	
	void setstate() {
		this.state = state;
	}
	
	String getoutput() {
		return output;
	}
	
	void setoutput() {
		this.output = output;
	}
	
	int getone() {
		return one;
	}
	int getzero() {
		return zero;
	}
	
	void moorePrint() {
		System.out.print( "  " + output);
	}

	public static void main(String[] args) {
		Moore objectMoore = null;
		
		Moore object1Moore = new Moore ('A', "00", 2, 4);
		Moore object2Moore = new Moore ('B', "01", 2, 3);
		Moore object3Moore = new Moore ('C', "11", 4, 3);
		Moore object4Moore = new Moore ('D', "10", 3, 1);
		
		Moore[] mooreState = new Moore[5];
		mooreState[0] = new Moore();
		mooreState[1] = object1Moore;
		mooreState[2] = object2Moore;
		mooreState[3] = object3Moore;
		mooreState[4] = object4Moore;
		
		System.out.print("Enter the initial State(A,B,C,D): ");
		Scanner in = new Scanner(System.in);
		char input1 = in.next().charAt(0);
		//System.out.println(input1);
		System.out.print("Enter the input: ");
		String input2 = in.next();
		//System.out.println(input2);
		
		 if (input1 == 'A') {
			 object1Moore.moorePrint();
			 objectMoore = object1Moore;
			 for (int i = 0; i < input2.length(); i++) {
				 String F = input2.substring(i,i+1);
				 if (F.contains("1")) {
					 if(objectMoore == object1Moore) {
						 mooreState[object1Moore.getone()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getone()].moorePrint();
						 objectMoore = object1Moore;
					 }
				 }
				 else {
					 if (objectMoore == object1Moore) {
					 mooreState[object1Moore.getzero()].moorePrint();
					 objectMoore = object2Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getzero()].moorePrint();
						 objectMoore = object2Moore;
						 
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getzero()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getzero()].moorePrint();
						 objectMoore = object3Moore;
					 }
				 }	 
			 }
		 }
		 else if (input1 == 'B') {
			 object2Moore.moorePrint();
			 objectMoore = object2Moore;
			 for (int i = 0; i < input2.length(); i++) {
				 String F = input2.substring(i,i+1);
				 if (F.contains("1")) {
					 if(objectMoore == object1Moore) {
						 mooreState[object1Moore.getone()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getone()].moorePrint();
						 objectMoore = object1Moore;
					 }
				 }
				 else {
					 if (objectMoore == object1Moore) {
					 mooreState[object1Moore.getzero()].moorePrint();
					 objectMoore = object2Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getzero()].moorePrint();
						 objectMoore = object2Moore;
						 
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getzero()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getzero()].moorePrint();
						 objectMoore = object3Moore;
					 }
			     }
		     }
		 }
		 else if (input1 == 'C') {
			 object3Moore.moorePrint();
			 objectMoore = object3Moore;
			 for (int i = 0; i < input2.length(); i++) {
				 String F = input2.substring(i,i+1);
				 if (F.contains("1")) {
					 if(objectMoore == object1Moore) {
						 mooreState[object1Moore.getone()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getone()].moorePrint();
						 objectMoore = object1Moore;
					 }
				 }
				 else {
					 if (objectMoore == object1Moore) {
					 mooreState[object1Moore.getzero()].moorePrint();
					 objectMoore = object2Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getzero()].moorePrint();
						 objectMoore = object2Moore;
						 
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getzero()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getzero()].moorePrint();
						 objectMoore = object3Moore;
					 }
				 }
			 }
		 }
			
		 else if (input1 == 'D') {
			 object4Moore.moorePrint();
			 objectMoore = object4Moore;
			 for (int i = 0; i < input2.length(); i++) {
				 String F = input2.substring(i,i+1);
				 if (F.contains("1")) {
					 if(objectMoore == object1Moore) {
						 mooreState[object1Moore.getone()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getone()].moorePrint();
						 objectMoore = object3Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getone()].moorePrint();
						 objectMoore = object1Moore;
					 }
				 }
				 else {
					 if (objectMoore == object1Moore) {
					 mooreState[object1Moore.getzero()].moorePrint();
					 objectMoore = object2Moore;
					 }
					 else if (objectMoore == object2Moore) {
						 mooreState[object2Moore.getzero()].moorePrint();
						 objectMoore = object2Moore;
						 
					 }
					 else if (objectMoore == object3Moore) {
						 mooreState[object3Moore.getzero()].moorePrint();
						 objectMoore = object4Moore;
					 }
					 else if (objectMoore == object4Moore) {
						 mooreState[object4Moore.getzero()].moorePrint();
						 objectMoore = object3Moore;
					 }
				 }
			 }
		 }
		 
		 else {
			 System.out.print("Out of bounds");
		 }
		 
		 System.out.println();
		 System.out.println("The final State is: " + objectMoore.getstate());
		
	}
	
}
