package Program_31 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Boolean,Boolean), (Char,Boolean)], b: T_A) extends T_A
case class CC_B[C](a: CC_A) extends T_A
case class CC_C[D](a: CC_A, b: CC_B[D]) extends T_B[D, T_B[T_A, T_A]]
case class CC_D[E, F](a: CC_B[E], b: T_B[E, E]) extends T_B[F, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_D(_, _), _) => 1 
  case CC_A(CC_D(_, _), CC_A(_, _)) => 2 
  case CC_A(_, CC_B(_)) => 3 
  case CC_A(CC_D(_, _), CC_B(_)) => 4 
  case CC_A(_, CC_A(_, _)) => 5 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A) Wildcard T_A)
// This is not matched: (CC_B Wildcard Wildcard T_A)