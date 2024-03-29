/*******************************************************************************
 * Copyright (c) 2009 Andrei Loskutov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributor:  Andrei Loskutov - initial API and implementation
 *******************************************************************************/

package de.loskutov.anyedit.util;

/**
 * @author Andrei
 */
public class LineReplaceResult {
    /** relative to line start unchanged results can have index > 0 */
    public int startReplaceIndex;
    /** unchanged results can have range > 0 */
    public int rangeToReplace;
    /** unchanged results can have not-null text to replace */
    public String textToReplace;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("startIndex: ").append(startReplaceIndex);  //$NON-NLS-1$
        sb.append(", range: ").append(rangeToReplace);  //$NON-NLS-1$
        sb.append(", text: ").append(textToReplace);  //$NON-NLS-1$
        return sb.toString();
    }
}
