package HomeWorkApp;

public class employee {
    String fullName;
    String position;
    String eMail;
    String phone;
    double wage;
    int age;

    public employee (String fullName,String position,String eMail, String phone,double wage,int age) {
        this.fullName=fullName;
        this.position=position;
        this.eMail=eMail;
        this.phone=phone;
        this.wage=wage;
        this.age=age;
    }

    void info () {
        System.out.println("ФИО: "+fullName);
        System.out.println("Должность: "+position);
        System.out.println("Email: "+eMail);
        System.out.println("Телефон: "+phone);
        System.out.println("Зарплата: "+wage);
        System.out.println("Возраст: "+age);
    }
}
