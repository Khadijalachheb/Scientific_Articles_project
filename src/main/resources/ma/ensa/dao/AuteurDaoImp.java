package ma.ensa.dao;

import java.util.HashSet;
import java.util.Set;

@Repository
@Transactional
public class AuteurDaoImp implements AuteurDao {
	 private SessionFactory sessionFactory;
	    
		@Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		public int addAuteur(Auteur auteur) {
			
			Session session = sessionFactory.getCurrentSession();
			session.save(auteur);
			return auteur.getId();
			 
			
		}
		public Set<Auteur> getAuteurByEmail(String email) {
			
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Auteur where email=:emailA");
			query.setParameter("emailA",email);
			Set<Auteur> auteurs = new HashSet<ArticleSientifique>(query.getResultList());
			return auteurs;
			
		
			
			
		}
		
   

}
