/**
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.cdlflex.ui.markup.css;

import org.apache.wicket.util.io.IClusterable;
import org.apache.wicket.util.lang.Args;

/**
 * A simple ICssClassNameProvider that holds a css class name as a string property.
 */
public class CssClassNameProvider implements ICssClassNameProvider, IClusterable {

    private static final long serialVersionUID = 1L;

    private final String cssClassName;

    public CssClassNameProvider(String cssClassName) {
        this.cssClassName = Args.notEmpty(cssClassName, "cssClassName").toLowerCase();
    }

    @Override
    public String getCssClassName() {
        return cssClassName;
    }
}
