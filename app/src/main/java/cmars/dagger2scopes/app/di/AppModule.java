package cmars.dagger2scopes.app.di;

import android.app.Application;

import javax.inject.Singleton;

import cmars.dagger2scopes.entities.Car;
import cmars.dagger2scopes.entities.Engine;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Constantine Mars on 23/02/16.
 */
@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application application() {
        return application;
    }

    @Provides
    Car car(Engine engine) {
        return new Car("Ford", engine);
    }

}
