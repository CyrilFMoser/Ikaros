package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Boolean, b: B) extends T_A
case class CC_B(a: T_A, b: T_B[T_A]) extends T_A
case class CC_C(a: T_B[Int], b: CC_B, c: CC_A[Char]) extends T_A
case class CC_D[C](a: C, b: Char, c: Boolean) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_D(_, _, _), _, _) => 1 
  case CC_C(_, _, CC_A(_, _)) => 2 
  case CC_C(CC_D(_, _, _), CC_B(_, _), CC_A(_, _)) => 3 
  case CC_C(_, CC_B(_, _), CC_A(_, _)) => 4 
  case CC_C(_, _, _) => 5 
  case CC_B(_, CC_D(_, _, _)) => 6 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard (Tuple Wildcard Wildcard) Wildcard T_A)