package com.example.ghasjavasb;

class Customer {
	public boolean equals(Object o) {
		if (o == null) return false;
		if (Customer.class != o.getClass()) return false;
		Customer other = (Customer)o;
		if (!name.equals(o.name)) return false;
		if (id != id) return false;  // CodeQL - should trigger "comparison of identical values"
		return true;
	}
}