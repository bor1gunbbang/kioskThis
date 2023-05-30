import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kiosk {

   Product[] cart = new Product[10];
    Scanner scan = new Scanner(System.in);


    public void showMainMenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1.Burgers       | 앵거스 비프 통살을 다져 만든 버거");
        System.out.println("2.Frozen Custard       | 매장에서 신선하게 만든 아이스크림");
        System.out.println("3.Drinks       | 매장에서 직접 만드는 음료");
        System.out.println("4.Beer       | 뉴욕 브루클린 브루어리에서 양조한 맥주");

        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
    }
    public void showBurgerMenu() {
        Product[] Burger = new Product[3];
        Burger[0] = new Product("햄버거1",5.5,"첫번째 메뉴");
        Burger[1] = new Product("햄버거2",2.2,"두번째 메뉴");
        Burger[2] = new Product("햄버거3",4.6,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <Burger.length ; i++) {
            System.out.println(Burger[i].getName() + " | " + Burger[i].getPrice() + " | " + Burger[i].getExplain());
        }
        int choice = scan.nextInt();


       cart[0] = new Product(Burger[choice].getName(),Burger[choice].getPrice(),Burger[choice].getExplain());
        System.out.println(cart[0]);
        return ;

    }
 public void showIceCreamMenu() {
        Product[] iceCream = new Product[3];
        iceCream[0] = new Product("아이스크림1",1.5,"첫번째 메뉴");
        iceCream[1] = new Product("아이스크림2",2.0,"두번째 메뉴");
        iceCream[2] = new Product("아이스크림3",4.4,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <iceCream.length ; i++) {
            System.out.println(iceCream[i].getName() + " | " + iceCream[i].getPrice() + " | " + iceCream[i].getExplain());
        }

     int choice = scan.nextInt();
     cart[1] = new Product(iceCream[choice].getName(),iceCream[choice].getPrice(),iceCream[choice].getExplain());
        return ;
    }
 public void showDrinkMenu() {
        Product[] Drink = new Product[3];
        Drink[0] = new Product("음료1",2.5,"첫번째 메뉴");
        Drink[1] = new Product("음료2",4.2,"두번째 메뉴");
        Drink[2] = new Product("음료3",2.6,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <Drink.length ; i++) {
            System.out.println(Drink[i].getName() + " | " + Drink[i].getPrice() + " | " + Drink[i].getExplain());
        }

     int choice = scan.nextInt();
     cart[2] = new Product(Drink[choice].getName(),Drink[choice].getPrice(),Drink[choice].getExplain());
        return;
    }
 public void showBeerMenu() {
        Product[] Beer = new Product[3];
        Beer[0] = new Product("맥주1",5.5,"첫번째 메뉴");
        Beer[1] = new Product("맥주2",2.2,"두번째 메뉴");
        Beer[2] = new Product("맥주3",4.6,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <Beer.length ; i++) {
            System.out.println(Beer[i].getName() + " | " + Beer[i].getPrice() + " | " + Beer[i].getExplain());
        }
     int choice = scan.nextInt();
     cart[3] = new Product(Beer[choice].getName(),Beer[choice].getPrice(),Beer[choice].getExplain());
     return ;
    }

    void choiceCart(Product p ){
       int sum = 0;
       sum += 1;

    }
    public void showOrderMenu(){
        System.out.println("[ Orders ]");
        for (int i = 0; i < cart.length; i++) {
            System.out.println((cart[i].toString()));

        }
        System.out.println("1.주문하기       |       2.메인메뉴로 돌아가기");


    }
public void showOrderCancel(){
    System.out.println("주문을 취소 하시겠습니까?");
    System.out.println("1.취소하기       |       2.계속주문하기");
    int choice = scan.nextInt();
    if (choice == 1){
        //장바구니 비우기메서드
    } else if (choice==2) {
        Order();
    }

}

    public void Order(){
        while (true){
            showMainMenu();
            int menuNumber  = scan.nextInt();

            if (menuNumber == 1) {
                    showBurgerMenu();
            } else if (menuNumber == 2) {
                showIceCreamMenu();
            } else if (menuNumber == 3) {
                showDrinkMenu();
            } else if (menuNumber == 4) {
                showBeerMenu();
            } else if (menuNumber == 5) {
                showOrderMenu();
            }else if (menuNumber == 6){
                showOrderCancel();
            }
        }
        }

    }
