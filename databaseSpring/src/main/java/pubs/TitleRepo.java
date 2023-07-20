package pubs;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TitleRepo extends JpaRepository<PubsTitle, String>{
	@Query("select p.title,p.price from PubsTitle p where p.price between :minp and :maxp")
	List<String> getTitleByPriceBetween(Double minp,Double maxp);
	
	
	List<PubsTitle> findTitleByType(String type);
	
	



}
