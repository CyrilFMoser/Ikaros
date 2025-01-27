package Program_30 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: CC_A) extends T_B[C, T_A]
case class CC_C[D](a: CC_B[CC_A], b: (T_A,T_A), c: D) extends T_B[T_B[CC_A, T_A], T_A]
case class CC_D(a: CC_A, b: T_B[(Boolean,Boolean), T_A], c: T_A) extends T_B[T_B[CC_A, T_A], T_A]

val v_a: T_B[T_B[CC_A, T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), (CC_A(_),CC_A(_)), _) => 0 
  case CC_B(_) => 1 
  case CC_D(_, _, _) => 2 
  case CC_D(_, CC_B(_), CC_A(_)) => 3 
}
}
// This is not matched: (CC_C T_A
//      (CC_B (CC_A T_A T_A) Wildcard (T_B (CC_A T_A T_A) T_A))
//      Wildcard
//      Wildcard
//      (T_B (T_B (CC_A T_A T_A) T_A) T_A))
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard (T_B (T_B (CC_A T_A T_A) T_A) T_A))