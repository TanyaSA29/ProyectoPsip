package com.uisrael.apipsip.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.apipsip.dominio.entidades.FotoVerificacion;

public interface IFotoVerificacionRepositorio {
    FotoVerificacion guardar(FotoVerificacion fotoverificacion);
    Optional<FotoVerificacion> buscarPorId(Long id);
    List<FotoVerificacion> listarTodos();
    void eliminar(Long id);
}