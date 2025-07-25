package dev.blaauwendraad.recipe_book.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "preparation_step")
public class PreparationStepEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SuppressWarnings("NullAway.Init")
    public Long id;

    @ManyToOne
    @JoinColumn(name = "recipe_id", referencedColumnName = "id", nullable = false)
    @SuppressWarnings("NullAway.Init")
    public RecipeEntity recipe;

    @Column(columnDefinition = "text", nullable = false)
    @SuppressWarnings("NullAway.Init")
    public String description;

    @Column(nullable = false)
    @SuppressWarnings("NullAway.Init")
    public Integer position = 0;
}
