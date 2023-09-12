package com.restful.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
