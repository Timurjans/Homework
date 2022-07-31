package guru.qa;

import javax.naming.Name;

public class Person {


    int age;
    String name;
    boolean kredit;
    boolean deti;

    public Person(int age, String name ,boolean kredit ,boolean deti) {
        this.age = age;
        this.name = name;
        this.kredit=kredit;
        this.deti=deti;
    }


    void daiKredit(){

        if(age<50 & kredit & deti) {
            System.out.println(" Надежный клиент ");
        } else  if (age >50 | (kredit & deti)) {
            System.out.println( "Пусть детей смотрит");
        } else if (age>50 & kredit ) {
            System.out.println("Нам такой клиент не нужен");
        } else if ( age<50 & kredit) {
            System.out.println("Норм шкет");
        }


    }
void sayName() {
    System.out.println("имя кредитора: " + name);
}
void sayKredit(){
    System.out.println("Есть кредит: "+ kredit);
}
void syaDeti() {
    System.out.println("Есть дети: "+ deti);
}
}
