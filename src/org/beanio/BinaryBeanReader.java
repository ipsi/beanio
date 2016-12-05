package org.beanio;

import org.beanio.internal.util.Debuggable;

import java.io.Closeable;

public interface BinaryBeanReader extends Debuggable, Closeable {

    Object read() throws BeanReaderIOException, MalformedRecordException,
            UnidentifiedRecordException, UnexpectedRecordException, InvalidRecordException;


    int skip(int count) throws BeanReaderIOException, MalformedRecordException,
            UnidentifiedRecordException, UnexpectedRecordException;

    String getRecordName();

    int getLineNumber();

    int getRecordCount();

    RecordContext getRecordContext(int index) throws IndexOutOfBoundsException;

    @Override
    void close() throws BeanReaderIOException;

    void setErrorHandler(BeanReaderErrorHandler errorHandler);
}
