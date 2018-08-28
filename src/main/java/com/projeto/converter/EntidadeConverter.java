package com.projeto.converter;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.projeto.model.Entidade;

@FacesConverter(forClass = Entidade.class)
public class EntidadeConverter implements Converter {

	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		if (value == null || value.isEmpty())
			return null;

		return this.getAttributesFrom(component).get(value);
	}

	public String getAsString(FacesContext ctx, UIComponent component, Object value) {
		if (value == null || "".equals(value))
			return "";

		Entidade entity = (Entidade) value;

		this.addAttribute(component, entity);

		Long codigo = entity.getId();

		if (codigo != null)
			return String.valueOf(codigo);

		return (String) value;
	}

	protected void addAttribute(UIComponent component, Entidade entidade) {
		String key = entidade.getId().toString();
		this.getAttributesFrom(component).put(key, entidade);
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}
}
