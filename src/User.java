public class User {
    String username;
    String email;
    int age;


    User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age=  0;
    }
    //this is a random custroctor
    User(String username){
            this.username= username;
            this.email = "Not Provided";
            this.age = 0;
    }
//    now we are creating another contstructor of the same
//    name but the rule here is that they must be of different parameters

    User(String username, String email){
        this.username= username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age){
        this.username= username;
        this.email = email;
        this.age = age;
    }
}
