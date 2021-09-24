package ma.ensa.metier;

import java.util.Set;


public interface ArticleSientifiqueService {
	
	public boolean ajouterArticle(String titre, String resume, String text,Auteur auteur,List<Auteur>  coAuteurs);
	public boolean modifierArticle(int id,String titre, String resume, String text);
	public boolean SupprimerArticle(int id);
	public Set<ArticleSientifique> allArticlesSientifique();
	public Set<ArticleSientifique> getArticlesSientifiqueByAuteur(int id);
	public Set<ArticleSientifique> getArticlesSientifiqueByMotsCle( Set<String> MotsCle);
}
