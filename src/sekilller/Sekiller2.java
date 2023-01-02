/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekilller;

/**
 *
 * @author Fırat
 */
public class Sekiller2 {
    void sekil(){
        System.out.println("Ana Sekil");
    }
}

class Ucgen extends Sekiller2{
    void sekil(){
        System.out.println("Ucgen olusturma kodları");
    }
}

class Kare extends Sekiller2{
    void sekil(){
        System.out.println("Kare olusturma kodları");
    }
}

class Cember extends Sekiller2{
    void sekil(){
        System.out.println("Cember olusturma kodları");
    }
}

class Daire extends Sekiller2{
    void sekil(){
        System.out.println("Daire olusturma kodları");
    }
}

class Test{
    public static void main(String[] args) {
        Sekiller2 s1=new Sekiller2();
        Sekiller2 u1=new Ucgen();
        Sekiller2 k1=new Kare();
        Sekiller2 c1=new Cember();
        Sekiller2 d1=new Daire();
        
        s1.sekil();
        u1.sekil();
        k1.sekil();
        c1.sekil();
        d1.sekil();
    }
}
