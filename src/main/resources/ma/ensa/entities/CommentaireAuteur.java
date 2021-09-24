package ma.ensa.entities;

@Entity
public class CommentaireAuteur implements Serializable{
	
	@Id
	private CommentaireAuteur_PK pk;
	private String statut;
	private String commentaire;
	public CommentaireAuteur() {}
	public CommentaireAuteur(Auteur auteur, ArticleSientifique articleSientifique,
	String statut,String commentaire) {
	this.pk = new CommentaireAuteur_PK(auteur,articleSientifique);
	this.statut = statut;
	this.commentaire = commentaire;
	}
	public CommentaireAuteur_PK getPk() {return pk;}
	public void setPk(CommentaireAuteur_PK pk) {this.pk = pk;}
	public Auteur getAuteur() {
	return this.pk.getAuteur();}
	public void setAuteur(Auteur auteur) {
	this.pk.setAuteur(auteur);}
	public ArticleSientifique getArticleSientifique() {
	return this.pk.getArticleSientifique();}
	public void setArticleSientifique(ArticleSientifique articleSientifique) {
	this.pk.setArticleSientifique(articleSientifique);}
	public String getStatut() {return statut;}
	public void setStatut(String statut) {
	this.statut = statut;}
	
	public String getCommentaire() {return commentaire;}
	public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;}
	


}
