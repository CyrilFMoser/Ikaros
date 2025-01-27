package Program_13 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: (T_A,T_A)) extends T_A
case class CC_B(a: T_B, b: Byte) extends T_B
case class CC_C(a: T_B, b: CC_A[CC_B], c: CC_A[T_A]) extends T_B
case class CC_D[B]() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), CC_A(_, _), _) => 0 
  case CC_C(CC_D(), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_C(CC_B(_, _), CC_A(_, _), _) => 2 
}
}
// This is not matched: (CC_C (CC_D T_A T_B) Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants