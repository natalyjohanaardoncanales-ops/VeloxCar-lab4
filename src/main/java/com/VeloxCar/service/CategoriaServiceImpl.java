package com.VeloxCar.service;

import com.VeloxCar.Repository.ICategoriaRepository;
import com.VeloxCar.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria getCategoriaById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public void updateCategoria(Long id, Categoria categoria) {
        Categoria existente = categoriaRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(categoria.getNombre()); 
            categoriaRepository.save(existente);
        }
    }
}