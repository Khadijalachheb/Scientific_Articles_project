package ma.ensa.entities;


import java.util.Set;

import javax.persistence.*;

@Entity
public class ArticleSientifique {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String titre;
	private String resume;
	private String text;
	private Set<String> motsCle;
	@ManyToOne
	@JoinColumn(name="auteur_id")
	private Auteur auteur;
	@ManyToMany
	@JoinTable(name="coAuteur",
	joinColumns=@JoinColumn(name="coAuteur_id"),
	inverseJoinColumns=@JoinColumn(name="coArticleSientifique_id"))
    private Set<Auteur> coAuteurs  ;
	private String statutComite;
	private String commentaireComite;
	
	@OneToMany (mappedBy="pk.articleSientifique")
	private Set<CommentaireAuteur> commentaires=new HashSet<>();

   public ArticleSientifique() {}
	
		
	public ArticleSientifique(String titre, String resume, String text, Set<String> motsCle,Auteur auteur,List<Auteur>  coAuteurs) {
		this.titre= titre;
		this.resume= resume;
		this.text= text;
		this.auteur= auteur;
		this.motsCle=motsCle;
		this.coAuteurs= coAuteurs;
		this.statutComite="aucun";
		this.commentaireComite="aucun";
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre= titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public Set<String> getMotsCle() {
		return motsCle;
	}
	public void setMotsCle(Set<String> motsCle) {
		this.motsCle = motsCle;
	}
	
	
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur =auteur;
	}
	
	public Set<Auteur> getCoAuteur() {
		return coAuteurs;
	}
	public void setCoAuteur(Set<Auteur> coAuteurs) {
		this.coAuteurs =coAuteurs;
	}
	
	
	public String getStatutComite() {
		return statutComite;
	}
	public void setStatutComite(String statutComite) {
		this.statutComite = statutComite;
	}
	
	public String getCommentaireComite() {
		return commentaireComite;
	}
	public void setCommentaireComite(String commentaireComite) {
		this.commentaireComite = commentaireComite;
	}
	
	
	public Set<CommentaireAuteur> getCommentaires() {
		return commentairess;
		}
		public void setCommentaires(Set<CommentaireAuteur> commentaires) {
		this.commentaires = commentaires;
		}


}

