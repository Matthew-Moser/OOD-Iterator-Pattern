package pt1;

public class LicenseRepository implements Container{
	public String licenses[] = {"L188517", "KD11276", "WSQ4587","UT45D23"};
	@Override
	public Iterator findIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	private class NameIterator implements Iterator {
		int index;
		@Override
		public boolean nextItem() {
			if (index <licenses.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object item() {
			if(this.nextItem()) {
			return licenses[index++];
			}
			return null;
		}
		
	}

}
