package Assignment_For_04_05_2018;

public class AdultUser implements LibraryUser {

    int age =0;
    String bookType=" ";

    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age > 12) {

            System.out.println("You have successfully registered under a Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if(bookType.equalsIgnoreCase("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
