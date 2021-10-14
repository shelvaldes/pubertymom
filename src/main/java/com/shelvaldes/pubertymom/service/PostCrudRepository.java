package com.shelvaldes.pubertymom.service;
import org.springframework.data.repository.CrudRepository;
import com.shelvaldes.pubertymom.Post;

public interface PostCrudRepository extends CrudRepository <Post, Integer>{
	//Ejemplo de la clase:
	//List<Producto> findByIdCategoria(int idCategoria);
	
	//Nativamente se hace de esta forma;
	//@Query(value = "SELECT * FROM  productos WHERE id_categoria = ?", nativeQuery = true)
}
