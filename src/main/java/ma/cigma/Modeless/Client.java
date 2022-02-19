package ma.cigma.Modeless;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;


@ToString
@Data
@Entity(name="unit_CLIENT")


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column
    private  String name;
    @OneToOne
    @JoinColumn(name = "client_id")

 //   @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
   // public static void setFactures(List<Facture> factures) {}

  //  @ManyToMany(cascade = {CascadeType.PERSIST})
    //@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(name = "client_fk", referencedColumnName = "id"),
      //      inverseJoinColumns = @JoinColumn(name = "promotion_fk", referencedColumnName = "id"))


  public static void setPromotions(List<Promotion> promotions){}

    public Client(int id) {
        this.id = id;

    }

    public Client(){}

    public Client(String name) {
        this.name = name;
    }

    public static void setCarteFidelio(CarteFidelio carteFidelio) {
    }


    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
