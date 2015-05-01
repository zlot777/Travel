package Model.Entity;

import javax.persistence.*;

/**
 * Created by Администратор on 01.05.2015.
 */
@Entity
@Table(name = "special_tour", schema = "", catalog = "travel_agency")
public class SpecialTourEntity {
    private int id;
    private int actionId;
    private int tourId;
    private Byte deleted;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "actionId", nullable = false, insertable = true, updatable = true)
    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    @Basic
    @Column(name = "tourId", nullable = false, insertable = true, updatable = true)
    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "deleted", nullable = true, insertable = true, updatable = true)
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialTourEntity that = (SpecialTourEntity) o;

        if (actionId != that.actionId) return false;
        if (id != that.id) return false;
        if (tourId != that.tourId) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + actionId;
        result = 31 * result + tourId;
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}
