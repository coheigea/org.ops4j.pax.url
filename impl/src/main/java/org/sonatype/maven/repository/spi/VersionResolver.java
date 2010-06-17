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

import org.sonatype.maven.repository.RepositorySystemSession;
import org.sonatype.maven.repository.VersionRequest;
import org.sonatype.maven.repository.VersionResolutionException;
import org.sonatype.maven.repository.VersionResult;

/**
 * @author Benjamin Bentmann
 */
public interface VersionResolver
{

    /**
     * Resolves a metaversion to a concrete version. For example, resolves "1.0-SNAPSHOT" to "1.0-20090208.132618-23" or
     * "RELEASE"/"LATEST" to "2.0".
     */
    VersionResult resolveVersion( RepositorySystemSession session, VersionRequest request )
        throws VersionResolutionException;

}
