package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import app.entity.EditoraEntity;

@Service
public class EditoraService {

    private static List<EditoraEntity> lista = new ArrayList<>();

    static {
       /* lista.add(new EditoraEntity(1, "Editora Abril", "São Paulo"));
        lista.add(new EditoraEntity(2, "Editora Globo", "Rio de Janeiro"));
        lista.add(new EditoraEntity(3, "Editora Record", "São Paulo"));
        lista.add(new EditoraEntity(4, "Editora Planeta", "São Paulo"));*/
    }

    public String save(EditoraEntity editoraEntity) {
        lista.add(editoraEntity);
        return "Editora cadastrada com sucesso";
    }

    public String update(EditoraEntity editoraEntity, long id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.set(i, editoraEntity);
                return "Editora atualizada com sucesso";
            }
        }
        return "Editora noo encontrada";
    }

    public EditoraEntity findById(long id) {
        for (EditoraEntity editora : lista) {
            if (editora.getId() == id) {
                return editora;
            }
        }
        return null;
    }

    public List<EditoraEntity> findAll() {
        return new ArrayList<>(lista);
    }

    public String delete(long id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
                return "Editora deletada com sucesso";
            }
        }
        return "Editora não encontrada";
    }
    
  
    
}
