
public class Results {

//	Results
//	A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
//	Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
//
//	Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
//	Method 2 - which finds and displays the percentage that the person received for the exams overall.
	public static void main(String[] args) {
		int physics = 129;
		int chemistry = 115;
		int biology = 110;
		int total;
		double perc;
		
		total = display(physics, chemistry, biology);
		perc = percentage(physics, chemistry, biology);

	}
	
	public static int display(int p, int c, int b) {
		System.out.println("Physics: " + p);
		System.out.println("Chemistry: " + c);
		System.out.println("Biology: " + b);
		
		System.out.println("Total: " + (p+b+c));
		return (p+b+c);
	}
	
	public static double percentage(double p, double c, double b) {
		double temp = (p+b+c)/4.5;
		System.out.println("Percentage: " + temp);
		return temp;
	}

}
