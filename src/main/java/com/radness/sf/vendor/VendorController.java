package com.radness.sf.vendor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v3/vendors")
public class VendorController {

    private final VendorService vendorService;

    @GetMapping("/{vendorId}")
    public Vendor viewVendor(@PathVariable String vendorId) {
        return vendorService.getVendor(vendorId);
    }

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.saveVendor(vendor);
    }

    @DeleteMapping("/{vendorId}")
    public void deleteVendor(@PathVariable String vendorId) {
        vendorService.deleteVendor(vendorId);
    }

    @GetMapping("/all")
    public List<Vendor> viewAllVendors() {
        vendorService.getAllVendors();
        return List.of();
    }

}
