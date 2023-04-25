 package location.location.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.location.location.entities.Country;

@Repository
public interface CountryDao extends JpaRepository<Country , Long>
{
	
}