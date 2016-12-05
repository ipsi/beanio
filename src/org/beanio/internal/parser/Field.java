package org.beanio.internal.parser;

import org.beanio.internal.util.Settings;

public abstract class Field extends ParserComponent implements Property {
    protected static final boolean ERROR_IF_NULL_PRIMITIVE =
        Settings.getInstance().getBoolean(Settings.ERROR_IF_NULL_PRIMITIVE);
    protected static final boolean USE_DEFAULT_IF_MISSING =
        Settings.getInstance().getBoolean(Settings.USE_DEFAULT_IF_MISSING);
    protected static final boolean VALIDATE_ON_MARSHAL =
            Settings.getInstance().getBoolean(Settings.VALIDATE_ON_MARSHAL);
    protected static final boolean marshalDefault =
        Settings.getInstance().getBoolean(Settings.DEFAULT_MARSHALLING_ENABLED);
    protected FieldFormat format;

    public Field() {
        super();
    }

    public Field(int size) {
        super(size);
    }

    /*
         * (non-Javadoc)
         * @see org.beanio.parser2.Property#type()
         */
    public int type() {
        return Property.SIMPLE;
    }

    /*
         * (non-Javadoc)
         * @see org.beanio.internal.parser.Parser#isOptional()
         */
    public boolean isOptional() {
        return format.isLazy();
    }
}
