package ma.ensa.dao;

public interface CommentaireAuteurDao {
	
	public int addCommentaireAuteur(CommentaireAuteur commentaireAuteur); 

	public Set<CommentaireAuteur> getByArticle(ArticleSientifique article);
	

}
