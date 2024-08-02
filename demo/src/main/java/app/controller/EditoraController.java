package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.EditoraEntity;
import app.service.EditoraService;

@RestController
@RequestMapping("/api/editora")
public class EditoraController {

	@Autowired
	private EditoraService editoraService;

	@PutMapping("/save")
	public ResponseEntity<String> save(@RequestBody EditoraEntity editoraEntity) {
		try {
			String msn = this.editoraService.save(editoraEntity);
			return new ResponseEntity<>(msn, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu Erro! " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{index}")
	public ResponseEntity<String> update(@RequestBody EditoraEntity editoraEntity, @PathVariable int index) {
		try {
			String msn = this.editoraService.update(editoraEntity, index);
			return new ResponseEntity<>(msn, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu erro! " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/findById/{index}")
	public ResponseEntity<EditoraEntity> findById(@PathVariable int index) {
		try {
			EditoraEntity editoraEntity = this.editoraService.findById(index);
			return new ResponseEntity<>(editoraEntity, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<EditoraEntity>> findAll() {
		try {
			List<EditoraEntity> lista = this.editoraService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{index}")
	public ResponseEntity<String> delete(@PathVariable int index) {
		try {
			String mensagem = this.editoraService.delete(index);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
}
