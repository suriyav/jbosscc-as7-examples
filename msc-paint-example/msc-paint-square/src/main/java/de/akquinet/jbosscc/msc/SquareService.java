package de.akquinet.jbosscc.msc;

import org.jboss.msc.service.Service;
import org.jboss.msc.service.ServiceName;
import org.jboss.msc.service.StartContext;
import org.jboss.msc.service.StartException;
import org.jboss.msc.service.StopContext;

public class SquareService implements Service<SimpleShape> {

	public static final ServiceName SERVICE_NAME = ServiceName
			.of("SQUARE_SHAPE");

	private Square square;

	@Override
	public SimpleShape getValue() throws IllegalStateException,
			IllegalArgumentException {
		return square;
	}

	@Override
	public void start(StartContext context) throws StartException {
		System.out.println("start service " + SERVICE_NAME);
		square = new Square();
	}

	@Override
	public void stop(StopContext context) {
		System.out.println("stop service " + SERVICE_NAME);
		square = null;
	}

}
