package app.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LivroEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String ano_publi;
	private String autor;
	
	@OneToMany(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties("livro")
    private List<EditoraEntity> editoras;

    public LivroEntity(long id, String titulo, String ano_publi, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.ano_publi = ano_publi;
        this.autor = autor;
    }
	

}
