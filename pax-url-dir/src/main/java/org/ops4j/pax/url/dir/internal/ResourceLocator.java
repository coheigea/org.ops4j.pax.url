package org.ops4j.pax.url.dir.internal;

import java.io.IOException;
import java.util.jar.JarOutputStream;

/**
 * @author Toni Menzel (tonit)
 * @since Dec 10, 2008
 */
public interface ResourceLocator
{

    // TODO add JavaDoc
    void write( JarOutputStream jos )
        throws IOException;
}