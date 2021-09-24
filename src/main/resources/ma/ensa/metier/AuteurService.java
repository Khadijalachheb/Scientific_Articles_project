package ma.ensa.metier;

public interface AuteurService {
	public int ajouterAuteur(String nom, String tel, String email,String password);
	public Auteur authentifier(String email,String password);

}
