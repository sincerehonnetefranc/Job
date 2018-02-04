package Io;

public class Take implements Runnable{
	private Cangku cangku;
	public Take(Cangku cangku){
		this.cangku=cangku;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(cangku){
				if(cangku.count>0){
					cangku.take();
					System.out.println(Thread.currentThread().getName()+"  "+cangku.count);
					cangku.notifyAll();
				}else{
					try {
						cangku.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
