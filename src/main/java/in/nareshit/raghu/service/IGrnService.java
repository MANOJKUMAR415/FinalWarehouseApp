package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.model.Grn;
import in.nareshit.raghu.model.GrnDtl;

public interface IGrnService {

	public Integer saveGrn(Grn grn);
	public Grn getOneGrn(Integer id);
	public List<Grn> getAllGrns();
	
	public Integer saveGrnDtl(GrnDtl grnDtl);
	
	//screen#2
	public List<GrnDtl> getAllGrnDtlsByGrnId(Integer grnId);
	public Integer updateGrnDtlStatus(Integer grnDtlId,String grnDtlStatus);
}
