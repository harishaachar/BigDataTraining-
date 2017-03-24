package org.apache.hadoop.mapred.gridmix;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;

class RandomTextDataGenerator {
  static final Log LOG = LogFactory.getLog(RandomTextDataGenerator.class);
  static final String GRIDMIX_DATAGEN_RANDOMTEXT_LISTSIZE = 
  static final String GRIDMIX_DATAGEN_RANDOMTEXT_WORDSIZE = 
  static final int DEFAULT_LIST_SIZE = 200;
  static final int DEFAULT_WORD_SIZE = 10;
  static final long DEFAULT_SEED = 0L;

  private String[] words;
  private Random random;

  RandomTextDataGenerator(int size, int wordSize) {
    this(size, DEFAULT_SEED , wordSize);
  }

  RandomTextDataGenerator(int size, Long seed, int wordSize) {
    random = new Random(seed);
    words = new String[size];
    for (int i = 0; i < size; ++i) {
      words[i] = 
        RandomStringUtils.random(wordSize, 0, 0, true, false, null, random);
    }
  }
  
   static int getRandomTextDataGeneratorListSize(Configuration conf) {
    return conf.getInt(GRIDMIX_DATAGEN_RANDOMTEXT_LISTSIZE, DEFAULT_LIST_SIZE);
  }
  static void setRandomTextDataGeneratorListSize(Configuration conf, 
                                                 int listSize) {
    if (LOG.isDebugEnabled()) {
      LOG.debug("Random text data generator is configured to use a dictionary " 
                + " with " + listSize + " words");
    }
    conf.setInt(GRIDMIX_DATAGEN_RANDOMTEXT_LISTSIZE, listSize);
  }

  static int getRandomTextDataGeneratorWordSize(Configuration conf) {
    return conf.getInt(GRIDMIX_DATAGEN_RANDOMTEXT_WORDSIZE, DEFAULT_WORD_SIZE);
  }

  static void setRandomTextDataGeneratorWordSize(Configuration conf, 
                                                 int wordSize) {
    if (LOG.isDebugEnabled()) {
      LOG.debug("Random text data generator is configured to use a dictionary " 
                + " with words of length " + wordSize);
    }
    conf.setInt(GRIDMIX_DATAGEN_RANDOMTEXT_WORDSIZE, wordSize);
  }

  String getRandomWord() {
    int index = random.nextInt(words.length);
    return words[index];
  }
  
  List<String> getRandomWords() {
    return Arrays.asList(words);
  }
}