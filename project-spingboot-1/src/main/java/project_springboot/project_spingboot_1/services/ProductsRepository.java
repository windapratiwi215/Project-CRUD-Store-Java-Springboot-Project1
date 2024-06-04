package project_springboot.project_spingboot_1.services;

import org.springframework.data.jpa.repository.JpaRepository;
import project_springboot.project_spingboot_1.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
