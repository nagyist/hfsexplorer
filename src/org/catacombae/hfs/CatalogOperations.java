/*-
 * Copyright (C) 2006-2009 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.hfs;

import org.catacombae.hfs.types.hfscommon.CommonBTHeaderRecord;
import org.catacombae.hfs.types.hfscommon.CommonHFSCatalogIndexNode;
import org.catacombae.hfs.types.hfscommon.CommonHFSCatalogKey;
import org.catacombae.hfs.types.hfscommon.CommonHFSCatalogLeafNode;
import org.catacombae.hfs.types.hfscommon.CommonHFSCatalogLeafRecord;
import org.catacombae.hfs.types.hfscommon.CommonHFSCatalogNodeID;
import org.catacombae.hfs.types.hfscommon.CommonHFSCatalogString;

/**
 *
 * @author erik
 */
public interface CatalogOperations {
    public CommonHFSCatalogIndexNode newCatalogIndexNode(byte[] data,
            int offset, int nodeSize, CommonBTHeaderRecord bthr);

    public CommonHFSCatalogKey newCatalogKey(CommonHFSCatalogNodeID nodeID,
            CommonHFSCatalogString searchString, CommonBTHeaderRecord bthr);

    public CommonHFSCatalogLeafNode newCatalogLeafNode(byte[] data,
            int offset, int nodeSize, CommonBTHeaderRecord bthr);

    public CommonHFSCatalogLeafRecord newCatalogLeafRecord(byte[] data,
            int offset, CommonBTHeaderRecord bthr);

}
