package lab1;

/*
    5) The main thing that I believe to be good about writing abstraction in this manor is that it creates a blueprint
     to the classes that inherit it. This allows for each one of these subclasses use the methods that are derived from
     their parent class (SoftwareCourse) but in their own way. This is beneficial because the classes might have slight
     differences or even major differences and having each class be able to override the parent classes methods to fit
     there needs makes the current code and future code more modular and overall just better.

     The main arguement about not writing code this way is that using abstract classes is limiting in the fact that classes
     can only inherit from one parent class. This make the design ridged and can limit flexablity. A better solution
     would be to use an interface.

     6) writing code in this manor "SoftwareCourse course1 = new AdvancedJavaCourse ();" is better for a few reasons but
     the main reason is that it allows the developer to have access to the methods specific for the subclass. Also, if
     the subclass has unique methods that were not created in the parent classes we would still have access to them (in
     this case it wouldn't really matter because we used an Interface as the parent). Also, this allows for polymorphism
     which allows us to use each classes methods without concerning ourselves with the specific implementations.
 */


public class Main {
    public static void main(String[] args) {
        SoftwareCourse course1 = new AdvancedJavaCourse ("Course", "123");
        SoftwareCourse course2 = new IntroJavaCourse("AwesomeCourse", "456");
        SoftwareCourse course3 = new IntroToProgrammingCourse ("superAwesomeCourse", "789");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

    }
}
