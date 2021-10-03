package reqresIn;

public class UsersCreateJsonFactory {
    static public UsersCreateJson getUsersCreateJson() {
        return UsersCreateJson.builder()
                .name("morpheus")
                .job("leader")
                .build();
    }
}
