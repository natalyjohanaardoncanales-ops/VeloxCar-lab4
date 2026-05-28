package com.VeloxCar.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.VeloxCar.Repository.ICategoriaRepository;
import com.VeloxCar.models.Categoria;

@Controller
public class CategoriasController {

    @Autowired
    private ICategoriaRepository categoriaRepo;

    @GetMapping("/categorias/index")
    public String mostrarCategorias(Model model) {
        List<Categoria> lista = categoriaRepo.findAll();
        model.addAttribute("categorias", lista);
        return "categorias";
    }
}