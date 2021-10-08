//DoublyLinked List implementation which provides utility functions for add, remove , find , 
//addInMiddle , removeFromMiddle node: Author[id,name,noOfBooks]
package assignment02;

public class AuthorDetails {
	    Author head;
//	    private Author next;
//	    private Author prev;
	    int index=1;
	    //Add
	    public void add(int id ,String name,int noOfBooks ) {
	    	Author author =new Author(id,name, noOfBooks);
	    	author.next=head;
	    	author.prev=null;
	    	if(head!=null) {
	    		head.prev =author;
	    		}
	    	head=author;
	    }
	 
	    //Remove
	    public void remove(AuthorDetails list, int id,String name,int noOfBooks)
	    {
	    if(list.head==null)
	    System.out.println("Empty..");
	    else
	    {
	 
	     Author curr=list.head;
	    Author curr2=curr.next;
	    if(curr.id==id)
	    {
	    Author temp=list.head;
	    list.head=list.head.next;
	    temp=null;
	 
	     }
	    else
	    {
	    while(curr2.next!=null)
	    {
	    if(curr2.id==id)
	    {
	    curr.next=curr2.next;
	    curr2=null;
	    break;
	    }
	    curr=curr2;
	    curr2=curr2.next;
	    }
	    }
	 
	     }
	    }
	    //remove in middle
	    public void removeAtMiddle(int position,Author newNode)
	    {

	        Author temp=head;
	        if(position==1)
	        {
	            head.next.prev=null;
	            head=head.next;
	            temp.next=null;
	            }
	        else
	        {
	            int count=1;
	            Author previous=head;
	            while(count<position-1)
	            {
	                previous=previous.next;
	                count++;
	            }
	            Author current=previous.next;
	            previous.next=current.next;
	            current.prev=previous.next;

	        }
	    }
	    //AddInMiddle
	    public void addInMiddle(Author list_prev,int id,String name ,int noOfBooks)
	    {
	    if(list_prev==null)
	    {
	    System.out.println("empty");
	    return;
	    }
	    Author author =new Author(id,name, noOfBooks);
	    author.next=list_prev.next;
	    list_prev.next=author;
	    author.prev=list_prev;
	    if(author.next!=null)
	    author.next.prev=author;
	    }
	    //Find
	    public void find(AuthorDetails list, int id)
	    {
	    if(list.head==null)
	    System.out.println("Empty");
	    else if(list.head.getId()==id)
	    System.out.println(list.head);
	    else
	    {
	    Author curr=list.head;
	    while(curr.next!=null)
	    {
	    if(curr.getId()==id)
	    {
	    System.out.println(curr);
	    return;
	    }
	    curr=curr.next;
	    }
	    }
	    }
	    //AddFirst
	    public void addFrist(AuthorDetails list,int id,String name ,int Book ) {
	    	Author new_node =new Author(id, name, Book);
	    if(list.head==null)
	    list.head= new_node;
	    else
	    {
	    new_node.next=list.head;
	    list.head.prev= new_node;
	    list.head= new_node;
	    }
	    index++;
	    }
	    //RemoveFirst
	    public void removeFrist(AuthorDetails list,int id,String name ,int Book )
	    {
	    Author new_node =new Author(id, name, Book);
	    if(list.head==null)
	    list.head= new_node;
	    else
	    {
	 
	     Author curr = list.head;
	    list.head = curr.next;
	    curr.next = null;
	    }
	    index++;
	    }
	    //RemoveLast
	    public void removeLast( AuthorDetails list,int id,String name ,int Book)
	    {
	    Author prev = null;
	    if (list.head == null)
	    {
	    System.out.println("list is empty");
	    }
	    else
	    {
	    Author temp = list.head;
	    while(temp.next != null)
	    {
	    prev = temp;
	    temp = temp.next;
	    }
	    prev.next = null;
	    }
	    }
	    //removeInMiddle

	    //PrintList
	    public void printList(Author author)
	    {
	    Author prev=null;
	    while(author!=null)
	            {
	    System.out.print(author.id+" "+author.name+" "+author.noOfBooks+" " +" ");
	    prev=author;
	    author=author.next;
	            }
	    }
	    public void removeInMiddle(int index, int id, String name, int noOfBooks) {
	        Author temp=head;
	        if(index==1)
	        {
	        head.next.prev=null;
	        head=head.next;
	        temp.next=null;
	        }
	        else
	        {
	        int count=1;
	        Author prev=head;
	        while(count<index-1)
	        {
	        prev=prev.next;
	        count++;
	        }
	        Author current=prev.next;
	        prev.next=current.next;
	        current.prev=prev.next;
	 
	         }
	        }
	 
	    public static void main(String[] args) {
	    AuthorDetails auth= new AuthorDetails();
	    auth.add(5,"Java", 10);
	    auth.add(3,"C Book",16);
	    auth.add(9,"AWS", 58);
	    auth.add(8,"DS", 43);
	    auth.add(10,"M3", 43);
	    System.out.println("\n add ");
	    auth.add(6,"ML",90);
	    auth.printList(auth.head);
	    System.out.println("\n remove ");
	    auth.remove(auth, 8,"DS",43);
	    auth.printList(auth.head);
	    System.out.println("\n addInMiddle ");
	    auth.addInMiddle(auth.head.next,9,"M1",70);
	    auth.printList(auth.head);
	    System.out.println("\n find ");
	    auth.find(auth,3);
	    auth.printList(auth.head);
	    System.out.println("\n  addFirst ");
	    auth.addFrist(auth,7,"M2",90);
	    auth.printList(auth.head);
	    System.out.println("\n removeFirst");
	    auth.removeFrist(auth,5,"Java",10);
	    auth.printList(auth.head);
	    System.out.println("\n removelast ");
	    auth.removeLast(auth,8,"DS", 43);
	    auth.printList(auth.head);
	    System.out.println("\n removeIn middle ");
	    auth. removeInMiddle(3,9,"AWS", 58);
	    auth.printList(auth.head);
	}
	 
	  class Author
	    {
	 
	    public Author head;
	    int id;
	    String name;
	    int noOfBooks;
	    Author next;
	    Author prev;
	 
	     public Author(int id,String name,int noOfBooks) {
	    super();
	    this.id = id;
	    this.name = name;
	    this.noOfBooks = noOfBooks;
	    this.next=null;
	    this.prev=null;
	    }
	 
	     public Author getHead() {
	    return head;
	    }
	 
	     public void setHead(Author head) {
	    this.head = head;
	    }
	 
	     public int getId() {
	    return id;
	    }
	 
	     public void setId(int id) {
	    this.id = id;
	    }
	 
	     public String getName() {
	    return name;
	    }
	 
	     public void setName(String name) {
	    this.name = name;
	    }
	 
	     public int getNoOfBooks() {
	    return noOfBooks;
	    }
	 
	     public void setNoOfBooks(int noOfBooks) {
	    this.noOfBooks = noOfBooks;
	    }
	 
	     @Override
	    public String toString() {
	    return "Author [ id=" + id + ", name=" + name + ", noOfBooks=" + noOfBooks+" ]" ;
	 
	     }
	    }
	    }
	 

