package project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CAR_MASTER")
public class CarDTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CAR_ID")
    private Long carId;
    @Column(name = "Car_Brand")
    private String carBrand;

    @OneToMany(mappedBy = "carDTO")
    private List<OwnerDTO> ownerdtolst;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public List<OwnerDTO> getOwnerdtolst() {
        if (null == ownerdtolst) {
            ownerdtolst = new ArrayList<>();
        }
        return ownerdtolst;
    }

    public void setOwnerdtolst(List<OwnerDTO> ownerdtolst) {
        this.ownerdtolst = ownerdtolst;
    }
}
