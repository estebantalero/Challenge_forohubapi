package challegen.forohubapi.domain.topico;

import challegen.forohubapi.domain.curso.CursoRepository;
import challegen.forohubapi.domain.topico.validaciones.ValidadorTopico;
import challegen.forohubapi.domain.usuario.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private List<ValidadorTopico> validarTopico;

    public DatosTopico crearTopico(DatosCrearTopico datos) {

        validarTopico.forEach(v -> v.validar(datos));

        var titulo = datos.titulo();
        var mensaje = datos.mensaje();
        var autor = usuarioRepository.getReferenceById(datos.idAutor());
        var curso = cursoRepository.getReferenceById(datos.idCurso());

        var topico = new Topico(titulo, mensaje, autor, curso);

        topicoRepository.save(topico);

        return new DatosTopico(topico);
    }

    public DatosTopico actualizarTopico(DatosActualizarTopico datos) {

        var topico = topicoRepository.getReferenceById(datos.id());
        topico.actualirTopico(datos);

        return new DatosTopico(topico);
    }

    public String eliminarTopico(Long id) {
        var topico = topicoRepository.findById(id);
        if (!topico.isPresent() || id == null) {
            throw new ValidationException("No existe topico con id = " + id);
        }
        topicoRepository.removeById(id);

        return "Topico y respuestas eliminados correctamente.";
    }

    public Page<DatosTopico> listarTopicos(Pageable paginacion) {
        return topicoRepository.findAll(paginacion).map(DatosTopico::new);
    }

    public Page<DatosTopico> listarTopicosResueltos(Pageable paginacion) {
        var topicosSolucionados = topicoRepository.findAllByStatusTrue(paginacion);
        return topicosSolucionados.map(DatosTopico::new);
    }

    public Page<DatosTopico> listarTopicosIrresolutos(Pageable paginacion) {
        var topicosSolucionados = topicoRepository.findAllByStatusFalse(paginacion);
        return topicosSolucionados.map(DatosTopico::new);
    }
}
