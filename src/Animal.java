public class Animal extends Organism{



    //folowwing the DRY principles
    //because all the children classes will inherit this function
    void eat(){
        System.out.println("The Animal is eating");
    }
}
