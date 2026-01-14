package com.uisrael.apipsip.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.apipsip.aplicacion.casosuso.entradas.IClienteUseCase;
import com.uisrael.apipsip.aplicacion.casosuso.entradas.IEquipoUseCase;
import com.uisrael.apipsip.aplicacion.casosuso.entradas.IOrdenTrabajoUseCase;
import com.uisrael.apipsip.aplicacion.casosuso.entradas.ITecnicoUseCase;
import com.uisrael.apipsip.aplicacion.casosuso.entradas.ITipoServicioUseCase;
import com.uisrael.apipsip.dominio.repositorios.IClienteRepositorio;
import com.uisrael.apipsip.dominio.repositorios.IEquipoRepositorio;
import com.uisrael.apipsip.dominio.repositorios.IOrdenTrabajoRepositorio;
import com.uisrael.apipsip.dominio.repositorios.ITecnicoRepositorio;
import com.uisrael.apipsip.dominio.repositorios.ITipoServicioRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IClienteJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IEquipoJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IOrdenTrabajoJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.ITecnicoJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.ITipoServicioJpaRepositorio;
import com.uisrael.apipsip.aplicacion.casosuso.impl.ClienteUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.EquipoUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.OrdenTrabajoUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.TecnicoUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.TipoServicioUseCaseImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.ClienteRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.EquipoRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.OrdenTrabajoRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.TecnicoRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.TipoServicioRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IEquipoJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IOrdenTrabajoJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.ITecnicoJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.ITipoServicioJpaMapper;
//Interfaces de dominio
import com.uisrael.apipsip.dominio.repositorios.IAnexoDocumentoRepositorio;
import com.uisrael.apipsip.dominio.repositorios.IMensajeClienteRepositorio;
import com.uisrael.apipsip.dominio.repositorios.IFotoVerificacionRepositorio;
import com.uisrael.apipsip.dominio.repositorios.IHistorialEstadoRepositorio;
import com.uisrael.apipsip.dominio.repositorios.IPaginaWebRepositorio;
//Implementaciones de casos de uso
import com.uisrael.apipsip.aplicacion.casosuso.impl.AnexoDocumentoUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.MensajeClienteUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.FotoVerificacionUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.HistorialEstadoUseCaseImpl;
import com.uisrael.apipsip.aplicacion.casosuso.impl.PaginaWebUseCaseImpl;
//Adaptadores de repositorio (infraestructura)
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.AnexoDocumentoRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.MensajeClienteRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.FotoVerificacionRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.HistorialEstadoRepositorioImpl;
import com.uisrael.apipsip.infraestructura.presistencia.adaptadores.PaginaWebRepositorioImpl;
//Repositorios JPA (Spring Data)
import com.uisrael.apipsip.infraestructura.respositorios.IAnexoDocumentoJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IMensajeClienteJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IFotoVerificacionJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IHistorialEstadoJpaRepositorio;
import com.uisrael.apipsip.infraestructura.respositorios.IPaginaWebJpaRepositorio;
//Mapeadores (MapStruct)
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IAnexoDocumentoJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IMensajeClienteJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IFotoVerificacionJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IHistorialEstadoJpaMapper;
import com.uisrael.apipsip.infraestructura.presistencia.mapeadores.IPaginaWebJpaMapper;

@Configuration
public class ConfiguracionGeneral {
	
	@Bean
	IClienteUseCase clienteUseCase(IClienteRepositorio repositorio) {
		return new ClienteUseCaseImpl(repositorio);
		}
 
	  @Bean
	   IEquipoUseCase equipoUseCase(IEquipoRepositorio repositorio) {
	        return new EquipoUseCaseImpl(repositorio);
	    }

	    @Bean
	    IOrdenTrabajoUseCase ordenTrabajoUseCase(IOrdenTrabajoRepositorio repositorio) {
	        return new OrdenTrabajoUseCaseImpl(repositorio);
	    }

	    @Bean
	    ITecnicoUseCase tecnicoUseCase(ITecnicoRepositorio repositorio) {
	        return new TecnicoUseCaseImpl(repositorio);
	    }

	    @Bean
	    ITipoServicioUseCase tipoServicioUseCase(ITipoServicioRepositorio repositorio) {
	        return new TipoServicioUseCaseImpl(repositorio);
	    }
	    
	    @Bean
		IClienteRepositorio clienterepositorio(IClienteJpaRepositorio jparepositorio, IClienteJpaMapper  mapper) {
	    	
			return new ClienteRepositorioImpl(jparepositorio, mapper);
			}
	    @Bean
	    IEquipoRepositorio equipoRepositorio( IEquipoJpaRepositorio jpaRepositorio, IEquipoJpaMapper mapper) {

	        return new EquipoRepositorioImpl(jpaRepositorio, mapper);
	    }
	    @Bean
	    IOrdenTrabajoRepositorio ordenTrabajoRepositorio(IOrdenTrabajoJpaRepositorio jpaRepositorio,IOrdenTrabajoJpaMapper mapper) {

	        return new OrdenTrabajoRepositorioImpl(jpaRepositorio, mapper);
	    }
	    @Bean
	    ITecnicoRepositorio tecnicoRepositorio( ITecnicoJpaRepositorio jpaRepositorio,ITecnicoJpaMapper mapper) {

	        return new TecnicoRepositorioImpl(jpaRepositorio, mapper);
	    }

	    @Bean
	    ITipoServicioRepositorio tipoServicioRepositorio(ITipoServicioJpaRepositorio jpaRepositorio, ITipoServicioJpaMapper mapper) {

	        return new TipoServicioRepositorioImpl(jpaRepositorio, mapper);
	    }

	    @Bean
	    IAnexoDocumentoUseCase anexoDocumentoUseCase(IAnexoDocumentoRepositorio repositorio) {
	        return new AnexoDocumentoUseCaseImpl(repositorio);
	    }

	    @Bean
	    IMensajeClienteUseCase mensajeClienteUseCase(IMensajeClienteRepositorio repositorio) {
	        return new MensajeClienteUseCaseImpl(repositorio);
	    }

	    @Bean
	    IFotoVerificacionUseCase fotoVerificacionUseCase(IFotoVerificacionRepositorio repositorio) {
	        return new FotoVerificacionUseCaseImpl(repositorio);
	    }

	    @Bean
	    IHistorialEstadoUseCase historialEstadoUseCase(IHistorialEstadoRepositorio repositorio) {
	        return new HistorialEstadoUseCaseImpl(repositorio);
	    }

	    @Bean
	    IPaginaWebUseCase paginaWebUseCase(IPaginaWebRepositorio repositorio) {
	        return new PaginaWebUseCaseImpl(repositorio);
	    }

	    @Bean
	    IAnexoDocumentoRepositorio anexoDocumentoRepositorio(
	            IAnexoDocumentoJpaRepositorio jpaRepositorio,
	            IAnexoDocumentoJpaMapper mapper) {
	        return new AnexoDocumentoRepositorioImpl(jpaRepositorio, mapper);
	    }

	    @Bean
	    IMensajeClienteRepositorio mensajeClienteRepositorio(
	            IMensajeClienteJpaRepositorio jpaRepositorio,
	            IMensajeClienteJpaMapper mapper) {
	        return new MensajeClienteRepositorioImpl(jpaRepositorio, mapper);
	    }

	    @Bean
	    IFotoVerificacionRepositorio fotoVerificacionRepositorio(
	            IFotoVerificacionJpaRepositorio jpaRepositorio,
	            IFotoVerificacionJpaMapper mapper) {
	        return new FotoVerificacionRepositorioImpl(jpaRepositorio, mapper);
	    }

	    @Bean
	    IHistorialEstadoRepositorio historialEstadoRepositorio(
	            IHistorialEstadoJpaRepositorio jpaRepositorio,
	            IHistorialEstadoJpaMapper mapper) {
	        return new HistorialEstadoRepositorioImpl(jpaRepositorio, mapper);
	    }

	    @Bean
	    IPaginaWebRepositorio paginaWebRepositorio(
	            IPaginaWebJpaRepositorio jpaRepositorio,
	            IPaginaWebJpaMapper mapper) {
	        return new PaginaWebRepositorioImpl(jpaRepositorio, mapper);
	    }
}
