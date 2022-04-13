package com.nplusone.db.n_plus_one;


import javax.persistence.*;

/*

JPA Entity Graph to dynamically fetch an Entity and its associations.


1. Spring Data JPA Approach
If we are using Spring Data JPA, then we have two options to achieve this -
using EntityGraph or using select query with fetch join JPQL.

The @NamedEntityGraph annotation allows specifying the attributes to include
when we want to load the entity and the related associations.

@NamedEntityGraph(
        name = "Building.List",
        attributeNodes = {@NamedAttributeNode(value = "apartments", subgraph = "Building.Apartment")},
        subgraphs = {
                @NamedSubgraph(name = "Building.Apartment",
                        attributeNodes = @NamedAttributeNode(value = "tenants"))
        }
)


@EntityGraph(value = "Building.List")
@Query("select b from Building as b")
List<Building> findAllWithEntityGraph();


 */
@NamedEntityGraph
public class NPlusOneTest { }
