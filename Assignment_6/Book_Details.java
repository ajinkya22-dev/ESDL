class Book{
    String title,author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }   
    public Book(String title,double price){
        this.title=title;
        this.price=price;
        this.author="Unknown";
    }
    public Book(String title,String author){                    
        this.title=title;
        this.author=author;
        this.price=0;
    }   
    public Book(String title){
        this.title=title;
        this.price=0;
        this.author="Unknown";
    }
    public void print(){
        System.out.println(
            "Title:"+title+"\n"+"Author:"+author+"\n"+"Price:"+price
        );
    }
}
public class Book_Details {
    public static void main(String args[]){
        Book book1=new Book("Java Basics");
        Book book2=new Book("OOP in Java","ABC");
        Book book3=new Book("Advanced Java","XYZ",450);
        Book book4=new Book("Master C++",1000);
        book1.print();
        book2.print();
        book3.print();
        book4.print();
    }
}
