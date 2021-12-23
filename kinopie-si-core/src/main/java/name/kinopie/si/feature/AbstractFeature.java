package name.kinopie.si.feature;

import name.kinopie.nio.file.FileTreeWalkContext;
import name.kinopie.nio.file.PostVisitContext;
import name.kinopie.nio.file.PreVisitContext;

public abstract class AbstractFeature<R extends PreVisitContext, O extends PostVisitContext, F extends FileTreeWalkContext<R, O>>
		implements Feature<R, O, F> {	
}
