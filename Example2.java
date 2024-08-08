package pk2;
import pk1.Student;
class Example2
{
public static void main(String []args)
{
Student std = new Student();
std.setRoll(17);
std.setname("Anjali Tandukar");
System.out.println("Roll=" +std.getRoll());
System.out.println("Name=" +std.getname());
}
}