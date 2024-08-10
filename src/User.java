import java.util.Optional;

class User {
    private Optional<Address> address;

    public User(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
