
package br.com.mauriliomachado.portfolio.repository;

import br.com.mauriliomachado.portfolio.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    Portfolio findByIdAndUserId(String id, Long userId);
}