package com.chainsys.pricing;

public interface FileReadWriteOperations {

	public void write(String userName, String password);
	public boolean read(String userName, String password);
}
