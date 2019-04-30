import java.io.*;



public class linkedlist {
	private node head;

	linkedlist() {
		head = null;
	}

	public void insertatback(hotel h) {
		node n = new node(h);
		if (head == null) {
			head = n;
		} else {

			node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(n);

		}
	}

	public void removefirst(String c) {
		if (head == null) {
			return;
		} else {
			node curr = head;
			node prev = null;
			while (curr != null)
				if (curr.getData().getCity().equals(c)) {
					if (prev == null) {
						head = curr.getNext();
					} else
						prev.setNext(curr.getNext());
					return;

				} else {
					prev = curr;
					curr = curr.getNext();

				}

		}

	}

	public void savehotels(String name, String c) throws IOException {
		File f = new File(name);
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream ous = new ObjectOutputStream(fos);

		node curr = head;

		while (curr != null) {
			if (curr.getData().getCity().equals(c)) {
				ous.writeObject(curr.getData());
			}
		}
		ous.close();

	}

	public linkedlist read(String name, int n) throws IOException {
		File f = new File(name);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		linkedlist l = new linkedlist();

		hotel h;

		try {
			while (true) {
				h = (hotel) ois.readObject();
				if (h.totalaval() >= n) {
					l.insertatback(h);
				}
			}

		} catch (EOFException e) {
			ois.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return l;
	}
}
