package cz.cvut.fit.kalacvla.RestApi.model;

import javax.persistence.*;

@Entity(name = "PASSPORT")
@Table(name = "PASSPORT")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "PASSPORT_ID")
    private int passport_id;

    @Column(name = "PASSPORT_NUMBER")
    private String passport_number;

    @Column(name = "COUNTRY")
    private String country;

    @OneToOne(mappedBy = "passport", fetch = FetchType.LAZY)
    private Person person;

    public int getPassport_id() {
        return passport_id;
    }

    public void setPassport_id(int passport_id) {
        this.passport_id = passport_id;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
