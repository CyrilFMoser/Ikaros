package Program_15 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_A]) extends T_A
case class CC_B[B](a: Byte, b: CC_A, c: T_B[B]) extends T_B[B]
case class CC_C[C](a: T_A, b: CC_B[C]) extends T_B[T_A]
case class CC_D(a: Boolean, b: CC_C[T_A], c: CC_C[T_A]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, CC_C(_, _)) => 0 
  case CC_A(0, _) => 1 
  case CC_A(0, CC_B(_, _, _)) => 2 
  case CC_A(_, CC_C(_, _)) => 3 
  case CC_A(_, CC_B(_, _, _)) => 4 
  case CC_A(_, CC_D(_, _, _)) => 5 
}
}
// This is not matched: (CC_A Wildcard (CC_C T_A Wildcard Wildcard (T_B T_A)) T_A)
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)