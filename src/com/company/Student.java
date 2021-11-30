package com.company;

public class Student {
    public static void main(String[] args) {
        // Code 4

        /*Create a class 'Student' with three data members
        which are name, age and address.*/

        class student2 {
            String name;
            int age;
            String address;

            student2() {
                this.name = "Unknown";
                this.age = 0;
                this.address = "not available";
            }

            student2(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

            void setInfo(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void setInfo(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        }

        {
            student2 s1 = new student2();


            s1.setInfo("Joshua", 19, "Ghatkopar");

            //" " + s1.name + "\t" + s1.age + "\t" + s1.address
            System.out.print(s1.name +"\t");
            System.out.print(s1.age +"\t");
            System.out.print(s1.address);

        }
    }
}
