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

/**
 * Manual Severity
 * 
 * @author gcampb2
 */
@UserRole(UserRole.USER)
@Description("Shows reviews with a manual severity")
@WidgetCategory({ "Reviews" })
public class ManualSeverityWidget extends AbstractRubyTemplate implements RubyRailsWidget {

  /**
   * Get Widget Id
   */
  public final String getId() {
    return "manual_severity_reviews";
  }

  /**
   * Get widget title
   */
  public final String getTitle() {
    return "Manual Severity Reviews";
  }

  /**
   * Get widget template path
   */
  @Override
  protected final String getTemplatePath() {
    return "/manual_severity_reviews_widget.html.erb";
  }
}