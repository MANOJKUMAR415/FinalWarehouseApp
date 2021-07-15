package in.nareshit.raghu.service;

import java.util.List;
import java.util.Optional;

import in.nareshit.raghu.model.Shipping;
import in.nareshit.raghu.model.ShippingDtl;

public interface IShippingService {

	Integer saveShipping(Shipping s);

	void updateShipping(Shipping s);

	void deleteShipping(Integer id);

	Optional<Shipping> getOneShipping(Integer id);

	List<Shipping> getAllShippings();

	boolean isShippingExist(Integer id);

	// -----------Screen#2--------
	Integer saveShippingDtl(ShippingDtl dtl);

	List<ShippingDtl> getAllDtlsByShippingId(Integer shippingId);

	void updateStatusByShippinDtlId(String status, Integer id);
}
