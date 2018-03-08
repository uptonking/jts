
/*
 * Copyright (c) 2016 Vivid Solutions.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LinearRing;

/**
 * Tests whether a {@link Coordinate} lies inside
 * a ring, using a linear-time algorithm.
 *
 * @version 1.7
 */
public class SimplePointInRing
  implements PointInRing
{

  private Coordinate[] pts;

  public SimplePointInRing(LinearRing ring)
  {
    pts = ring.getCoordinates();
  }

  public boolean isInside(Coordinate pt)
  {
    return CGAlgorithms.isPointInRing(pt, pts);
  }
}
