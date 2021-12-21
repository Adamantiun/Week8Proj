package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Worker extends Human {

    private final String username;
    private final String password;

    public Worker(String name, String phone, String username, String password) {
        super(name, phone);
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getPhone() {
        return super.getPhone();
    }
    @Override
    @SuppressWarnings("EqualsGetClass")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(super.getName(), worker.getName()) &&
                Objects.equals(super.getPhone(), worker.getPhone()) &&
                Objects.equals(username, worker.username) &&
                Objects.equals(password, worker.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getPhone(), username, password);
    }
}
