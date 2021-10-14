package com.shelvaldes.pubertymom.repository;
import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
	
	//como es la clave primaria y es autogenerada:
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Como no se llama igual, poner:
	@Column(name = "id")
	private Integer idPost;
	private String image;
	private String  change;
	private String  action;
	private String emotion;
	private String advice;
	
	//getters y setters
	private Integer getIdPost() {
		return idPost;
	}
	private void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}
	private String getImage() {
		return image;
	}
	private void setImage(String image) {
		this.image = image;
	}
	private String getChange() {
		return change;
	}
	private void setChange(String change) {
		this.change = change;
	}
	private String getAction() {
		return action;
	}
	private void setAction(String action) {
		this.action = action;
	}
	private String getEmotion() {
		return emotion;
	}
	private void setEmotion(String emotion) {
		this.emotion = emotion;
	}
	private String getAdvice() {
		return advice;
	}
	private void setAdvice(String advice) {
		this.advice = advice;
	}
	
	

}
