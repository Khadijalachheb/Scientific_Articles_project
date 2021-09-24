package ma.ensa.dao;

import java.util.Set;

import ma.ensa.entities.ArticleSientifique;

public interface ArticleSientifiqueDao {
	
	public int addArticleSientifique(ArticleSientifique articleSientifique);
	public int updateArticleSientifique(int id,String titre, String resume, String text, Set<String> motsCle);
	public int deleteArticleSientifique(ArticleSientifique articleSientifique);
	public Set<ArticleSientifique> allArticlesSientifique();
	public Set<ArticleSientifique> getArticlesSientifiqueByAuteur(Auteur auteur);
	public ArticleSientifique getArticlesSientifiqueById(int id);
	public Set<ArticleSientifique> getArticlesSientifiqueByMotsCle( Set<String> MotsCle);

}
