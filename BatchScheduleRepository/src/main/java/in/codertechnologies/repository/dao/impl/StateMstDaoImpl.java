package in.codertechnologies.repository.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.coderinfotech.batchschedule.StateMst;
import in.codertechnologies.batchSchedule.dto.StateMstDTO;
import in.codertechnologies.repository.dao.StateMstDAO;

@Repository("stateMstDAO")
@Transactional
@SuppressWarnings("unchecked")
public class StateMstDaoImpl implements StateMstDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean insertState(StateMstDTO stateMstDTO) {
		ModelMapper modelMapper = new ModelMapper();
		StateMst stateMst = modelMapper.map(stateMstDTO, StateMst.class);
		sessionFactory.getCurrentSession().saveOrUpdate(stateMst);
		return true;
	}

	@Override
	public StateMstDTO findStateMstById(StateMstDTO stateMstDTO) {
		ModelMapper modelMapper = new ModelMapper();
		StateMst stateMst = (StateMst) sessionFactory.getCurrentSession().get(StateMst.class, stateMstDTO.getStateId());
		stateMstDTO = modelMapper.map(stateMst, StateMstDTO.class);
		return stateMstDTO;
	}

	@Override
	public int getCountOfRecords() {
		return sessionFactory.getCurrentSession().createCriteria(StateMst.class).list().size();
	}

	@Override
	public List<StateMstDTO> findAllStateMst() {
		List<StateMstDTO> stateMstDTOList = new ArrayList<StateMstDTO>();
		List<StateMst> stateMstDOList = sessionFactory.getCurrentSession().createCriteria(StateMst.class).list();
		ModelMapper modelMapper = new ModelMapper();
		for (StateMst StateMst : stateMstDOList) {
			stateMstDTOList.add(modelMapper.map(StateMst, StateMstDTO.class));
		}
		return stateMstDTOList;
	}

	@Override
	public boolean deleteStateMstById(StateMstDTO stateMstDTO) {
		ModelMapper modelMapper = new ModelMapper();
		StateMst stateMst = modelMapper.map(stateMstDTO, StateMst.class);
		sessionFactory.getCurrentSession().delete(stateMst);
		return true;
	}
	
}
