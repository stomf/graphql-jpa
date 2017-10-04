package org.crygier.graphql.model.starwars

import groovy.transform.CompileStatic
import org.crygier.graphql.annotation.GraphQLIgnore
import org.crygier.graphql.annotation.SchemaDocumentation

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
@SchemaDocumentation("Represents an electromechanical robot in the Star Wars Universe")
@CompileStatic
class Droid extends Character {

    @SchemaDocumentation("Documents the primary purpose this droid serves")
    String primaryFunction;

    @OneToMany(mappedBy = "droid")
    @SchemaDocumentation("The droid carrying this document")
    List<Document> documents = new ArrayList<Document>();

    @GraphQLIgnore
    @SchemaDocumentation("Secret! Graphql should not map this")
    String secret;

    @GraphQLIgnore
    byte[] data;

}
