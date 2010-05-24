package org.apache.maven.repository;

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

/**
 * @author Benjamin Bentmann
 */
public interface LocalRepositoryManager
{

    LocalRepository getRepository();

    String getPathForLocalArtifact( Artifact artifact );

    String getPathForRemoteArtifact( Artifact artifact, RemoteRepository repository, String context );

    String getPathForLocalMetadata( Metadata metadata );

    String getPathForRemoteMetadata( Metadata metadata, RemoteRepository repository, String context );

    void find( LocalArtifactQuery query );

    void addLocalArtifact( Artifact artifact );

    void addRemoteArtifact( Artifact artifact, RemoteRepository repository, String context );

}