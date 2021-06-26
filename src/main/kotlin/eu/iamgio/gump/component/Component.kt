package eu.iamgio.gump.component

import eu.iamgio.gump.app.Canvas
import eu.iamgio.gump.app.GumpApplication

/**
 * Represents an element in the scene of a [GumpApplication].
 *
 * @author Giorgio Garofalo
 */
abstract class Component {

    /**
     * Draws the content to the canvas.
     * By default it draws the [Component] built in [build],
     * but it can be overridden to call raw Processing functions.
     */
    open fun draw(canvas: Canvas) {
        build(canvas).draw(canvas)
    }

    /**
     * Builds the child component.
     */
    abstract fun build(canvas: Canvas): Component
}