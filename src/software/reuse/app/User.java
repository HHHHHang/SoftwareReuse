package software.reuse.app;

/**
 * Created by dell on 2016/3/22.
 */
public class User {
    private String username;
    private String password;
    private String ip;

    public User(String username,String password,String ip){
        this.username=username;
        this.password=password;
        this.ip=ip;
    }

    public User(String username,String ip){
        this.username=username;
        this.ip=ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
