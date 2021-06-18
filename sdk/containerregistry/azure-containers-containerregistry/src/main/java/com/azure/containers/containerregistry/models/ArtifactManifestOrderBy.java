// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ArtifactManifestOrderBy. */
public final class ArtifactManifestOrderBy extends ExpandableStringEnum<ArtifactManifestOrderBy> {
    /** Static value none for ArtifactManifestOrderBy. */
    public static final ArtifactManifestOrderBy NONE = fromString("none");

    /** Static value timedesc for ArtifactManifestOrderBy. */
    public static final ArtifactManifestOrderBy LAST_UPDATED_ON_DESCENDING = fromString("timedesc");

    /** Static value timeasc for ArtifactManifestOrderBy. */
    public static final ArtifactManifestOrderBy LAST_UPDATED_ON_ASCENDING = fromString("timeasc");

    /**
     * Creates or finds a ArtifactManifestOrderBy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArtifactManifestOrderBy.
     */
    @JsonCreator
    public static ArtifactManifestOrderBy fromString(String name) {
        return fromString(name, ArtifactManifestOrderBy.class);
    }

    /** @return known ArtifactManifestOrderBy values. */
    public static Collection<ArtifactManifestOrderBy> values() {
        return values(ArtifactManifestOrderBy.class);
    }
}
