
class Employee {
	int Salary = 60000;
}
class Engineering extends Employee {
	int Bonus = 10000;
}
class Inheritance {
	public static void main(String[] args) {
		Engineering E1 = new Engineering();
		System.out.println("Salary: "+E1.Salary +
				"\n Bonus" + E1.Bonus);
	}

}
