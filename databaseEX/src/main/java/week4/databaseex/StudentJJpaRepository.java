package week4.databaseex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJJpaRepository extends JpaRepository<Student,Long> {
}
