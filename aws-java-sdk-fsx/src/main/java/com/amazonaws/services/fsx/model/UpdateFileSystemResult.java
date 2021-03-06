/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response object for the <code>UpdateFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the file system.
     * </p>
     */
    private FileSystem fileSystem;

    /**
     * <p>
     * A description of the file system.
     * </p>
     * 
     * @param fileSystem
     *        A description of the file system.
     */

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * <p>
     * A description of the file system.
     * </p>
     * 
     * @return A description of the file system.
     */

    public FileSystem getFileSystem() {
        return this.fileSystem;
    }

    /**
     * <p>
     * A description of the file system.
     * </p>
     * 
     * @param fileSystem
     *        A description of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withFileSystem(FileSystem fileSystem) {
        setFileSystem(fileSystem);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFileSystem() != null)
            sb.append("FileSystem: ").append(getFileSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemResult == false)
            return false;
        UpdateFileSystemResult other = (UpdateFileSystemResult) obj;
        if (other.getFileSystem() == null ^ this.getFileSystem() == null)
            return false;
        if (other.getFileSystem() != null && other.getFileSystem().equals(this.getFileSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystem() == null) ? 0 : getFileSystem().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemResult clone() {
        try {
            return (UpdateFileSystemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
