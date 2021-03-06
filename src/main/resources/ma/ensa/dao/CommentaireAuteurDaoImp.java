package ma.ensa.dao;

import java.util.HashSet;
import java.util.Set;



@Repository
@Transactional
public class CommentaireAuteurDaoImp implements CommentaireAuteurDao  {
	 private SessionFactory sessionFactory;
	    
		@Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
      
		
		public int addCommentaireAuteur(CommentaireAuteur commentaireAuteur) 
		{  
		Session session = sessionFactory.getCurrentSession();
		session.save(commentaireAuteur);
		return commentaireAuteur.getId();
		 
		}
		
		
		public Set<CommentaireAuteur> getByArticle(ArticleSientifique article){ 
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from CommentaireAuteur where articleSientifique=:articleSientifiqueA");
		query.setParameter("articleSientifiqueA",article);
		Set<CommentaireAuteur> commentaires = new HashSet<CommentaireAuteur>(query.getResultList());
		
		retrun commentaires; 
		}
		
		
	
	
}
                                                                                                                                                                                                                                                                                                                      