/*
 * Widget Lab
 * Copyright (C) 2012 Shaw Industries
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.codehaus.sonar.plugins.widgetlab;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetCategory;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;
import org.sonar.api.web.WidgetPropertyType;

/**
 * Alternative rules compliance
 */
@UserRole(UserRole.USER)
@Description("Shows weighted issues, in addition to Rules Compliance Index.")
@WidgetCategory({ "Technical Debt" })
@WidgetProperties({
  @WidgetProperty(key = "showCompliance", description = "Show Rules Compliance", type = WidgetPropertyType.BOOLEAN, defaultValue = "true"),
  @WidgetProperty(key = "showTechDebt", description = "Show Technical Debt", type = WidgetPropertyType.BOOLEAN, defaultValue = "true") })
public class AltRulesComplianceWidget extends AbstractRubyTemplate implements RubyRailsWidget {

  /**
   * Get Widget Id
   */
  public final String getId() {
    return "rules-alt";
  }

  /**
   * Get widget title
   */
  public final String getTitle() {
    return "Alt Rules Compliance";
  }

  /**
   * Get widget template path
   */
  @Override
  protected final String getTemplatePath() {
    return "/alt_rules_compliance_widget.html.erb";
  }
}