package br.com.inmetrics.edp.util.queue;

import java.sql.ResultSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class Queues {

	private LinkedBlockingQueue<ResultSet> resultSets;
	private LinkedBlockingQueue<ConcurrentHashMap<String, String>> outputQueue;

	public Queues() {
		this.resultSets = new LinkedBlockingQueue<ResultSet>();
		this.outputQueue = new LinkedBlockingQueue<ConcurrentHashMap<String, String>>();
	}

	public LinkedBlockingQueue<ResultSet> getResultSets() {
		return resultSets;
	}

	public void setResultSets(LinkedBlockingQueue<ResultSet> resultSets) {
		this.resultSets = resultSets;
	}

	public LinkedBlockingQueue<ConcurrentHashMap<String, String>> getOutputQueue() {
		return outputQueue;
	}

	public void setOutputQueue(LinkedBlockingQueue<ConcurrentHashMap<String, String>> outputQueue) {
		this.outputQueue = outputQueue;
	}
}
