/*
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class MiniJavaUiModule extends AbstractMiniJavaUiModule {

	public MiniJavaUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// ������ʾģ��
	@Override
    public void configure(Binder binder) {
        super.configure(binder);
    	binder.bind(String.class).annotatedWith(com.google.inject.name.Names.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))).toInstance("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,:");
    }
}
