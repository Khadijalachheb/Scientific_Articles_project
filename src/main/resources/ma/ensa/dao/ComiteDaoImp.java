package ma.ensa.dao;

import java.util.HashSet;
import java.util.Set;

@Repository
@Transactional
public class ComiteDaoImp implements ComiteDao {
	 private SessionFactory sessionFactory;
	    
		@Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		public int addComite(Comite person) {
			
			Session session = sessionFactory.getCurrentSession();
			session.save(person);
			return auteur.getId();
			 
			
		}
		public Set<Auteur> getComiteByEmail(String email) {
			
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Comite where email=:emailC");
			query.setParameter("emailC",email);
			Set<Comite> persons = new HashSet<Comite>(query.getResultList());
			return persons;
			
		
			
			
		}
		

}
                                                                                                                                                                                                                                                                                                   