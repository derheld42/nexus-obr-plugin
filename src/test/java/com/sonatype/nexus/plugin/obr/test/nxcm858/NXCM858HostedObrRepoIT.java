/**
 * Copyright (c) 2008-2011 Sonatype, Inc.
 *
 * All rights reserved. Includes the third-party code listed at http://www.sonatype.com/products/nexus/attributions.
 * Sonatype and Sonatype Nexus are trademarks of Sonatype, Inc. Apache Maven is a trademark of the Apache Foundation.
 * M2Eclipse is a trademark of the Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package com.sonatype.nexus.plugin.obr.test.nxcm858;


import org.testng.annotations.Test;

import com.sonatype.nexus.plugin.obr.test.AbstractObrDownloadIT;


public class NXCM858HostedObrRepoIT
    extends AbstractObrDownloadIT
{

    @Test
    public void downloadFromHosted()
        throws Exception
    {
        downloadApacheFelixWebManagement( "obr-hosted" );
    }
}