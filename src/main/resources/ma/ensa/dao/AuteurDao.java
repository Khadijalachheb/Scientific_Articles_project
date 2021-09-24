package ma.ensa.dao;

import java.util.Set;


public interface AuteurDao {

	public int addAuteur(Auteur auteur);
	public Auteur getAuteurByEmail(String email);
	
}
