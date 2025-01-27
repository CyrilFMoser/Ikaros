package Program_31 

package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: Char, b: CC_A, c: Byte) extends T_A
case class CC_D(a: CC_A, b: Boolean) extends T_B[T_A]
case class CC_E[B](a: B, b: B, c: Byte) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_D(CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_E T_A Wildcard Wildcard Wildcard (T_B T_A))
// This is not matched: (CC_E T_A Wildcard Wildcard Wildcard (T_B T_A))