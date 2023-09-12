package com.restful.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.entity.Album;
import com.restful.services.AlbumServices;

@RestController()
@RequestMapping(value = "/albums")
public class AlbumController {

	
	
	@GetMapping(value = "/listado")
	public ResponseEntity<List<Album>> getalbumes(){
		
		return new ResponseEntity<List<Album>>(albumServices.getAlbumes(),HttpStatus.OK);
	}
	
	
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarAlbum(@RequestBody Album album){
		try {
			albumServices.guardar(album);
			
			return new ResponseEntity<String>("Se ha guardado el album correctamente",HttpStatus.ACCEPTED);
			
		} catch (Exception e) {}
		
		return new ResponseEntity<String>("ha fracasado el intento de guardar un album",HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@PutMapping(value = "/update")
	public ResponseEntity<?> actualizarAlbum(@RequestBody Album album){
		try {
			Album albumUpdate=albumServices.actualizar(album);
			
			return new ResponseEntity<Album>(albumUpdate,HttpStatus.ACCEPTED);
			
		} catch (Exception e) {}
		
		return new ResponseEntity<String>("ha fracasado el intento de actualizar un album",HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> eliminarAlbum(@PathVariable("id")Integer id){
		try {
			albumServices.eliminar(id);
			
			return new ResponseEntity<String>("se ha eliminado un album del catalogo",HttpStatus.ACCEPTED);
			
		} catch (Exception e) {}
		
		return new ResponseEntity<String>("No se ha eliminado un album del catalogo",HttpStatus.BAD_REQUEST);
	}
	
	
	@Autowired
	private AlbumServices albumServices;
}
