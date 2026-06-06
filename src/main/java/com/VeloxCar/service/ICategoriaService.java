package com.VeloxCar.service;


import com.VeloxCar.models.Categoria;
import java.util.List;

public interface ICategoriaService {
    List<Categoria> getAllCategorias();
    Categoria getCategoriaById(Long id);   
    void saveCategoria(Categoria categoria);
    void deleteCategoria(Long id);
	void updateCategoria(Long id, Categoria categoria);          
}