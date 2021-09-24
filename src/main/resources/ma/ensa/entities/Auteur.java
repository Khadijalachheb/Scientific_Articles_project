package ma.ensa.entities;
@Entity
public class Auteur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String tel;
	private String email;
	private String password;
	@OneToMany(mappedBy="auteur")
	private Set<ArticleSientifique> articlesSientifique =new HashSet<>();
	@ManyToMany
	private Set<ArticleSientifique> coArticlesSientifique =new HashSet<>();
	@OneToMany (mappedBy="pk.auteur")
	private Set<CommentaireAuteur> commentaires=new HashSet<>();
	public Auteur() {}
		
	public Auteur(String nom, String tel, String email,String password) {
		this.nom = nom;
		this.tel = tel;
		this.email = email;
		this.password=password;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	
	public Set<CommentaireAuteur> getCommentaires() {
		return commentairess;
		}
		public void setCommentaires(Set<CommentaireAuteur> commentaires) {
		this.commentaires = commentaires;
		}

}
