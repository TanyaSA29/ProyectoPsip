package com.uisrael.comusoapi.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orden")
public class OrdenControlador {

    // RF-01 y RF-02: Formulario para equipo y servicio
    @GetMapping("/nueva")
    public String nuevaorden() {
        return "orden/nuevaorden"; // Busca en templates/orden/nuevaorden.html
    }

    // RF-10: Lista de seguimiento
    @GetMapping("/listar")
    public String listarorden() {
        return "orden/listarorden"; // Busca en templates/orden/listarorden.html
    }

   
}