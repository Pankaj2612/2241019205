// Define a class called product. Two instance variables of the class are pid (product-id) and
// price (product price). It consists of one static variable tot_price (total price). Initialize the value
// of instance variables through parameterized constructor. It consists of a display ( ) method to
// display the value of instance variables. A person went to market and purchase 5 different
// products. Using the above mentioned class, display the details of products that the person has
// purchased. Also, determine how much total amount the person will pay for the purchase of 5
// products.

import java.util.Scanner;
class product{
    String pid;
    int price;
    static int totprice = 0;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID : ");
        pid = sc.next();
        System.out.print("Enter Product Price : ");
        price = sc.nextInt();
        totprice += price;

    }
    void display(){
        System.out.println("Product id " + pid);
        System.out.println("Product price " + price);

    }

    static int totalprice(){
        return totprice;
    }


}

public class Q4 {
    public static void main(String[] args) {
        product[] pro = new product[5];
        
        for (int i = 0; i < pro.length; i++) {
            pro[i] = new product();
            pro[i].input();
            
        }
        for (int i = 0; i < pro.length; i++) {
            pro[i].display();
        }

        System.out.println("Total Price " + product.totalprice());


    }
}
