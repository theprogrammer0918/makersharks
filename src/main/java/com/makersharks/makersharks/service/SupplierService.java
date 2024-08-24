package com.makersharks.makersharks.service;

import com.makersharks.makersharks.model.ManufacturingProcess;
import com.makersharks.makersharks.model.NatureOfBusiness;
import com.makersharks.makersharks.model.Supplier;
import com.makersharks.makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess process, Pageable pageable) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location, natureOfBusiness, process, pageable);
    }
}

