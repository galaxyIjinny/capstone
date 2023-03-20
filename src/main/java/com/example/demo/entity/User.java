package com.example.demo.entity;

import com.example.demo.dto.UserDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Getter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "mid")
    private Mark mark;
    @Column
    @Size(max=64)
    @NotNull
    private String name;
    @Column
    @Size(max=128)
    @NotNull
    private String email;
    @Column
    @Size(max=64)
    @NotNull
    private String mobile;
    @Column
    @Size(max=64)
    private String phone;
    @Column
    @Size(max=64)
    @NotNull
    private String acc_num;
    @Column
    @CreatedDate
    private LocalDateTime created_at;

    public void patch(User user) {
        if(user.name != null)
            this.name = user.getName();
        if(user.email != null)
            this.email = user.getEmail();
        if(user.mobile != null)
            this.mobile = user.getMobile();
        if(user.phone != null)
            this.phone = user.getPhone();
        if(user.acc_num != null)
            this.acc_num = user.getAcc_num();
    }

    public static User createUser(UserDto dto, Mark mark) {
        return User.builder()
                .id(dto.getId())
                .mark(mark)
                .name(dto.getName())
                .email(dto.getEmail())
                .mobile(dto.getMobile())
                .phone(dto.getPhone())
                .acc_num(dto.getAcc_num())
                .created_at(dto.getCreated_at())
                .build();
    }
}
