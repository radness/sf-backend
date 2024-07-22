package com.radness.sf.vendor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VendorService {

    private final VendorRepository vendorRepository;

    public void getAllVendors() {

    }

    public Vendor getVendor(String vendorId) {
        return vendorRepository.findById(vendorId).orElse(null);
    }

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public void deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
    }
}
