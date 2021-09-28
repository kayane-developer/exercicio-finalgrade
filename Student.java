package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalgrade () {
		return grade1+grade2+grade3;
	}
	public String toString () {
		if (finalgrade() >= 60) {
			return "FINAL GRADE: "
				+ String.format("%.2f%nPASS", finalgrade());
		}
		else {
			return "FINAL GRADE: "
				+ finalgrade()
				+ String.format ("%nFAILED%nMISSING: %.2f points", 60 - finalgrade()); 
			
		}
	}

}
