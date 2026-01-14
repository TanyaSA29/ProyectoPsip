package com.uisrael.apipsip.dominio.usecase.impl;

import com.uisrael.apipsip.dominio.entidades.PaginaWeb;
import com.uisrael.apipsip.dominio.repositorios.IPaginaWebRepositorio;
import com.uisrael.apipsip.dominio.usecase.IPaginaWebUseCase;

public class PaginaWebUseCaseImpl implements IPaginaWebUseCase {

    private final IPaginaWebRepositorio repositorio;

    public PaginaWebUseCaseImpl(IPaginaWebRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public PaginaWeb guardar(PaginaWeb pagina) {
        return repositorio.guardar(pagina);
    }

    @Override
    public java.util.Optional<PaginaWeb> buscarPorId(Long id) {
        return repositorio.buscarPorId(id);
    }

    @Override
    public java.util.List<PaginaWeb> listarTodos() {
        return repositorio.listarTodos();
    }

    @Override
    public void eliminar(Long id) {
        repositorio.eliminar(id);
    }
}