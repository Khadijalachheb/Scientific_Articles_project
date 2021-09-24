
package ma.ensa.metier;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuteurServiceImp implements AuteurService  {
	ArticleSientifiqueDao asd=new ArticleSientifiqueDaoImp();
	AuteurDao ad=new AuteurDaoImp();
	
	
	public int ajouterAuteur(String nom, String tel, String email,String password) {
		
		Auteur auteur=new Auteur(String nom, String tel, String email,String password);
		ad.addAuteur(auteur);
		
	}
	
	
	
	public Auteur authentifier(String email,String password) {
		
		Set<Auteur> auteurs=getAuteurByEmail(email);
		foreach(auteurs as auteur){
			
			if(auteur.getPassword()==password) {
				return auteur;
				
			}
		}
		return null;
	}

}
