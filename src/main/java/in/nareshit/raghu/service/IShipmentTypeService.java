package in.nareshit.raghu.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.nareshit.raghu.model.ShipmentType;

public interface IShipmentTypeService {

	Integer saveShipmentType(ShipmentType st);
	void updateShipmentType(ShipmentType st);
	void deleteShipmentType(Integer id);
	ShipmentType getOneShipmentType(Integer id);
	List<ShipmentType> getAllShipmentTypes();
	
	boolean isShipmentTypeCodeExist(String code);
	List<Object[]> getShipmentModeAndCount();
	
	Map<Integer,String> getShipmentIdAndCodeByEnable(String enable);
	
	Page<ShipmentType> getAllShipmentTypes(Pageable p);
}
