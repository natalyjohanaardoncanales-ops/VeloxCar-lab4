package com.VeloxCar.Controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.VeloxCar.Repository.IReservaRepository;
import com.VeloxCar.Repository.IVeiculoRepository;
import com.VeloxCar.models.Reserva;
import com.VeloxCar.models.Veiculo;

@Controller
public class ReservaController {

    @Autowired
    private IReservaRepository repoReserva;

    @Autowired
    private IVeiculoRepository repoVeiculo;  

    @GetMapping("/reservas")
    public String mostrarReserva(Model model) {
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("vehiculos", repoVeiculo.findAll()); 
        return "reservas";
    }

    @GetMapping("/reservas/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("vehiculos", repoVeiculo.findAll()); 
        return "reservas";
    }

    @PostMapping("/reservas/save")
    public String guardarReserva(Reserva reserva) {
        repoReserva.save(reserva);
        return "redirect:/reservas/index";
    }

    @GetMapping("/reservas/index")
    public String mostrarListado(Model model) {
        List<Reserva> lista = repoReserva.findAll();
        model.addAttribute("listadoReservas", lista);
        return "listadoReservas";
    }
}