package it.unibo.oop.lab.nesting2;

import java.util.List;

/**
 * Implementation of Acceptable
 *
 * @param <T>
 */
public class OneListAcceptable<T> implements Acceptable<T> {
	/**
	 * Field holding the list which elements are going to be compared
	 */
	private final List<T> list;
	/**
     * Builds a new Object of class OneListAcceptable
     * 
     * @param list
     *            list to be compared
     */
	public OneListAcceptable(List<T> list) {
		super();
		this.list = list;
	}
	/**
	 * {@inheritDoc}
	 * 
	 * @return
	 * 		a new anonymous class Acceptor
	 */
	public Acceptor<T> acceptor() {
		return new Acceptor<T>(){
			/**
			 * Field used to keep track of how many elements we analyzed yet
			 */
			private int position = 0;
			/**
			 * {@inheritDoc}
			 */
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(this.position < (list.size()) && list.get(this.position).equals(newElement)) {
					this.position++;
				}
				else {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			/**
			 * {@inheritDoc}
			 */
			public void end() throws EndNotAcceptedException {
				if(this.position<list.size()-1) {
					throw new EndNotAcceptedException();
				}
				
			}
			
		};
	}

}
