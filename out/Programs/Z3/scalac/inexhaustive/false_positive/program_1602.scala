package Program_30 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: ((Byte,Int),Boolean)) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C[B](a: T_B[B]) extends T_B[B]
case class CC_D[C, D](a: Byte, b: T_B[CC_B], c: T_B[D]) extends T_B[C]
case class CC_E(a: CC_D[CC_A, T_A], b: CC_C[(Byte,Char)]) extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_C(CC_D(_, _, _)) => 1 
  case CC_C(CC_C(_)) => 2 
  case CC_E(CC_D(_, _, _), CC_C(_)) => 3 
  case CC_E(_, _) => 4 
  case CC_D(_, CC_D(_, _, _), CC_C(_)) => 5 
  case CC_D(_, _, _) => 6 
  case CC_D(_, CC_D(_, _, _), CC_D(_, _, _)) => 7 
  case CC_D(0, _, CC_E(_, _)) => 8 
  case CC_D(_, _, CC_C(_)) => 9 
}
}
// This is not matched: (CC_D (T_B T_A) T_A Wildcard Wildcard Wildcard (T_B (T_B T_A)))
// This is not matched: (CC_A Wildcard T_A)