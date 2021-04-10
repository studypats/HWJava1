package HomeWorkApp;


public class HomeWorkApp {


    public static void main(String[] args) {

        employee[] employeesList = new employee[5];
        employeesList[0]= new employee("Смирнов Андрей Юрьевич","директор",
                "SAU_smallcorp@gmail.com","88124521111",80000d,47);
        employeesList[1]= new employee("Смирнов Татьяна Сергеевна","главный бухгалтер",
                "STS_smallcorp@gmail.com","88124521112",40000d,40);
        employeesList[2]= new employee("Мищенко Вадим Петрович","водитель",
                "MVP_smallcorp@gmail.com","88124521122",25000d,50);
        employeesList[3]= new employee("Дроздов Сергей Александрович","менеджер",
                "DSA_smallcorp@gmail.com","88124521133",35000d,30);
        employeesList[4]= new employee("Васильева Екатерина Андреевна","менеджер",
                "VEA_smallcorp@gmail.com","88124521134",30000d,26);

        for (employee employee:employeesList) {
            if (employee.age>40) {employee.info();System.out.println();}
        }
    }


}
