package com.company;

public class Information {

    public static void main(String[] args){
    // Code 3
    // Using Constructor
    /*
    Name    Year of Joining  Address
    ---------------------------------
    Robert      2001 		 Kurla
    Mahesh      2002	     Bandra */

    class employee2{
        String name;
        int year;
        String address;
    }

        employee2 e1 = new employee2();
        employee2 e2 = new employee2();

        e1.name = "Robert" ;
        e1.year= 2001;
        e1.address= "Kurla";
        e2.name = "Mahesh" ;
        e2.year= 2002;
        e2.address= "Bandra";

        System.out.println("Name    Year of Joining       Address ");
        System.out.println("------------------------------------ ");
        System.out.println(""+ e1.name+ "\t\t\t"+ e1.year+"\t\t  "+ e1.address);
        System.out.println(""+ e2.name+ "\t\t\t"+ e2.year+"\t\t  "+ e2.address);

    }
}
