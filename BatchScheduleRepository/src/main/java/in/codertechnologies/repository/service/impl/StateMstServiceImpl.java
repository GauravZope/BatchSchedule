package in.codertechnologies.repository.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codertechnologies.batchSchedule.dto.StateMstDTO;
import in.codertechnologies.repository.dao.StateMstDAO;
import in.codertechnologies.repository.service.StateMstService;

@Service("stateMstService")
public class StateMstServiceImpl implements StateMstService{

	@Autowired
	private StateMstDAO stateMstDAO;

	@Override
	public boolean insertState(StateMstDTO StateMstDTO) {
		return stateMstDAO.insertState(StateMstDTO);
	}

	@Override
	public StateMstDTO findStateMstById(StateMstDTO StateMstDTO)  {
		return stateMstDAO.findStateMstById(StateMstDTO);
	}

	@Override
	public int getCountOfRecords() {
		return stateMstDAO.getCountOfRecords();
	}

	@Override
	public List<StateMstDTO> findAllStateMst() {
		
		return stateMstDAO.findAllStateMst();
	}

	@Override
	public boolean deleteStateMstById(StateMstDTO StateMstDTO) {
		return stateMstDAO.deleteStateMstById(StateMstDTO);
	}

	
	
}
