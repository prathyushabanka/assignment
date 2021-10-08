//Create a LinkedList by adding methods as get(int index) , getFirst , getLast
// lastIndexOf(Student s), contains(Student s)-->boolean.
package assignment02;
public class  StudentList1{ 
Student head;
//Add
public void add(StudentList1 list , Student newData) {
if(head == null) {
head = newData;
}
else {
Student curr = list.head;
while(curr.next != null) {
curr = curr.next;
}
curr.next = newData;
}
}
public void print(StudentList1 list) {
if(head == null) {
System.out.print("empty list");
}
else {
Student temp = head;
while(temp!=null) {
System.out.print(temp+" --> ");
temp = temp.next;
}
System.out.println("\n");
}
}



//Get
public void get(StudentList1 list, int get) {
int i=1;
if(head == null) {
System.out.print("empty list");
}
else {
Student temp = head;
while(temp!=null) {
if(i == get) {
System.out.println(temp);
}
temp = temp.next;
i++;
}
}
}

//Get First
public void getFirst(StudentList1 list) {
if(head == null) {
System.out.print("empty list");
}
else {
Student temp = head;
System.out.println(temp);
}
}
//Get Last
public void getLast(StudentList1 list) {
if(head == null) {
System.out.print("empty list");
}
else {
Student temp = head;
while(temp.next != null) {
temp = temp.next;
}
System.out.println(temp);
}
}
//GetLastIndex
public void getLastIndex(StudentList1 list) {
int index = 1;
if(head == null) {
System.out.print("empty list");
}
else {
Student temp = head;
while(temp.next != null) {
temp = temp.next;
index++;
}
System.out.println("The last index is : "+index+"of student "+temp);
}
}
public boolean contains(StudentList1 list, Student s) {
if(head == null) {
return false;
}
else {
Student temp = head;
while(temp.next != null) {
if(temp.equals(s)) {
return true;
}
temp = temp.next;
}
}
return false;
}

public static void main(String[] args) {
StudentList1 list = new StudentList1();
list.add(list, new Student(6, "Prathyusha", "ce"));
list.add(list, new Student(16,"Ashu","cs"));
list.add(list, new Student(35,"Varun","eee"));
list.add(list, new Student(48,"Akhila","aero"));
list.add(list, new Student(59,"Milky","ece"));
list.print(list);
System.out.println("get method");
list.get(list, 0);
System.out.println("get first");
list.getFirst(list);
System.out.println("get last");
list.getLast(list);
System.out.println("get last index");
list.getLastIndex(list);
System.out.println("\nData Contains: ");
System.out.println(list.contains(list, new Student(48,"Akhila","aero")));

}

}