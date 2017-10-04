package org.crygier.graphql.model.starwars

import groovy.transform.CompileStatic
import org.crygier.graphql.annotation.GraphQLIgnore
import org.crygier.graphql.annotation.SchemaDocumentation

import javax.persistence.Entity

@Entity
@SchemaDocumentation("Represents an electromechanical robot in the Star Wars Universe")
@CompileStatic
class Droid extends Character {

    @SchemaDocumentation("Documents the primary purpose this droid serves")
    String primaryFunction;

    // this causes an exception in GraphQLSchemaBuilder.getAttributeType
    // byte array not used very much in graphql.
    // That's fine, because graphql isn't designed to send large chunks of data.
    // It should probably instead post a url where the file can be obtained.
    // But the @GraphQLIgnore annotation should allow byte arrays to be defined in the entities
    // without throwing an exception.

    // the @GraphQLIgnore annotation does work unless there's an object pointing to this one (Human has favourite droid)
    // Also works if it is placed on the class (but might not want to ignore the whole class)

    @GraphQLIgnore
    byte[] data;

}
