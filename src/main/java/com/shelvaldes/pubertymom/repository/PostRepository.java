package com.shelvaldes.pubertymom.repository;
import org.springframework.stereotype.Repository;
import com.shelvaldes.pubertymom.service.PostCrudRepository;
import antlr.collections.List;

//@Component
@Repository
public class PostRepository {
	private PostCrudRepository postCrudRepository;
	
	public List getAll(){
		return (List) postCrudRepository.findAll();
	}
	
//	public List <Producto> getByCategoria(int idCategoria){
//		return productoCrudRepository.findByIdCategoria(idCategoria);
//	}
	
	
}
