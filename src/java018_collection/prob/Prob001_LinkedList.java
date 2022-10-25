package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */
		LinkedList<Book> lineStack = new LinkedList<>();
		try(Scanner sc = new Scanner(new File("./src/java018_collection/prob/booklist.txt"))) {
			System.out.println("title	publisher	writer	price");
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split("/");
				lineStack.push(new Book(line[0], line[1], line[2], line[3]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!lineStack.isEmpty()) {
			Book book = lineStack.pop();
			System.out.printf("%s  %s	%s	%s\n",book.getTitle(), book.getPublisher(), book.getWriter(), book.getPrice());
		}
	
	}//end main()

}//end class











