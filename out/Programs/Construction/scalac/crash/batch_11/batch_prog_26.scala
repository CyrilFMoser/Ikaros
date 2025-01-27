package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[(Char,Boolean)]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}