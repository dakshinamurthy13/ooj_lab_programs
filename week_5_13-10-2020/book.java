import java.util.Scanner;
class Book{
    private String name;
    private String author;
    private float price;
    private int no_of_pages;
    public Book(String name,String author,float price,int no_of_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.no_of_pages=no_of_pages;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public float getPrice(){
        return price;
    }
    public int getNo_of_pages(){
        return no_of_pages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setNo_of_pages(int no_of_pages){
        this.no_of_pages=no_of_pages;
    }
    public String toString(){
        return ("Name : "+this.name+"\nAuthor : "+this.author+"\nPrice : "+this.price+"\nNo of Pages : "+this.no_of_pages);
    }
}
class BookMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of Books");
        int n=s.nextInt();
        Book[] b=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("");
            System.out.println("");
            System.out.println("Enter the details of book "+(i+1));
            System.out.print("Name : ");
            String name=s.next();
            System.out.print("Author : ");
            String author=s.next();
            System.out.print("Price : ");
            float price=s.nextFloat();
            System.out.print("No of pages : ");
            int no=s.nextInt();
            b[i]=new Book(name,author,price,no);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Printing the details of the books");

        for(int i=0;i<n;i++){
            System.out.println("");
            System.out.println("");
            System.out.println("Book "+(i+1));
            System.out.println(b[i]);
            System.out.println("");
            System.out.println("");
        }
    }
}