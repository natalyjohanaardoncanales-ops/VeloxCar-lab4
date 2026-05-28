package com.VeloxCar.service;


import com.VeloxCar.models.Categoria;
import java.util.List;

public interface ICategoriaService {
    List<Categoria> getAllCategorias();
    Categoria getCategoriaById(Integer id);
    void saveCategoria(Categoria categoria);
    void deleteCategoria(Integer id);
}