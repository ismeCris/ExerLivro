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

import app.entity.BibliotecaEntity;
import app.service.BibliotecaService;

@RestController
@RequestMapping("/api/biblioteca")
public class BibliotecaController {

	@Autowired
	private BibliotecaService bibliotecaService;

	@PutMapping("/save")
	public ResponseEntity<String> save(@RequestBody BibliotecaEntity bibliotecaEntity) {
		try {
			String msn = this.bibliotecaService.save(bibliotecaEntity);
			return new ResponseEntity<>(msn, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu Erro! " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{index}")
	public ResponseEntity<String> update(@RequestBody BibliotecaEntity bibliotecaEntity, @PathVariable int index) {
		try {
			String msn = this.bibliotecaService.update(bibliotecaEntity, index);
			return new ResponseEntity<>(msn, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu erro! " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/findById/{index}")
	public ResponseEntity<BibliotecaEntity> findById(@PathVariable int index) {
		try {
			BibliotecaEntity bibliotecaEntity = this.bibliotecaService.findById(index);
			return new ResponseEntity<>(bibliotecaEntity, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<BibliotecaEntity>> findAll() {
		try {
			List<BibliotecaEntity> lista = this.bibliotecaService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{index}")
	public ResponseEntity<String> delete(@PathVariable int index) {
		try {
			String mensagem = this.bibliotecaService.delete(index);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
}
