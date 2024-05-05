package controller;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.getFactory;
public class CrudOperations {
	public static void main(String[] args) {
	try(SessionFactory factory = getFactory()){
		System.out.println(factory);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
