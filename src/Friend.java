public class Friend {

   static int numOfFriends;
    String name;

    //Now we want to use static keyword so it can keep in memory of the changes


    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    //for static attributes you don't need the this. operator to access the constructor obj
    static  void showFriends(){
        System.out.println("You have " + numOfFriends  + " total friends");
    }
}
