package com.makersharks.makersharks.repository;


import com.makersharks.makersharks.model.ManufacturingProcess;
import com.makersharks.makersharks.model.NatureOfBusiness;
import com.makersharks.makersharks.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location,
            NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcess,
            Pageable pageable
    );
}
