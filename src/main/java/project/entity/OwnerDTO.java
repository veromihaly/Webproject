package project.entity;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author s727953
 *
 */

@Entity
@Table(name = "OWNER_INFO")
@NamedQuery(name = "OwnerDTO.findAll", query = "SELECT a FROM OwnerDTO a")
public class OwnerDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;
    @Column(name = "OWNER_NAME", nullable = false)
    private String ownerName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;
    private String address1;
    @Column(name = "EMAIL_ID")
    private String emailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    private CarDTO carDTO;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public CarDTO getCarDTO() {

        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
    }

}

