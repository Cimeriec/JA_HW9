package example3;

public class Main {
    public static void main(String[] args) {
        AddNewBook generalModule = new AddNewBook() {
            @Override
            public void addBook() {
                Book b = new Book();
                b.setName("IT");
                b.setAuthor("Stephen King");
                b.setPrice(200);
                System.out.println("Book added: " + b);
            }
        };
        AddNewBook generalModuleLambda = () -> {
            Book b = new Book();
            b.setName("Carrie");
            b.setAuthor("Stephen King");
            b.setPrice(250);
            System.out.println("Book added: " + b);
        };
        generalModule.addBook();
        generalModuleLambda.addBook();
    }
}

interface AddNewBook {

    public void addBook();
}