package Program_13 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: T_B[C, C], c: T_B[C, C]) extends T_A
case class CC_B(a: T_B[T_A, T_A]) extends T_A
case class CC_C(a: CC_B, b: T_B[Boolean, T_A]) extends T_A
case class CC_D[D, E](a: T_B[D, E], b: (CC_B,T_A), c: CC_C) extends T_B[D, E]
case class CC_E[F](a: CC_B, b: T_B[F, F]) extends T_B[F, T_A]
case class CC_F[H, G]() extends T_B[H, G]

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_D(_, _, _), _) => 0 
  case CC_A(CC_B(_), _, CC_D(_, _, _)) => 1 
  case CC_A(CC_B(_), CC_D(_, _, _), _) => 2 
  case CC_A(CC_B(_), _, CC_F()) => 3 
  case CC_A(CC_B(_), CC_F(), _) => 4 
}
}
// This is not matched: (CC_A (CC_B T_A (T_B T_A T_A))
//      (CC_C (CC_B Wildcard T_A) (CC_F Boolean T_A (T_B Boolean T_A)) T_A)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: Pattern match is empty without constants