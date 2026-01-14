package com.uisrael.apipsip.dominio.usecase.impl;

import com.uisrael.apipsip.dominio.entidades.AnexoDocumento;
import com.uisrael.apipsip.dominio.repositorios.IAnexoDocumentoRepositorio;
import com.uisrael.apipsip.dominio.usecase.IAnexoDocumentoUseCase;

public class AnexoDocumentoUseCaseImpl implements IAnexoDocumentoUseCase {

    private final IAnexoDocumentoRepositorio repositorio;

    public AnexoDocumentoUseCaseImpl(IAnexoDocumentoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public AnexoDocumento guardar(AnexoDocumento anexo) {
        return repositorio.guardar(anexo);
    }

    @Override
    public java.util.Optional<AnexoDocumento> buscarPorId(Long id) {
        return repositorio.buscarPorId(id);
    }

    @Override
    public java.util.List<AnexoDocumento> listarTodos() {
        return repositorio.listarTodos();
    }

    @Override
    public void eliminar(Long id) {
        repositorio.eliminar(id);
    }
}