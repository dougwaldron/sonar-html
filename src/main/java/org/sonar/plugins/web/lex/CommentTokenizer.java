/*
 * Sonar Web Plugin
 * Copyright (C) 2010 Matthijs Galesloot and SonarSource
 * dev@sonar.codehaus.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sonar.plugins.web.lex;

import org.sonar.plugins.web.node.CommentNode;
import org.sonar.plugins.web.node.Node;

import java.util.List;

/**
 * Tokenizer for a HTML or JSP comment.
 *
 * @author Matthijs Galesloot
 * @since 1.0
 */
class CommentTokenizer extends AbstractTokenizer<List<Node>> {

  private final Boolean html;

  public CommentTokenizer(String startToken, String endToken, Boolean html) {
    super(startToken, endToken);

    this.html = html;
  }

  @Override
  Node createNode() {

    CommentNode node = new CommentNode();
    node.setHtml(html);
    return node;
  }
}
