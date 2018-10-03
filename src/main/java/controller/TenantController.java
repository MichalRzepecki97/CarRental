package controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tenants")

public class TenantController {

    @GetMapping
    public String getLoggedTenantName(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
