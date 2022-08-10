import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Address;
import com.samples.domain.User;
import com.samples.utils.HibernateUtil;

public class CompositionTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			Address billAddress = new Address("349", "Main Street", "Sirvel", "518563");
			Address shipAddress = new Address("LH123", "Alamadhi", "chennai", "600062");
			User user = new User("saikumar", billAddress, shipAddress, 22);
			session.save(user);

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