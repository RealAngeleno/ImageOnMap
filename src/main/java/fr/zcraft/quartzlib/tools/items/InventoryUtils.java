/*
 * Copyright or © or Copr. QuartzLib contributors (2015 - 2020)
 *
 * This software is governed by the CeCILL-B license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL-B
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-B license and that you accept its terms.
 */

package fr.zcraft.quartzlib.tools.items;

import java.util.Arrays;

import org.bukkit.inventory.Inventory;

/**
 * This class provides various utilities for inventory management.
 */
public abstract class InventoryUtils {
    private InventoryUtils() {
    }

    /**
     * Checks if these inventories are equal.
     *
     * @param inventory1 The first inventory.
     * @param inventory2 The other inventory.
     * @return {@code true} if the two inventories are the same one.
     */
    public static boolean sameInventories(Inventory inventory1, Inventory inventory2) {
        if (inventory1 == inventory2) {
            return true;
        } else if (inventory1 == null || inventory2 == null) {
            return false;
        }

        return inventory1.getType() == inventory2.getType()
                && Arrays.equals(inventory1.getContents(), inventory2.getContents());
    }
}
