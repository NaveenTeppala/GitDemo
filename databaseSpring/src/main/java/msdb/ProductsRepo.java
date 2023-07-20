package msdb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductsRepo extends JpaRepository<MsdbProducts, Integer> {
	
}
