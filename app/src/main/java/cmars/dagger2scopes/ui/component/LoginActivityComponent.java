package cmars.dagger2scopes.ui.component;

import cmars.dagger2scopes.ui.activity.ActivityScope;
import cmars.dagger2scopes.ui.activity.LoginActivity;
import cmars.dagger2scopes.ui.module.LoginActivityModule;
import dagger.Subcomponent;

/**
 * Created by Constantine Mars on 23/02/16.
 */
@ActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {
    void inject(LoginActivity loginActivity);
}
