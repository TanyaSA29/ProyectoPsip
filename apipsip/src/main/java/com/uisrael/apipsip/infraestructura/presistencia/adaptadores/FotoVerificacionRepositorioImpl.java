package com.uisrael.apipsip.dominio.usecase.impl;

import com.uisrael.apipsip.dominio.entidades.FotoVerificacion;
import com.uisrael.apipsip.dominio.repositorios.IFotoVerificacionRepositorio;
import com.uisrael.apipsip.dominio.usecase.IFotoVerificacionUseCase;

public class FotoVerificacionUseCaseImpl implements IFotoVerificacionUseCase {

    private final IFotoVerificacionRepositorio repositorio;

    public FotoVerificacionUseCaseImpl(IFotoVerificacionRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public FotoVerificacion guardar(FotoVerificacion foto) {
        return repositorio.guardar(foto);
    }

    @Override
    public java.util.Optional<FotoVerificacion> buscarPorId(Long id) {
        return repositorio.buscarPorId(id);
    }

    @Override
    public java.util.List<FotoVerificacion> listarTodos() {
        return repositorio.listarTodos();
    }

    @Override
    public void eliminar(Long id) {
        repositorio.eliminar(id);
    }
}