package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EditoraEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String endereco;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonIgnoreProperties("livro")
    private LivroEntity livro;


   
}
