package com.VeloxCar.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.VeloxCar.models.Veiculo;
import com.VeloxCar.service.IVeiculoService;

@Controller
public class VeiculoController {

    @Autowired
    private IVeiculoService servicVeiculo;

    @GetMapping("/veiculos/index")
    public String mostrarIndex(Model model) {

        List<Veiculo> lista = servicVeiculo.buscarTodo();

        model.addAttribute("listadoVeiculos", lista);

        return "listado";
    }
    @GetMapping("/veiculos/create")
    public String crear(Veiculo veiculo) {
        return "formVeiculo";
    }
    @PostMapping("/veiculos/save")
    public String guardar(Veiculo veiculo, RedirectAttributes attributes) {

        servicVeiculo.guardar(veiculo);

        attributes.addFlashAttribute("msg", "Vehículo guardado correctamente");

        return "redirect:/veiculos/index";
    }
    
}