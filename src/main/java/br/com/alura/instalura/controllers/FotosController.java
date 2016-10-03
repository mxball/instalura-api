package br.com.alura.instalura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.instalura.daos.FotoDao;
import br.com.alura.instalura.models.Foto;

@RestController
@CrossOrigin
public class FotosController {

	@Autowired
	private FotoDao fotoDao;

	@GetMapping(value="/api/fotos/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Foto> busca(@PathVariable("id") Integer idUsuario) {
		return fotoDao.findByUsuarioId(idUsuario);
	}
}