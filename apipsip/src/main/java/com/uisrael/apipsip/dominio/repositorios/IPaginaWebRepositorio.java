package com.uisrael.apipsip.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.apipsip.dominio.entidades.PaginaWeb;

public interface IPaginaWebRepositorio {
    PaginaWeb guardar(PaginaWeb pagina);
    Optional<PaginaWeb> buscarPorId(Long id);
    List<PaginaWeb> listarTodos();
    void eliminar(Long id);
}
