package ma.ensa.metier;

import java.util.HashSet;
import java.util.Set;

@Service
public class ArticleSientifiqueServiceImp implements ArticleSientifiqueService  {
	ArticleSientifiqueDao asd=new ArticleSientifiqueDaoImp();
	AuteurDao ad=new AuteurDaoImp();
	
	
	public boolean ajouterArticle(String titre, String resume, String text,Auteur auteur,List<Auteur>  coAuteurs) {
		ArticleSientifique article=new ArticleSientifique(String titre, String resume, String text,Auteur auteur,List<Auteur>  coAuteurs);
	    asd.addArticleSientifique(article);
		
		return true;
	}
	
	public boolean modifierArticle(int id,String titre, String resume, String text) {
		 asd.updateArticleSientifique(int id,String titre, String resume, String text);
		 return true;
		
	}
	public boolean SupprimerArticle(int id) {
		ArticleSientifique article=asd.getArticlesSientifiqueById(id);
		asd.deleteArticleSientifique(article);
		return true;
		
	}
	
	public Set<ArticleSientifique> allArticlesSientifique() { 
		
		
		Set<ArticleSientifique> articles=asd.allArticlesSientifique();
		return articles;
	}
	
	public Set<ArticleSientifique> getArticlesSientifiqueByAuteur(int id){ 
	   Auteur auteur= ad.getAuteurById(id);
           
	
	   Set<ArticleSientifique> articles=asd.getArticlesSientifiqueByAuteur(Auteur auteur);
	
	
	   retrun articles; 
	}
	
	public Set<ArticleSientifique> getArticlesSientifiqueByMotsCle(String mot){ 
	
		Set<ArticleSientifique> articles=asd.getArticlesSientifiqueByMotsCle(String mot)
		return articles;
		
	}

}
