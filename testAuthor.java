package lab2;

import java.lang.*;
public class testAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Ben","Ben@.ru", '6');
        System.out.println("Author is " +a1.getName()
                + ", email:" +a1.getEmail()
                + ", gender:" +a1.getGender());
        Author a2 = new Author("El", "El@.ru",'8');
        System.out.println("Author is " +a2.getName()
                + ", email:" +a2.getEmail()
                + ", gender:" +a2.getGender());
        Author a3 = new Author("Liz", "liz@.ru",'4');
        System.out.println("Author is " +a3.getName()
                + ", email:" +a3.getEmail()
                + ", gender:"+a3.getGender());
    }
}
