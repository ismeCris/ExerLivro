package app.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.LivroEntity;

public interface LivroRepository extends JpaRepository<LivroEntity , Long> {
	

}
