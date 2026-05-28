package com.VeloxCar.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.VeloxCar.models.Reserva;

public interface IReservaRepository
extends JpaRepository<Reserva, Integer>{

}