package ma.ensa.dao;

public interface ComiteDao {

	
	public int addPersonComite(Comite person);
	public Auteur getPersonComiteByEmail(String email);
}
