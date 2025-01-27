package Program_12 

package Program_4 

object Test {
sealed trait T_A
case class CC_A[A](a: (Byte,T_A), b: Char) extends T_A

val v_a: CC_A[T_A] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), _) => 0 
}
}
// This is not matched: (CC_A T_A (Tuple Byte (CC_A T_A Wildcard Char T_A)) Wildcard T_A)
// This is not matched: (CC_A T_A)