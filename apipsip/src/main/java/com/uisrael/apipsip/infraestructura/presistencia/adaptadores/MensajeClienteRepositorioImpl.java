package com.uisrael.apipsip.dominio.usecase.impl;

import com.uisrael.apipsip.dominio.entidades.MensajeCliente;
import com.uisrael.apipsip.dominio.repositorios.IMensajeClienteRepositorio;
import com.uisrael.apipsip.dominio.usecase.IMensajeClienteUseCase;

public class MensajeClienteUseCaseImpl implements IMensajeClienteUseCase {

    private final IMensajeClienteRepositorio repositorio;

    public MensajeClienteUseCaseImpl(IMensajeClienteRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public MensajeCliente guardar(MensajeCliente mensaje) {
        return repositorio.guardar(mensaje);
    }

    @Override
    public java.util.Optional<MensajeCliente> buscarPorId(Long id) {
        return repositorio.buscarPorId(id);
    }

    @Override
    public java.util.List<MensajeCliente> listarTodos() {
        return repositorio.listarTodos();
    }

    @Override
    public void eliminar(Long id) {
        repositorio.eliminar(id);
    }
}