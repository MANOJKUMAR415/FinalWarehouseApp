package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nareshit.raghu.model.Grn;
import in.nareshit.raghu.model.GrnDtl;
import in.nareshit.raghu.repo.GrnDtlRepository;
import in.nareshit.raghu.repo.GrnRepository;
import in.nareshit.raghu.service.IGrnService;

@Service
public class GrnServiceImpl implements IGrnService {
	@Autowired
	private GrnRepository repo;
	@Autowired
	private GrnDtlRepository dtlRepo;
	
	@Override
	public Integer saveGrn(Grn grn) {
		return repo.save(grn).getId();
	}

	@Override
	public List<Grn> getAllGrns() {
		return repo.findAll();
	}

	@Override
	public Integer saveGrnDtl(GrnDtl grnDtl) {
		return dtlRepo.save(grnDtl).getId();
	}
	
	@Override
	public List<GrnDtl> getAllGrnDtlsByGrnId(Integer grnId) {
		return dtlRepo.getAllGrnDtlsByGrnId(grnId);
	}
	
	@Override
	public Grn getOneGrn(Integer id) {
		return repo.findById(id).get();
	}
	
	@Transactional
	@Override
	public Integer updateGrnDtlStatus(Integer grnDtlId, String grnDtlStatus) {
		return dtlRepo.updateGrnDtlStatus(grnDtlId, grnDtlStatus);
	}
}
