package com.uisrael.comusoapi.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteControlador {

    // Ruta: localhost:8080/cliente/nuevo
    @GetMapping("/nuevo")
    public String nuevocliente() {
        return "cliente/nuevocliente"; // Busca en templates/cliente/nuevocliente.html
    }

    // Ruta: localhost:8080/cliente/listar
    @GetMapping("/listar")
    public String listarcliente() {
        return "cliente/listarcliente"; // Busca en templates/cliente/listarcliente.html
    }
}