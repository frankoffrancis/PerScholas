package Assignment_For_04_05_2018;
public class LibraryInterfaceDemo {

    public static void main(String[] args){

        LibraryUser kids = new KidUsers();
        LibraryUser adult = new AdultUser();
        // Test case 1
        kids.registerAccount(10);
        kids.registerAccount(18);
        kids.requestBook("Kids");
        kids.requestBook("Fiction");
        System.out.println();
        //Test Case 2
        adult.registerAccount(5);
        adult.registerAccount(23);
        adult.requestBook("Kids");
        adult.requestBook("Fiction");
    }
}
