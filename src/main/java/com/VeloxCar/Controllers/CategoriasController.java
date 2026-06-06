package com.VeloxCar.Controllers;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.VeloxCar.models.Categoria;
import com.VeloxCar.service.ICategoriaService;

@Controller
public class CategoriasController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/categorias/index")
    public String mostrarCategorias(Model model) {
        List<Categoria> lista = categoriaService.getAllCategorias();
        model.addAttribute("categorias", lista);
        model.addAttribute("categoria", new Categoria());
        return "categorias";
    }

    @PostMapping("/categorias/save")
    public String saveCategoria(@ModelAttribute Categoria categoria) {
        categoriaService.saveCategoria(categoria);
        return "redirect:/categorias/index";
    }

    @GetMapping("/categorias/delete/{id}")
    public String deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoria(id);
        return "redirect:/categorias/index";
    }

    @GetMapping("/categorias/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Categoria categoria = categoriaService.getCategoriaById(id);
        model.addAttribute("categoria", categoria);
        return "categorias"; // regresa a la misma vista con los datos cargados
    }

    @PostMapping("/categorias/update")
    public String updateCategoria(@ModelAttribute Categoria categoria) {
        categoriaService.saveCategoria(categoria);
        return "redirect:/categorias/index";
    }
}