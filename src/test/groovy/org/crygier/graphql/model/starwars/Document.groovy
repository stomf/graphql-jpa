package org.crygier.graphql.model.starwars

import groovy.transform.CompileStatic
import org.crygier.graphql.annotation.GraphQLIgnore
import org.crygier.graphql.annotation.SchemaDocumentation

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
@SchemaDocumentation("A document held by a droid")
@CompileStatic
class Document {

    @Id
    @SchemaDocumentation("Primary Key for the Document Class")
    Long id;

    @SchemaDocumentation("Name of the document")
    String name;

    @ManyToOne
    Droid droid;
}
