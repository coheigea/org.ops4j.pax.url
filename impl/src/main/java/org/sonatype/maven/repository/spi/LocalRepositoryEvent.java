package org.sonatype.maven.repository.spi;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.sonatype.maven.repository.Artifact;
import org.sonatype.maven.repository.LocalRepository;
import org.sonatype.maven.repository.RepositorySystemSession;

/**
 * An event describing an update to the local repository.
 * 
 * @author Benjamin Bentmann
 * @see LocalRepositoryMaintainer
 */
public interface LocalRepositoryEvent
{

    /**
     * Gets the repository session from which this event originates.
     * 
     * @return The repository session, never {@code null}.
     */
    RepositorySystemSession getSession();

    /**
     * Gets the local repository which has been updated.
     * 
     * @return The local repository, never {@code null}.
     */
    LocalRepository getRepository();

    /**
     * Gets the artifact that was updated.
     * 
     * @return The artifact, never {@code null}.
     */
    Artifact getArtifact();

}
