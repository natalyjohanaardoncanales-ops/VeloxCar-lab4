package com.VeloxCar.service;


import java.util.List;

import com.VeloxCar.models.Veiculo;

public interface IVeiculoService {

    List<Veiculo> buscarTodo();

    Veiculo buscarPorId(Integer idVeiculo);

    void guardar(Veiculo veiculo);

}