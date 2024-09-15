final class Address implements Cloneable {
    private final String street;
    private final String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    // Implement clone for deep copying custom object
    @Override
    protected Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    @Override
    public String toString() {
        return street + ", " + city;
    }
}
