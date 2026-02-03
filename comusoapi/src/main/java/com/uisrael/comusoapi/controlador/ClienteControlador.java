package com.uisrael.comusoapi.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uisrael.comusoapi.modelo.dto.request.ClienteRequestDTO;
import com.uisrael.comusoapi.modelo.dto.request.EquipoRequestDTO;
import com.uisrael.comusoapi.modelo.dto.response.ClienteResponseDTO;
import com.uisrael.comusoapi.service.IClienteServicio;
import com.uisrael.comusoapi.service.IEquipoServicio;

@Controller
@RequestMapping("/cliente") //http://localhost:8081/cliente
public class ClienteControlador {
	@Autowired
	private IClienteServicio servicioCliente;
	@Autowired
	private IEquipoServicio servicioEquipo;
    @GetMapping("/listar")
    public String listarcliente(Model model) {
    	List<ClienteResponseDTO>contenidoBD=servicioCliente.listarCliente();
    	model.addAttribute("listacliente", contenidoBD); //pasoiinf al html
        return "cliente/listarcliente";   // Ruta:
        
      
    }
    
    

    @GetMapping("/nuevo")
    public String nuevoCliente(Model model) {

        model.addAttribute("clienteDTO", new ClienteRequestDTO());
        model.addAttribute("equipoDTO", new EquipoRequestDTO());

        return "cliente/nuevocliente";
    }
 
    @PostMapping("/nuevo")
    public String guardar(@ModelAttribute("clienteDTO") ClienteRequestDTO clienteDTO, 
                          @ModelAttribute("equipoDTO") EquipoRequestDTO equipoDTO,
                          Model model) {
        try {
       
            ClienteRequestDTO clienteGuardado = servicioCliente.crearCliente(clienteDTO);
            
            equipoDTO.setIdCliente(clienteGuardado.getIdCliente());
            servicioEquipo.crearEquipo(equipoDTO); 
            
            return "redirect:/cliente/listar";
        } catch (Exception e) {
            
            model.addAttribute("error", "No se pudo guardar: " + e.getMessage());
            return "cliente/nuevocliente"; 
        }
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") int id) {
        
        servicioCliente.eliminarCliente(id); 
        return "redirect:/cliente/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") int id, Model model) {
       
        ClienteResponseDTO cliente = servicioCliente.buscarClientePorId(id);
        
    
        model.addAttribute("clienteDTO", cliente); 
        model.addAttribute("equipoDTO", new EquipoRequestDTO());
        return "cliente/nuevocliente";
    }
    
}