package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B(a: T_A[Int], b: T_A[(Char,Boolean)], c: T_B[Char]) extends T_A[T_B[Boolean]]
case class CC_C[E](a: E, b: T_A[E], c: CC_B) extends T_A[T_A[CC_B]]
case class CC_D[F](a: (CC_B,CC_B), b: CC_A[F, F]) extends T_B[F]
case class CC_E[G, H]() extends T_B[G]
case class CC_F[I]() extends T_B[I]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(CC_A(), CC_A(), CC_F()) => 2 
  case CC_B(CC_A(), CC_A(), CC_D(_, _)) => 3 
  case CC_B(_, CC_A(), CC_E()) => 4 
  case CC_B(_, _, CC_F()) => 5 
  case CC_B(CC_A(), _, CC_E()) => 6 
  case CC_B(_, CC_A(), CC_F()) => 7 
}
}
// This is not matched: (CC_B (CC_A Int Boolean (T_A Int))
//      (CC_A (Tuple Char Boolean) (T_B (T_A Boolean)) (T_A (Tuple Char Boolean)))
//      (CC_D Char Wildcard (CC_A Char Char (T_A Char)) (T_B Char))
//      (T_A (T_B Boolean)))
// This is not matched: (CC_C Wildcard (CC_C Wildcard Wildcard T_A) T_A)