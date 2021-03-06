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
package org.cdlflex.ui.behavior;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.cdlflex.ui.markup.css.Buttons.Size;
import org.cdlflex.ui.markup.css.Buttons.Type;
import org.cdlflex.ui.model.ButtonCssClassNameModel;

/**
 * A behavior that controls the size and type of a bootstrap button. This can be added to arbitrary components and will
 * add css classes.
 */
public class ButtonBehavior extends CssClassNameAppender {

    private static final long serialVersionUID = 1L;

    public static final Type DEFAULT_TYPE = Type.DEFAULT;
    public static final Size DEFAULT_SIZE = Size.MEDIUM;

    private final ButtonCssClassNameModel replaceModel;

    public ButtonBehavior() {
        this(DEFAULT_TYPE, DEFAULT_SIZE);
    }

    public ButtonBehavior(Type type) {
        this(Model.of(type), Model.of(DEFAULT_SIZE));
    }

    public ButtonBehavior(Size size) {
        this(Model.of(DEFAULT_TYPE), Model.of(size));
    }

    public ButtonBehavior(Type type, Size size) {
        this(Model.of(type), Model.of(size));
    }

    public ButtonBehavior(IModel<Type> buttonType, IModel<Size> buttonSize) {
        this(new ButtonCssClassNameModel(buttonType, buttonSize));
    }

    public ButtonBehavior(ButtonCssClassNameModel buttonCssClassNameModel) {
        super(buttonCssClassNameModel);
        this.replaceModel = buttonCssClassNameModel;
    }

    public Type getType() {
        return getButtonType().getObject();
    }

    /**
     * Set the button type (sets the object of the type model).
     *
     * @param type the type to set
     */
    public void setType(Type type) {
        getButtonType().setObject(type);
    }

    public Size getSize() {
        return getButtonSize().getObject();
    }

    /**
     * Set the button size (sets the object of the size model).
     *
     * @param size the size to set
     */
    public void setSize(Size size) {
        getButtonSize().setObject(size);
    }

    public IModel<Type> getButtonType() {
        return replaceModel.getButtonType();
    }

    public void setButtonType(IModel<Type> buttonType) {
        replaceModel.setButtonType(buttonType);
    }

    public IModel<Size> getButtonSize() {
        return replaceModel.getButtonSize();
    }

    public void setButtonSize(IModel<Size> buttonSize) {
        replaceModel.setButtonSize(buttonSize);
    }

}
