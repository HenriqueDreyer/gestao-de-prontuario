package br.com.ft.gdp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.ft.gdp.dao.VisitEventDao;
import br.com.ft.gdp.exception.ObjectNotFoundException;
import br.com.ft.gdp.models.domain.VisitEvent;

/**
 * Classe VisitEventService.java
 * 
 * @author <a href="mailto:williamsgomes45@gmail.com">Williams Gomes</a>
 *
 * @since 17 Sept, 2019
 */
@Service
public class VisitEventService extends GenericService<VisitEvent, Long> {
	
	@Autowired
	private VisitEventDao dao;

	@Override
	public Page<VisitEvent> searchEntityPage(Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	@Override
	public VisitEvent findById(Long id) {
		return dao.findById(id).orElseThrow(
				() -> new ObjectNotFoundException(String.format("Evento de Visita com o ID: [%s] não encontrado", id)));
	}

	@Override
	public VisitEvent update(Long id, VisitEvent entity) {
		VisitEvent auxEntity = findById(id);
		BeanUtils.copyProperties(entity, auxEntity, "id");
		return dao.save(auxEntity);
	}

	@Override
	public void delete(VisitEvent entity) {
		deleteById(entity.getId());
	}

	@Override
	public void deleteById(Long id) {
		VisitEvent auxEntity = findById(id);
		dao.delete(auxEntity);
	}

	@Override
	public VisitEvent persist(VisitEvent entity) {
		return dao.save(entity);
	}
	
	/**
	 * Retorna os eventos de visitas de um paciente
	 */
	public Page<VisitEvent> findByPatientId(Long id, Pageable pageable) {
		return dao.findByPatientId(id, pageable);
	}

}