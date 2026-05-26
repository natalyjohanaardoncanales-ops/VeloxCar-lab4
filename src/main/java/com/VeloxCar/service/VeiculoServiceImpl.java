package com.VeloxCar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VeloxCar.Repository.IVeiculoRepository;
import com.VeloxCar.models.Veiculo;

@Service
public class VeiculoServiceImpl implements IVeiculoService {

    @Autowired
    private IVeiculoRepository repoVeiculo;

    public List<Veiculo> buscarTodo() {
        return repoVeiculo.findAll();
    }

    public Veiculo buscarPorId(Integer idVeiculo) {
        return repoVeiculo.findById(idVeiculo).orElse(null);
    }

    public void guardar(Veiculo veiculo) {
        repoVeiculo.save(veiculo);
    }

}
