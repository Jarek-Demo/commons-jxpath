/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//jxpath/src/java/org/apache/commons/jxpath/xml/XMLParser2.java,v 1.2 2004/01/19 22:17:02 dmitri Exp $
 * $Revision: 1.2 $
 * $Date: 2004/01/19 22:17:02 $
 *
 * ====================================================================
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999-2003 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowledgement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgement may appear in the software itself,
 *    if and wherever such third-party acknowledgements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 2001, Plotnix, Inc,
 * <http://www.plotnix.com/>.
 * For more information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.commons.jxpath.xml;

import java.io.InputStream;

/**
 * The abstract superclass of XML parsers that produce DOM Documents.
 * The features have the same defaults as DocumentBuilderFactory.
 *
 * @author Dmitri Plotnikov
 * @version $Revision: 1.2 $ $Date: 2004/01/19 22:17:02 $
 */
public abstract class XMLParser2 implements XMLParser 
{
    private boolean validating = false;
    private boolean namespaceAware = true;
    private boolean whitespace = false;
    private boolean expandEntityRef = true;
    private boolean ignoreComments = false;
    private boolean coalescing = false;
    
    /**
     * @see DocumentBuilderFactory#setValidating(boolean)
     */
    public void setValidating(boolean validating) {
        this.validating = validating;
    }
    
    /**
     * @see DocumentBuilderFactory#isValidating()
     */
    public boolean isValidating() {
        return validating;
    }
    
    /**
     * @see DocumentBuilderFactory#isNamespaceAware()
     */
    public boolean isNamespaceAware() {
        return namespaceAware;
    }
    
    /**
     * @see DocumentBuilderFactory#setNamespaceAware(boolean)
     */
    public void setNamespaceAware(boolean namespaceAware) {
        this.namespaceAware = namespaceAware;
    }
    
    /**
     * @see DocumentBuilderFactory#setIgnoringElementContentWhitespace(boolean)
     */
    public void setIgnoringElementContentWhitespace(boolean whitespace) {
        this.whitespace = whitespace;
    }
    
    /**
     * @see DocumentBuilderFactory#isIgnoringElementContentWhitespace()
     */
    public boolean isIgnoringElementContentWhitespace() {
        return whitespace;
    }
    
    /**
     * @see DocumentBuilderFactory#isExpandEntityReferences()
     */
    public boolean isExpandEntityReferences() {
        return expandEntityRef;
    }
    
    /**
     * @see DocumentBuilderFactory#setExpandEntityReferences(boolean)
     */
    public void setExpandEntityReferences(boolean expandEntityRef) {
        this.expandEntityRef = expandEntityRef;
    }
    
    /**
     * @see DocumentBuilderFactory#isIgnoringComments()
     */
    public boolean isIgnoringComments() {
        return ignoreComments;
    }
    
    /**
     * @see DocumentBuilderFactory#setIgnoringComments(boolean)
     */
    public void setIgnoringComments(boolean ignoreComments) {
        this.ignoreComments = ignoreComments;
    }
    
    /**
     * @see DocumentBuilderFactory#isCoalescing()
     */
    public boolean isCoalescing() {
        return coalescing;
    }
    
    /**
     * @see DocumentBuilderFactory#setCoalescing(boolean)
     */
    public void setCoalescing(boolean coalescing) {
        this.coalescing = coalescing;
    }
    
    public abstract Object parseXML(InputStream stream);
}