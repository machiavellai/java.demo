
public class Student {
            String name = "SpongeBob";
            int age;
            double gpa;
            boolean isEnrolled;

            //setting up a constructor
            //to be able to add a new class ...e.t.c
            Student(String name, int age, double gpa){
                //passing the attributes here we use the this. operator
                //and points to the object we are working on
                this.name = name;
                this.age = age;
                this.gpa = gpa;
            }

            //creating a method
    void study(){
        System.out.println(this.name + " is SStudying");
    }

}
