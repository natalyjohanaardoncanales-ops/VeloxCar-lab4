package com.VeloxCar.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.VeloxCar.models.Veiculo;
import com.VeloxCar.service.IVeiculoService;

@Controller
public class HomeController {

    @Autowired
    private IVeiculoService servicVeiculo;

    @GetMapping("/")
    public String mostrarHome(Model model) {

        List<Veiculo> lista = servicVeiculo.buscarTodo();

        model.addAttribute("listadoVeiculos", lista);

        return "home";
    }

}

