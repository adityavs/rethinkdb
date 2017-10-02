// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class Config extends ReqlExpr {


    public Config(Object arg) {
        this(new Arguments(arg), null);
    }
    public Config(Arguments args){
        this(args, null);
    }
    public Config(Arguments args, OptArgs optargs) {
        super(TermType.CONFIG, args, optargs);
    }

}
