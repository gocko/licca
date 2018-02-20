package pubSub;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker for method which should be called for a <code>Subscriber</code> once a
 * message of a specific type has been published. Methods annotated with this
 * annotation should have one input parameter representing the message to be
 * received, otherwise invocation would be skipped.
 * 
 * @author Tijana Vislavski
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnMessageReceived {

}
