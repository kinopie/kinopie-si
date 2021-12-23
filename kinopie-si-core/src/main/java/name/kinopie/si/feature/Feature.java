package name.kinopie.si.feature;

import java.util.function.UnaryOperator;

import name.kinopie.nio.file.DelegatingFileVisitor;
import name.kinopie.nio.file.FileTreeWalkContext;
import name.kinopie.nio.file.PostVisitContext;
import name.kinopie.nio.file.PreVisitContext;

public interface Feature<R extends PreVisitContext, O extends PostVisitContext, F extends FileTreeWalkContext<R, O>>
		extends UnaryOperator<DelegatingFileVisitor<R, O, F>> {
}
