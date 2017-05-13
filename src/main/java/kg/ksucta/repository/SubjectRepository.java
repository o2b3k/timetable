package kg.ksucta.repository;

import kg.ksucta.domain.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by o2b3k on 5/13/17.
 */
@Repository("subjectRepository")
public interface SubjectRepository extends JpaRepository<Subject,Long>{

}
