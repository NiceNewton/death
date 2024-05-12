class Newthread extends Thread {
	Sync sync = new Sync();
	Newthread(String s){
		super(s);
	}

	public void run(){
		try{
			System.out.println("LOLOLOLOL");
			sync.met("1[");
			sync.met2("1{");
			sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("YAAAAAAAAAAA");
	}
}


class Newthread2 implements Runnable {
	Thread t;

	Newthread2(String s){
		t = new Thread(this, s);
	}

	public void run(){
			try{
				System.out.println("LOLOLOLOL");
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("YAAAAAAAAAAA");
	}

}


class Sync {
	synchronized void met(String msg) {
		try{
			System.out.println(msg);
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
					System.out.println(e);
		}
	}

	void met2(String msg) {
		try{
			System.out.println(msg);
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class thread {
	public static void main(String[] args){
		Newthread th = new Newthread("t1");
		Newthread2 th2 = new Newthread2("t2");
		Sync sync = new Sync();
		try {
			th.start();
			sync.met("{");
			Thread.sleep(1000);

			//th.join();
			th2.t.start();
		}
		catch (InterruptedException e) {
						System.out.println(e);
		}
	}
}