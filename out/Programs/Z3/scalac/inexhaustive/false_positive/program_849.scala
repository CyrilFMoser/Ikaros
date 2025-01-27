package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_A[E, E], c: T_A[E, E]) extends T_A[E, D]
case class CC_B[F, G](a: CC_A[F, F], b: G) extends T_A[Boolean, F]
case class CC_C[H](a: CC_A[H, H], b: CC_B[H, H], c: T_B[H]) extends T_A[H, T_B[H]]
case class CC_D[I]() extends T_B[I]
case class CC_E[J](a: T_A[Boolean, J]) extends T_B[T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _), _) => 1 
  case CC_A(CC_D(), CC_B(_, _), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 4 
  case CC_A(CC_D(), CC_A(_, _, _), _) => 5 
  case CC_A(CC_D(), CC_A(_, _, _), CC_A(_, _, _)) => 6 
  case CC_A(CC_D(), CC_A(_, _, _), CC_B(_, _)) => 7 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 8 
  case CC_A(CC_D(), _, _) => 9 
  case CC_A(_, _, CC_A(_, _, _)) => 10 
  case CC_A(_, _, CC_B(_, _)) => 11 
  case CC_A(_, _, _) => 12 
  case CC_A(CC_D(), CC_B(_, _), CC_B(_, _)) => 13 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 14 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A Boolean Int))
// This is not matched: Pattern match is empty without constants