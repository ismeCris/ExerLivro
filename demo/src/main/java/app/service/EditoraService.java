package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.EditoraEntity;

@Service
public class EditoraService {
	private static List<EditoraEntity> lista = new ArrayList<>();

	static {
		lista.add(new EditoraEntity("Editora A", "Rua A, 123"));
		lista.add(new EditoraEntity("Editora B", "Avenida B, 456"));
		lista.add(new EditoraEntity("Editora C", "Travessa C, 789"));
	}

	public String save(EditoraEntity editoraEntity) {
		lista.add(editoraEntity);
		return "Editora cadastrada com sucesso";
	}

	public String update(EditoraEntity editoraEntity, int index) {
		if (index >= 0 && index < lista.size()) {
			lista.set(index, editoraEntity);
			return "Editora atualizada com sucesso";
		} else {
			return "Editora não encontrada";
		}
	}

	public EditoraEntity findById(int index) {
		if (index >= 0 && index < lista.size()) {
			return lista.get(index);
		} else {
			return null;
		}
	}

	public List<EditoraEntity> findAll() {
		return new ArrayList<>(lista);
	}

	public String delete(int index) {
		if (index >= 0 && index < lista.size()) {
			EditoraEntity editora = lista.remove(index);
			return editora.getNome() + " deletada com sucesso";
		} else {
			return "Editora não encontrada";
		}
	}
}
