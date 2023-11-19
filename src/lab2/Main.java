package lab2;


/*
    5) The benefit is the same as abstract classes from the previous lab, but using Interfaces rather than an abstract
    class is better in my opinion. The reason is that classes can implement multiple Interfaces. This also allows for
    more flexibility in developing and maintaining code. For example say we visit this code a year from now and want to
    and more to AdvancedJavaCourse, but it doesn't necessarily fit into the pre-existing categories, we could create another
    interface and have AdvancedJavaCourse also implement that interface along with SoftwareCourse
    Interfaces are like contracts, what ever method is created in an interface is forces upon all the classes that implement it.
    This allows the use of polymorphism to create methods with the same name but unique functionality for each class
    that inherits it.

    6) Liskov Substitution principle should be used when you are creating an instance of class that inherits from a
    parent class. In this example we instantiate an object is this SoftwareCourse course1 = new IntroToProgrammingCourse()
    notation because the object get use of the unique functions and polymorphic functions that are specific to the subclass.
 */
public class Main {
    public static void main(String[] args) {
        SoftwareCourse course1 = new IntroToProgrammingCourse("course", "123");
        SoftwareCourse course2 = new IntroJavaCourse("Awesome course", "123");
        SoftwareCourse course3 = new AdvancedJavaCourse("Super Awesome course", "123");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
