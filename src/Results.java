
public class Results {

//	Results
//	A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
//	Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
//
//	Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
//	Method 2 - which finds and displays the percentage that the person received for the exams overall.
	public static void main(String[] args) {
		int physics = 120;
		int chemistry = 124;
		int biology = 119;
		int total = 450;
		double perc = (physics + chemistry + biology)/4.5;
		
		display(physics, chemistry, biology, total);
		percentage(perc);

	}
	
	public static void display(int p, int c, int b, int total) {
		System.out.println("Physics: " + p);
		System.out.println("Chemistry: " + c);
		System.out.println("Biology: " + b);
		
		System.out.println("Total: " + (p+b+c)+"/"+total);
	}
	
	public static void percentage(double perc) {
		System.out.println("Percentage: " + perc);
	}

}
