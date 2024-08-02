package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.LivroEntity;

@Service
public class LivroService {

	private static List<LivroEntity> lista = new ArrayList<>();

	static {
		lista.add(new LivroEntity(1, "O Pequeno Príncipe", "2008", "Antoine de Saint-Exupéry"));
		lista.add(new LivroEntity(2, "Doce como sangue", "2023", "Dan Rodrigues"));
		lista.add(new LivroEntity(3, "Orgulho e Preconceito", "1813", "Jane Austen"));
		lista.add(new LivroEntity(4, "O Senhor dos Anéis", "1954", "J.R.R. Tolkien"));
	}
	public String save (LivroEntity livroEntity) {
		return "Livro cadastrado com sucesso";
	}
	
	public String update (LivroEntity livroEntity, long id ) {
		return "Livro atualizado com sucesso";
	}
	
	public LivroEntity findById(long id) {
	    List<LivroEntity> lista = this.findAll();
	    
	    for (LivroEntity livro : lista) {
	        if (livro.getId() == id) {
	            return livro;
	        }
	    }
	    
	    return null; 
	}
	
	public List<LivroEntity>findAll(){
		List<LivroEntity> lista = new ArrayList<>();
		lista.add(new LivroEntity(1 ,"O Pequeno Príncipe", "2008", "Antoine de Saint-Exupéry"));
		lista.add(new LivroEntity(2 ,"Doce como sangue", "2023", "Dan Rodrigues"));
		lista.add(new LivroEntity(3, "Orgulho e Preconceito", "1813", "Jane Austen"));
        lista.add(new LivroEntity(4, "O Senhor dos Anéis", "1954", "J.R.R. Tolkien"));
		
		
		return lista;
	}

	 public String delete(long id) {
	        for (int i = 0; i < lista.size(); i++) {
	            if (lista.get(i).getId() == id) {
	                lista.remove(i);
	                return "Livro deletado com sucesso";
	            }
	        }
	        return "Livro não encontrado";
	    }
}
