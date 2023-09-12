package com.restful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.Repositories.AlbumsRepository;
import com.restful.entity.Album;


@Service
public class AlbumServiceImpl implements AlbumServices {

	@Override
	public List<Album> getAlbumes() {
		
		return albumsRepository.findAll();
	}

	@Autowired 
	private AlbumsRepository albumsRepository;

	@Override
	public void guardar(Album album) {
		albumsRepository.save(album);
		
	}

	@Override
	public Album actualizar(Album album) {
		albumsRepository.save(album);
		
		return albumsRepository
				.findById(album.getId())
				.orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		albumsRepository.deleteById(id);
		
	}
}
