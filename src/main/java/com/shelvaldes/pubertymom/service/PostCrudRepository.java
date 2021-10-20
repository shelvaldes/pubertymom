package com.shelvaldes.pubertymom.service;
import com.shelvaldes.pubertymom.repository.Post;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PostCrudRepository extends CrudRepository <Post, Integer>{
	//Ejemplo de la clase:
	//List<Producto> findByIdCategoria(int idCategoria);
	
	//Nativamente se hace de esta forma;
	//@Query(value = "SELECT * FROM  productos WHERE id_categoria = ?", nativeQuery = true)

    //aunque empiece con minúscula, cambiar a mayúscula para que agarre camel case
    List<Post> findByIdImage(String image);

}
