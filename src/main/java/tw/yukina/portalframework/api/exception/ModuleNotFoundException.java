package tw.yukina.portalframework.api.exception;

public class ModuleNotFoundException extends Exception {
    public ModuleNotFoundException(String moduleId) {
        super("The module" + moduleId + " not found");
    }
}
