package app.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.EditoraEntity;

public interface EditoraRepository extends JpaRepository<EditoraEntity, Long> {
	

}
