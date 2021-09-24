package ma.ensa.presentation;

public class ArticleController {

	
	
	@RequestMapping("/articles")
	return "afficherArticlesUtilisateur.jsp";

	

	@RequestMapping(value="/auteurs/{id}/articles/{id_article}")
	public String getAuteurId(@PathVariable("id_article") long id_article){
	
	}

}
