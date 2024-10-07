package lk.ijse.webRTC_with_SpringBoot.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    public String username;
    public String email;
    public String password;
    public String status;
}
