package org.primefaces.component.selectonemenu;

import org.primefaces.util.WidgetBuilder;

import javax.faces.context.FacesContext;
import java.io.IOException;

public class CustomSelectOneMenuRenderer extends SelectOneMenuRenderer {
    @Override
    protected void encodeScript(FacesContext context, SelectOneMenu menu) throws IOException {
        String clientId = menu.getClientId(context);
        WidgetBuilder wb = this.getWidgetBuilder(context);
        wb.initWithDomReady("SelectOneMenu", menu.resolveWidgetVar(), clientId)
                .attr("effect", menu.getEffect(), (String)null)
                .attr("effectSpeed", menu.getEffectSpeed(), (String)null)
                .attr("editable", menu.isEditable(), false)
                .callback("onchange", "function()", menu.getOnchange());
        if (menu.isFilter()) {
            wb.attr("filter", true)
                    .attr("filterMatchMode", menu.getFilterMatchMode(), (String)null)
                    .attr("caseSensitive", menu.isCaseSensitive(), false)
                    .callback("filterFunction", "function(itemLabel, filterValue)", "return " + menu.getFilterFunction() + "(itemLabel, filterValue);");
        }

        this.encodeClientBehaviors(context, menu);
        wb.finish();
    }
}
