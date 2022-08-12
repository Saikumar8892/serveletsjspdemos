import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Address;
import com.samples.domain.Guide;
import com.samples.domain.Student;
import com.samples.domain.User;
import com.samples.utils.HibernateUtil;

public class StudentTwoGuideOneStudentTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			Guide guide1 = new Guide("2000XYZ003", "Sri raman", 2000);
			Guide guide2 = new Guide("2000PQR004", "vijayalakshmi mam", 4000);
			Student student1 = new Student("vtu14582", "sai kumar", guide2, 22);
			
//			session.persist(guide1);
			session.persist(student1);
			
			txn.commit();

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}
	
}

