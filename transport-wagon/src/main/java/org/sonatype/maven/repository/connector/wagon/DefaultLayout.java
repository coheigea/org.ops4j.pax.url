package org.sonatype.maven.repository.connector.wagon;

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
import org.sonatype.maven.repository.Metadata;

/**
 * @author Benjamin Bentmann
 */
class DefaultLayout
{

    public String getPath( Artifact artifact )
    {
        StringBuilder path = new StringBuilder( 128 );

        path.append( artifact.getGroupId().replace( '.', '/' ) ).append( '/' );

        path.append( artifact.getArtifactId() ).append( '/' );

        path.append( artifact.getBaseVersion() ).append( '/' );

        path.append( artifact.getArtifactId() ).append( '-' ).append( artifact.getVersion() );

        if ( artifact.getClassifier().length() > 0 )
        {
            path.append( '-' ).append( artifact.getClassifier() );
        }

        path.append( '.' ).append( artifact.getExtension() );

        return path.toString();
    }

    public String getPath( Metadata metadata )
    {
        StringBuilder path = new StringBuilder( 128 );

        if ( metadata.getGroupId().length() > 0 )
        {
            path.append( metadata.getGroupId().replace( '.', '/' ) ).append( '/' );

            if ( metadata.getArtifactId().length() > 0 )
            {
                path.append( metadata.getArtifactId() ).append( '/' );

                if ( metadata.getVersion().length() > 0 )
                {
                    path.append( metadata.getVersion() ).append( '/' );
                }
            }
        }

        path.append( metadata.getType() );

        return path.toString();
    }

}
