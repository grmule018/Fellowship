
package com.bridgelabz.designpatterns.behavioral.visitor;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);

}
