/**
 * Copyright (C) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.service.marketdata.streaming.socketio;

import com.xeiam.xchange.service.marketdata.streaming.RunnableMarketDataEventProducer;
import com.xeiam.xchange.service.marketdata.streaming.RunnableMarketDataListener;
import com.xeiam.xchange.service.marketdata.streaming.StreamingMarketDataService;

/**
 * <p>
 * Socket IO market data service to provide the following to streaming market data API:
 * </p>
 * <ul>
 * <li>Connection to an upstream market data source with a configured provider</li>
 * </ul>
 */
public class BaseSocketIOMarketDataService implements StreamingMarketDataService {

  @Override
  public void start(RunnableMarketDataListener runnableMarketDataListener) {
    // TODO Auto-generated method stub

  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub

  }

  @Override
  public RunnableMarketDataEventProducer getRunnableMarketDataEventProducer() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setRunnableMarketDataEventProducer(RunnableMarketDataEventProducer runnableMarketDataEventProducer) {
    // TODO Auto-generated method stub

  }

}
