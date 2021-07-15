package in.nareshit.raghu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Modifying
	@Query("UPDATE in.nareshit.raghu.model.User SET active=:active WHERE id=:id")
	public void updateStatus(Integer id,boolean active);
	
	@Modifying
	@Query("UPDATE in.nareshit.raghu.model.User SET pwd=:encPwd WHERE id=:id")
	public void updatePwd(Integer id,String encPwd);
	
	Optional<User> findByEmail(String email);

	@Modifying
	@Query("UPDATE in.nareshit.raghu.model.User SET otp=:otpNew WHERE id=:id")
	public void updateNewOtpById(Integer id, String otpNew);
	
}
