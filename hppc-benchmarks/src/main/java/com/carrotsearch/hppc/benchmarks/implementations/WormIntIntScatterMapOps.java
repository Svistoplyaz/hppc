package com.carrotsearch.hppc.benchmarks.implementations;

import com.carrotsearch.hppc.IntIntWormMap;
import com.carrotsearch.hppc.IntIntWormScatterMap;
import com.carrotsearch.hppc.benchmarks.IntIntMapOps;

public class WormIntIntScatterMapOps implements IntIntMapOps {
  private final IntIntWormMap delegate;

  public WormIntIntScatterMapOps(int expectedSize) {
    this.delegate = new IntIntWormScatterMap(expectedSize);
  }

  @Override
  public void put(int key, int value) {
    delegate.put(key, value);
  }

  @Override
  public int get(int key) {
    return delegate.get(key);
  }
}
