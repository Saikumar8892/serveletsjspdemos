package hibernatetests;

import org.hibernate.Session;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Message message = new Message("Hello world with Hibernate and annotations1"); 
		Message message1 = new Message("welcome hibernate session"); 
		Message message2 = new Message("good morning"); 
		Message message3= new Message("how was the session"); 
		
		session.save(message);
		session.save(message1);
		session.save(message2);
		session.save(message3);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}