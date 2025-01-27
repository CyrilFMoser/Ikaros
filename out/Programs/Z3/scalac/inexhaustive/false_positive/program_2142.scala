package Program_29 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: CC_A[Boolean], b: T_B[Boolean, Boolean], c: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[D, E](a: CC_A[D], b: E) extends T_B[D, E]
case class CC_E[F]() extends T_B[F, T_B[T_A, CC_B]]
case class CC_F[G]() extends T_B[G, T_B[T_A, CC_B]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, CC_A()) => 0 
  case CC_B(_, CC_D(_, _), CC_A()) => 1 
  case CC_B(_, CC_D(_, _), CC_C(_)) => 2 
  case CC_B(CC_A(), CC_D(_, _), CC_C(_)) => 3 
  case CC_B(_, _, CC_B(_, _, _)) => 4 
  case CC_B(_, CC_D(_, _), CC_B(_, _, _)) => 5 
  case CC_B(CC_A(), _, CC_B(_, _, _)) => 6 
  case CC_B(CC_A(), CC_D(_, _), CC_B(_, _, _)) => 7 
}
}
// This is not matched: (CC_B Wildcard Wildcard (CC_A T_A T_A) T_A)
// This is not matched: Pattern match is empty without constants