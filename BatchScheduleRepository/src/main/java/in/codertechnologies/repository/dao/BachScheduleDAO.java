package in.codertechnologies.repository.dao;

import java.util.List;

import in.codertechnologies.batchSchedule.dto.BatchScheduleDTO;

public interface BachScheduleDAO {
boolean insertBatchSchedule(BatchScheduleDTO batchSchedule);
	
	BatchScheduleDTO findBatchScheduleById(int id);
	
	int getCountOfRecords();
	
	List<BatchScheduleDTO>  findAllBatchSchedule();
	
	boolean deleteBatchScheduleById(int id);
}
