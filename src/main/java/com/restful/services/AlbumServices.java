package com.restful.services;

import java.util.List;

import com.restful.entity.Album;

public interface AlbumServices {

	
	List<Album>getAlbumes();
	
	void guardar(Album album);
	
	Album actualizar(Album album);


	void eliminar(Integer id);
}
