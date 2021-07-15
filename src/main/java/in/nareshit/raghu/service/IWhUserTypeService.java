package in.nareshit.raghu.service;

import java.util.List;
import java.util.Map;

import in.nareshit.raghu.model.WhUserType;

public interface IWhUserTypeService {

	public Integer saveWhUserType(WhUserType whUserType);
	public List<WhUserType> getAllWhUserTypes();
	
	public void updateWhUserType(WhUserType whUserType);
	public void deleteWhUserType(Integer id);
	public WhUserType getOneWhUserType(Integer id);
	
	public boolean isWhUserMailIdExist(String email);
	public Map<Integer,String> getWhUserTypeByUserType(String userType);
}
