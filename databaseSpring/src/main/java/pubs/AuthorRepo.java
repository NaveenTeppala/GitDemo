package pubs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<PubsAuthor, String> {
    List<String> findTidByAuid(String id);
}
