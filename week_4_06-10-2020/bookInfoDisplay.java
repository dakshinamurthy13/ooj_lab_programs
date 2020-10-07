import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private int numberOfPages;
    private int yearOfPublication;
    private int bookId;
    private String publisher;
    private float price;

    public void inputBookDetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the book id");
        bookId=s.nextInt();
        System.out.println("Enter the book title name");
        s.nextLine();
        title=s.nextLine();
        System.out.println("Enter the book author name");
        author=s.nextLine();
        System.out.println("Enter the number of pages in the book ");
        numberOfPages=s.nextInt();
        System.out.println("Enter the year of publishing of the book");
        yearOfPublication=s.nextInt();
        System.out.println("Enter the publisher of the book");
        s.nextLine();
        publisher=s.nextLine();
        System.out.println("Enter the price of the book");
        price=s.nextFloat();
        System.out.println("");
    }
    public void displayBookDetails(){
        System.out.println("");
        System.out.println("Name of book :"+title);
        System.out.println("Book ID :"+bookId);
        System.out.println("Name of the author is :"+author);
        System.out.println("The number of pages in the book are :"+numberOfPages);
        System.out.println("Year of publishing :"+yearOfPublication);
        System.out.println("Publisher :"+publisher);
        System.out.println("Price of the book :"+price);
        System.out.println("");
    }
    public void displayBookTitle(){
        System.out.println("");
        System.out.println("Name of the most expensive book is:"+title);
        System.out.println("");
    }
    public String getAuthorName(){
        return author;
    }
    public float getPrice(){
        return price;
    }
    public int getYearPublication(){
        return yearOfPublication;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
}
class BookMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total number of books");
        int n=s.nextInt();
        Book b[]=new Book[n];
        System.out.print("Enter the details of book ");
        for(int i=0;i<n;i++){
            b[i]=new Book();
            System.out.print((i+1)+" :");
            System.out.println("");
            b[i].inputBookDetails();
        }
        for(int i=0;i<n;i++){
            System.out.println("");
            System.out.println("The details of book "+(i+1));
            b[i].displayBookDetails();
        }
        System.out.println("");
        System.out.println("Enter the Name of Author to find book of that author");
        s.nextLine();
        String authorName=s.nextLine();
        for(int i=0;i<n;i++){
            String name=b[i].getAuthorName();
            if(name.equals(authorName)){
                System.out.println("");
                System.out.println("The book details of book with entered author name is :");
                b[i].displayBookDetails();
                break;
            }
        }
        float expensive=b[0].getPrice();
        for(int i=0;i<n;i++){
            if(expensive>b[i].getPrice())
                expensive=b[i].getPrice();
        }
        for(int i=0;i<n;i++){
            if(expensive==b[i].getPrice())
                b[i].displayBookTitle();
        }
        int countOfBooksInYear2020=0;
        for(int i=0;i<n;i++){
            if(b[i].getYearPublication()==2020)
                countOfBooksInYear2020++;
        }
        if(countOfBooksInYear2020>0){
            System.out.println("");
            System.out.println("The number of book published in the year 2020 are "+countOfBooksInYear2020+".");
            System.out.println("");
        }
        else{
                System.out.println("");
                System.out.println("THere are  no books published in the year 2020.");
                System.out.println("");
        }
        int leastPages=b[0].getNumberOfPages();
        for(int i=0;i<n;i++){
            if(leastPages>b[i].getNumberOfPages())
                leastPages=b[i].getNumberOfPages();
        }
        for(int i=0;i<n;i++){
            if(leastPages==b[i].getNumberOfPages()){
                System.out.println("");
                System.out.println("The book with least number of pages are :");
                b[i].displayBookDetails();
                break;
            }
        }
    }
}