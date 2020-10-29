
		abstract class Book {
		    String title;
		    abstract void setTitle(String s);
		    String getTitle() 
		    {
		    return title;
		    }
		}
		class MyBook extends Book {
		    public void setTitle(String s) {
		        title=s;
		    }
		}
		public class Activity2_1 { 
		    public static void main(String []args) {
		        String title="Under the Volcano";
		        Book newNovel=new MyBook();
		        newNovel.setTitle(title);		        
		        System.out.println("Novel Title: "+newNovel.getTitle());
		    }
}

		
/*
 * In this activity we use the Abstract Class to show implementation of
 * Abstraction. For this activity: Create an abstract class Book that has:
 * title of type String an abstract method setTitle() that takes one String
 * argument. a concrete method getTitle() that returns the value of title.
 * Create another class that extends the abstract class called MyBook. MyBook
 * defines the setTitle() method to assign the value of title as the argument.
 */
/*
 * In the main method, create an object of MyBook class - newNovel. Use the
 * setTitle() method to book title to the variable title. Use the getTitle()
 * method to print the name of the book
 */