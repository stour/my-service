/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package tutorial;

import org.eclipse.che.inject.DynaModule;

import com.google.inject.AbstractModule;

/**
 * Extend AbstractModule, override its configure method and create new bindings.
 * @DynaModule annotation is necessary for auto-deploy of components to a Guice container
 */

@DynaModule
public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyService.class); // required, otherwise everrest framework won't recognize it
    }
}
