package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OneListAcceptable(List<T> list) {
		super();
		this.list = list;
	}

	public Acceptor<T> acceptor() {
		return new Acceptor<T>(){
			private int position = 0;
			
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(this.position < (list.size()) && list.get(this.position).equals(newElement)) {
					this.position++;
				}
				else {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			
			public void end() throws EndNotAcceptedException {
				if(this.position<list.size()-1) {
					throw new EndNotAcceptedException();
				}
				
			}
			
		};
	}

}
