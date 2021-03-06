package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.Scope;


public class IdentifierNode extends NodeEvent implements DCNode {

  private String identifier;
  private Scope scope;

  public IdentifierNode(String id, Scope s) {
    identifier = id;
    scope = s;
  }

  @Override
  public VarType evaluate() {
    VarType value = scope.resolve(identifier);
    if(value == null) {
     RuntimeException exception = new RuntimeException("no such variable: " + this);
     String message = exception.getMessage();
     System.out.println("message="+message);
     throw exception;
    }
    return value;
  }

  @Override
  public String toString() {
    return identifier;
  }
}

