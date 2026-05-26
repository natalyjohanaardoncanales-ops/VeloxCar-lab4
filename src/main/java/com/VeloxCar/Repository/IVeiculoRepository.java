package com.VeloxCar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VeloxCar.models.Veiculo;

public interface IVeiculoRepository extends JpaRepository<Veiculo, Integer>{

}