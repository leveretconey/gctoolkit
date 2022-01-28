// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import com.microsoft.gctoolkit.vertx.jvm.PreUnifiedJavaVirtualMachine;
import com.microsoft.gctoolkit.vertx.jvm.UnifiedJavaVirtualMachine;

/**
 * Contains a vertx based implementation of GCToolKit. The vertx implementation is an internal module.
 * @provides com.microsoft.gctoolkit.jvm.JavaVirtualMachine
 */
module com.microsoft.gctoolkit.vertx {
    requires com.microsoft.gctoolkit.api;
    requires com.microsoft.gctoolkit.parser;
    requires io.vertx.core;
    requires java.logging;

    exports com.microsoft.gctoolkit.vertx.jvm to
            com.microsoft.gctoolkit.api;

    provides com.microsoft.gctoolkit.jvm.JavaVirtualMachine with
            PreUnifiedJavaVirtualMachine,
            UnifiedJavaVirtualMachine;

}