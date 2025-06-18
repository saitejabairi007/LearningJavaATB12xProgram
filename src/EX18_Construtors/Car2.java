package EX18_Construtors;

public class Car2 {
    String model;
    int year;
    int price;

  Car2(){//default
        model="XXX";
        year=2025;
      System.out.println("DC");

  }
    Car2(String model_name,int year_manuf){//parameterized
        this.model=model_name;
        this.year=year_manuf;
    }

 }


