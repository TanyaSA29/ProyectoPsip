package com.uisrael.apipsip.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.apipsip.dominio.entidades.AnexoDocumento;

public interface IAnexoDocumentoRepositorio {
    AnexoDocumento guardar (AnexoDocumento anexodocumento);
    Optional<AnexoDocumento> buscarPorId(Long id);
    List<AnexoDocumento> listarTodos();
    void eliminar(Long id);
    

}