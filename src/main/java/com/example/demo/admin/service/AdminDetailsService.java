package com.example.demo.admin.service;

import com.example.demo.admin.dto.AdminDto;
import com.example.demo.admin.entity.Admin;
import com.example.demo.admin.repository.AdminRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminDetailsService implements UserDetailsService {
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUsername(username);
        if (admin == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new AdminDetails(admin);
    }
    @Transactional
    public void joinAdmin(AdminDto dto) {
        Admin admin = Admin.createAdmin(dto);
        String password = admin.getPassword();
        String enPassword = bCryptPasswordEncoder.encode(password);
        admin.setPassword(enPassword);
        admin.setRole("ADMIN");
        adminRepository.save(admin);
    }

}
