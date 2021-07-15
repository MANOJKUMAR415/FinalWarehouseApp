package in.nareshit.raghu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nareshit.raghu.exception.PurchaseOrderNotFound;
import in.nareshit.raghu.model.PurchaseDtl;
import in.nareshit.raghu.model.PurchaseOrder;
import in.nareshit.raghu.repo.PurchaseDtlRepository;
import in.nareshit.raghu.repo.PurchaseOrderRepository;
import in.nareshit.raghu.service.IPurchaseOrderService;
import in.nareshit.raghu.util.MyCollectionUtil;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {
	@Autowired
	private PurchaseOrderRepository repo;
	@Autowired
	private PurchaseDtlRepository dtlRepo;
	
	@Override
	public Integer savePurchaseOrder(PurchaseOrder po) {
		return repo.save(po).getId();
	}

	@Override
	public List<PurchaseOrder> getAllPurchaseOrders() {
		return repo.findAll();
	}

	@Override
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return repo.findById(id).orElseThrow(
				()-> new PurchaseOrderNotFound("Not Found"));
	}
	
	
	//---screen#2-------------------
	@Override
	public Integer savePurchaseDtl(PurchaseDtl dtl) {
		return dtlRepo.save(dtl).getId();
	}
	
	@Override
	public List<PurchaseDtl> getPurchaseDtlsByOrderId(Integer orderId) {
		return dtlRepo.getPurchaseDtlsByOrderId(orderId);
	}
	
	@Override
	public void removePurchaseDtl(Integer id) {
		dtlRepo.deleteById(id);
	}
	
	@Override
	@Transactional
	public void updateStatus(Integer orderId,String status) {
		repo.updatePurchaseOrderStatusById(orderId, status);
	}
	
	@Override
	public Integer getDtlsCountByOrderId(Integer orderId) {
		return dtlRepo.getPurchaseDtlsCountByOrderId(orderId);
	}
	
	@Override
	public Map<Integer, String> getPurchaseOrderIdAndCodeByStatus(String status) {
		List<Object[]> list = repo.getPurchaseOrderIdAndCodeByStatus(status);
		return MyCollectionUtil.convertListToMap(list);
	}
}
