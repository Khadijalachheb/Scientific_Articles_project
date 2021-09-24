package ma.ensa.dao;

import java.util.HashSet;
import java.util.Set;



@Repository
@Transactional
public class ArticleSientifiqueDaoImp implements ArticleSientifiqueDao  {
	 private SessionFactory sessionFactory;
	    
		@Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
      
		
		public int addArticleSientifique(ArticleSientifique articleSientifique) 
		{  
		Session session = sessionFactory.getCurrentSession();
		session.save(articleSientifique);
		return articleSientifique.getId();
		 
		}
		
		public void updateArticleSientifique(int id,String titre, String resume, String text, Set<String> motsCle){
			
			Session session = sessionFactory.getCurrentSession();
			String update_query="update ArticleSientifique set titre=:titreA ,resume=:resumeA, text=:textA , motsCle:= motsCleA where id:=idA";
			Query query = session. createQuery(update_query);
			query.setParameter("titreA", titre);
			query.setParameter("resumeA", resume);
			query.setParameter("textA", text);
			query.setParameter("motsCleA", motsCle);
			query.setParameter("idA", id);
			int success = query.executeUpdate();

		    
		
		retrun success;
		}
		public int deleteArticleSientifique(ArticleSientifique articleSientifique) { 
			Session session = sessionFactory.getCurrentSession();
			String delete_query="delete ArticleSientifique where id=:idA";
			query.setParameter("idA",articleSientifique.getId() );
			Query query = session.createQuery(delete_query);
			int success = query.executeUpdate();

		
		
		}
		
		public Set<ArticleSientifique> allArticlesSientifique() { 
			
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from ArticleSientifique");
			Set<ArticleSientifique> articles = new HashSet<ArticleSientifique>(query.getResultList());
			return articles;
		}
		
		public Set<ArticleSientifique> getArticlesSientifiqueByAuteur(Auteur auteur){ Set<ArticleSientifique> articles;
		

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ArticleSientifique where auteur=:auteurA");
		query.setParameter("auteurA",auteur);
		Set<ArticleSientifique> articles = new HashSet<ArticleSientifique>(query.getResultList());
		return articles;
		
		retrun articles; 
		}
		
		public Set<ArticleSientifique> getArticlesSientifiqueByMotsCle(String mot){ 
			
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from ArticleSientifique where ? in motsCle");
			query.setParameter(1,mot);
			Set<ArticleSientifique> articles = new HashSet<ArticleSientifique>(query.getResultList());
			return articles;
			
		}
		public ArticleSientifique getArticlesSientifiqueById(int id){
			Query query = session.createQuery("from ArticleSientifique where id=:idA");
			query.setParameter("idA",id);
			ArticleSientifique article = new (ArticleSientifique)(query.getResultList());
			
			retrun article; 
			
		}
	
	
}
