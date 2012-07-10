/*
 * Copyright 2012 Cristian Vrabie, Evelina Vrabie
 *
 * This file is part of android-deferred-object.
 *
 * android-deferred-object is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * android-deferred-object is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.codeandmagic.deferredobject.merge;

import org.codeandmagic.deferredobject.AbstractPromise;
import org.codeandmagic.deferredobject.MergedPromiseTracker;
import org.codeandmagic.deferredobject.Promise;

/** User: cvrabie1 Date: 10/07/2012 */
public class MergedPromiseN extends AbstractPromise<Object[], MergedPromiseReject, MergedPromiseProgress> implements MergedPromise{
  private final MergedPromiseTracker<Object[]> mergedPromiseTracker;

  public MergedPromiseN( final Promise<?, ?, ?>[] promises){
    mergedPromiseTracker = new MergedPromiseTracker<Object[]>(this, promises);
  }
}
