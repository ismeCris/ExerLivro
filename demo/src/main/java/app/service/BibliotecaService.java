package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.BibliotecaEntity;

@Service
public class BibliotecaService {
	private static List<BibliotecaEntity> lista = new ArrayList<>();

	static {
		lista.add(new BibliotecaEntity("Rua da Paz, 789", "3456-7890"));
	}

	public String save(BibliotecaEntity bibliotecaEntity) {
		lista.add(bibliotecaEntity);
		return "Biblioteca cadastrada com sucesso";
	}

	public String update(BibliotecaEntity bibliotecaEntity, int index) {
		if (index >= 0 && index < lista.size()) {
			lista.set(index, bibliotecaEntity);
			return "Biblioteca atualizada com sucesso";
		} else {
			return "Biblioteca não encontrada";
		}
	}

	public BibliotecaEntity findById(int index) {
		if (index >= 0 && index < lista.size()) {
			return lista.get(index);
		} else {
			return null;
		}
	}

	public List<BibliotecaEntity> findAll() {
		return new ArrayList<>(lista);
	}

	public String delete(int index) {
		if (index >= 0 && index < lista.size()) {
			BibliotecaEntity biblioteca = lista.remove(index);
			return biblioteca.getEndereco() + " deletada com sucesso";
		} else {
			return "Biblioteca não encontrada";
		}
	}
}
