package oxbank.oxbankapp.CustomerRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import oxbank.oxbankapp.entity.Customers;

public interface CustomerRepo  extends JpaRepository<Customers, Long>{

}
