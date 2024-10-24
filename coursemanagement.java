package javaprograms;
import java.util.Scanner;
	class Course {
	    private int id;
	    private String name;
	    private double price;
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }
	}
	interface StudentCourse {
	    void addCourse(Course course) throws Exception;
	    Course[] viewCourses() throws Exception;
	    void calculateTotalFee() throws Exception;
	}
	public class studentcoursemanagement implements StudentCourse {
	    private Course[] courses = new Course[10];
	    private int courseCount = 0;
	    public void addCourse(Course course) throws Exception {
	        if (courseCount < 10) {
	            courses[courseCount++] = course;
	        } else {
	            throw new Exception("Cannot add more courses.");
	        }
	    }
	    public Course[] viewCourses() throws Exception {
	        if (courseCount == 0) {
	            throw new Exception("No courses available.");
	        }
	        return courses;
	    }
	    public void calculateTotalFee() throws Exception {
	        if (courseCount == 0) {
	            throw new Exception("No courses available to calculate fees.");
	        }
	        double totalFee = 0;
	        for (int i = 0; i < courseCount; i++) {
	            totalFee += courses[i].getPrice();
	        }
	        // Apply discount logic
	        double discount = (totalFee > 1500) ? 0.10 : 0.00; // 10% discount if total fee > 1500
	        double finalFee = totalFee - (totalFee * discount);
	        System.out.println("Total Fee before discount: " + totalFee);
	        System.out.println("Final Fee after discount: " + finalFee);
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        studentcoursemanagement semester = new studentcoursemanagement();
	        try {
	            while (true) {
	                System.out.println("Enter course ID (or -1 to stop): ");
	                int id = scanner.nextInt();
	                if (id == -1) break;
	                System.out.println("Enter course name: ");
	                String name = scanner.next();
	                System.out.println("Enter course price: ");
	                double price = scanner.nextDouble();
	                Course course = new Course();
	                course.setId(id);
	                course.setName(name);
	                course.setPrice(price);
	                semester.addCourse(course);
	            }
	            Course[] courses = semester.viewCourses();
	            System.out.println("\nCourses Available:");
	            for (Course course : courses) {
	                if (course != null) {
	                    System.out.println("Course ID: " + course.getId() + ", Name: " + course.getName() + ", Price: " + course.getPrice());
	                }
	            }
	            semester.calculateTotalFee();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}