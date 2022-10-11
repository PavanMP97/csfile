package springbootfileupload.csvfile.repository;

import springbootfileupload.csvfile.Domain.Tutorials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorials,Integer> {
}
