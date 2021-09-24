package ma.ensa.entities;

@Embeddable
public class CommentaireAuteur_PK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="id_auteur")
	private Auteur auteur;
	@ManyToOne
	@JoinColumn(name="id_articleSientifique")
	private ArticleSientifique articleSientifique;
	public CommentaireAuteur_PK() {}
	public CommentaireAuteur_PK(Auteur auteur, ArticleSientifique articleSientifique)
	{this.auteur = auteur;
	this.articleSientifique = articleSientifique;}
	public ArticleSientifique getArticleSientifique() {return articleSientifique;}
	public void setArticleSientifique(ArticleSientifique articleSientifique) {
	this.articleSientifique= articleSientifique;}
	public Auteur getAuteur() {return auteur;}
	public void setAuteur(Auteur auteur) {
	this.auteur = auteur;}


}
