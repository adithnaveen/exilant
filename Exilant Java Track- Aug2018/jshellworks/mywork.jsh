clear
/help
/import help
/list
10 + 20 
/list
System.out.println("Welcome to jShell in java 9"); 
if(10 < 20) System.out.println("True Case"); else System.out.println("False Case");
/list
for(i=0; i<=10; i+=2) System.out.println("i is " + i);
var i; 
var i=0;; 
for(i=0; i<=10; i+=2) System.out.println("i is " + i);
Math.PI
Math.random();
Math.random();
Math.random();
Math.random() * 100; 
(int ) Math.random() * 100; 
(int ) (Math.random() * 100); 
(int ) (Math.random() * 100); 
(int ) (Math.random() * 100); 
/list
/vars
/imports
List<String> trees = List.of("Oak", "Teak", "Rose", "Maple", "Pine");
trees
trees.forEach(System.out :: println);
trees.contains("Pine");
trees.contains("Sandle");
trees.contains("Sandal");
trees.size();
trees.toArray();
String line="";
BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
while((line = reader.readLine())!= null) System.out.println(line);
while(true){}
package com.exilant; 
/history
/list
$8
$9 
$8 + $9
drop $8
$8
public String sayHello(String name){ return "Hello Mr/Ms/Mrs" + name); } 
public String sayHello(String name){ return "Hello Mr/Ms/Mrs" + name)} 
public String sayHell("String name) {return "Hello Mr/Ms/Mrs " + name; }
public String sayHell("String name) {return "Hello Mr/Ms/Mrs " + name; }
public String sayHell(String name) {return "Hello Mr/Ms/Mrs " + name; }
/methods
System.out.println(sayHell("Kumar"));
/list
/list 1
/list 3
/list 3 10
/list sayHell 
/methods
/list sayHell 
/list -all
var hi(){System.out.println("hi");}
var x = ""; 
var hi(){return x; }
public Object sayHi(){System.out.println("Object returned");}
public Object sayHi(){return "Object returned"; }
/methods
System.out.println("hi");
print("hello");
/import base
print("hello");
printf("hello");
PRINTING
import PRINTING
/list
drop 23
drop $23
/list
$23
trees
List<String> cars = List.of("Ford", "Maruti", "Toyota", "BMW");
List<List<String>> treesAndCars = List.of(trees, cars); 
treesAndCars.get(0);
treesAndCars.get(1);
treesAndCars.get(0).get(0);
treesAndCars.get(0).get(0)
/vars
class Person{
   private int pId; 
   private String pName; 
   Person(int pId, Stirng pName){
       this.pId = pId; 
       this.pName = pName; 
   } 
  public void display(){
      System.out.println("Person Id " + this.pId); 
      System.out.println("Person Name " + this.pName); 
    }
}
/open Person.java
/class
/classes
/list
Person p1 = new Person(101, "Harry");
p1.display();
/vars
Person p2 = new Person(102, "Peter"); 
Person p3 = new Person(103, "Leela");
List<Person> person = List.of(p1, p2, p3);
person.forEach(p -> display());
person.forEach(p.display(););
person.forEach(p -> System.out :: println());
person.forEach(p -> System.out :: println(););
person.forEach(p -> p.display(););
person.forEach(p -> p.display());
/help
/save -history mywork.jsh
