BeanIO
======

A Java library for marshalling and unmarshalling bean objects from XML, CSV, delimited and fixed length stream formats.

For more information, including an online reference guide, please visit http://www.beanio.org.

#### Note
This repository houses the source code for the future BeanIO 3.x.  For older versions, please see https://code.google.com/p/beanio/.
 
Currently working on: Support for non-Text streams, so that things like, e.g.,
[binary-coded decimals](https://en.wikipedia.org/wiki/Binary-coded_decimal) can be supported, even if most of the
fields are [EBCDIC](https://en.wikipedia.org/wiki/EBCDIC) or something. This is an enormous refactoring, and may require
re-writing a lot from scratch.