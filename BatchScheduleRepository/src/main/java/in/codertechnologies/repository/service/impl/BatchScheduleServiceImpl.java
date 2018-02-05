package in.codertechnologies.repository.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codertechnologies.batchSchedule.dto.BatchScheduleDTO;
import in.codertechnologies.repository.dao.BachScheduleDAO;
import in.codertechnologies.repository.service.BatchScheduleService;

@Service("batchScheduleService")
public class BatchScheduleServiceImpl implements BatchScheduleService{

	@Autowired
	private BachScheduleDAO bachScheduleDAO;

	@Override
	public boolean insertBatchSchedule(BatchScheduleDTO batchSchedule) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BatchScheduleDTO findBatchScheduleById(int id)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountOfRecords() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BatchScheduleDTO> findAllBatchSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBatchScheduleById(int id) {
		// TODO Auto-generated method stub
		return false;
	} 
	
	
}
