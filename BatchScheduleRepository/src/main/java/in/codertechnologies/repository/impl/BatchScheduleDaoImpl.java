package in.codertechnologies.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.coderinfotech.batchschedule.BatchDetails;
import in.coderinfotech.batchschedule.StateMst;
import in.codertechnologies.batchSchedule.dto.BatchScheduleDTO;
import in.codertechnologies.repository.dao.BachScheduleDAO;
import in.codertechnologies.repository.utils.BatchUtility;

@Repository("bachScheduleDAO")
@Transactional
public class BatchScheduleDaoImpl implements BachScheduleDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean insertBatchSchedule(BatchScheduleDTO batchScheduleDto) {
		BatchDetails batchDetails = BatchUtility.convertBatchScheduleDTOToDO(batchScheduleDto);
		sessionFactory.getCurrentSession().saveOrUpdate(batchDetails);
		return false;
	}

	@Override
	public BatchScheduleDTO findBatchScheduleById(int id) {
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
