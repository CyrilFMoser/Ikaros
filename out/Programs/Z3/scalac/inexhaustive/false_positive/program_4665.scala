package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[T_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Byte))