package Program_31 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[T_B], b: Boolean) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[Byte]) extends T_A[T_A[T_B]]
case class CC_C(a: Byte, b: T_A[T_B], c: CC_B) extends T_B
case class CC_D(a: Char) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
  case CC_C(_, CC_A(_, _), _) => 2 
}
}
// This is not matched: (CC_C Wildcard (CC_A T_B Wildcard Wildcard (T_A T_B)) Wildcard T_B)
// This is not matched: Pattern match is empty without constants