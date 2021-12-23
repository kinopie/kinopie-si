package name.kinopie.si.feature.common;

import java.nio.file.FileVisitResult;

import name.kinopie.nio.file.DelegatingFileVisitor;
import name.kinopie.nio.file.FileTreeWalkContext;
import name.kinopie.nio.file.FileVisitContext;
import name.kinopie.nio.file.PostVisitContext;
import name.kinopie.nio.file.PreVisitContext;
import name.kinopie.si.feature.AbstractFeature;

public class GitFeature<R extends PreVisitContext, O extends PostVisitContext, F extends FileTreeWalkContext<R, O>>
		extends AbstractFeature<R, O, F> {

	@Override
	public DelegatingFileVisitor<R, O, F> apply(DelegatingFileVisitor<R, O, F> visitor) {
		visitor.onPostVisitDirectory(FileVisitContext::isEmptyDir, context -> {
			context.createNewEmptyFile(".gitkeep");
			return FileVisitResult.CONTINUE;
		});
		return visitor;
	}
}
