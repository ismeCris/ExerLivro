package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.LivroEntity;
import app.service.LivroService;

@RestController
@RequestMapping("/api/livro")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@PutMapping("/save")
	public ResponseEntity<String> save(@RequestBody LivroEntity livroEntity){
		try {
			String msn = this.livroService.save(livroEntity);
			return new ResponseEntity<>(msn, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Deu Erro!"+e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping("/update/{id}")
	public  ResponseEntity<String> update(@RequestBody LivroEntity livroEntity, @PathVariable long id){
		try {
			String msn = this.livroService.update(livroEntity , id);
			return new ResponseEntity<>(msn, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	public ResponseEntity<LivroEntity> finfById(@PathVariable long id){
		try {
			LivroEntity livroEntity = this.livroService.findById(id);
			return new ResponseEntity<>(livroEntity, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<LivroEntity>> findAll(){
		try {
			List<LivroEntity> lista = this.livroService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable long id){
		try {
			String mensagem = this.livroService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
		}
	}
	

}
