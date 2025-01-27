package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D], c: Char) extends T_A[D]
case class CC_C[E](a: Byte, b: CC_B[E]) extends T_A[E]
case class CC_D[F](a: T_A[F], b: F, c: T_A[F]) extends T_B[F]
case class CC_E[G, H]() extends T_B[G]
case class CC_F[I](a: I, b: Byte) extends T_B[I]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(12, _) => 1 
  case CC_F(_, 0) => 2 
  case CC_F(12, 0) => 3 
  case CC_F(_, _) => 4 
  case CC_D(_, 12, _) => 5 
  case CC_D(CC_B(_, _, _), _, CC_C(_, _)) => 6 
  case CC_D(CC_A(_), 12, CC_A(_)) => 7 
  case CC_D(_, _, CC_C(_, _)) => 8 
  case CC_D(_, 12, CC_B(_, _, _)) => 9 
  case CC_D(CC_B(_, _, _), 12, CC_C(_, _)) => 10 
  case CC_D(CC_C(_, _), _, _) => 11 
  case CC_D(CC_A(_), _, CC_A(_)) => 12 
  case CC_D(CC_B(_, _, _), 12, CC_A(_)) => 13 
  case CC_D(CC_A(_), _, CC_C(_, _)) => 14 
  case CC_D(CC_C(_, _), 12, CC_C(_, _)) => 15 
  case CC_D(CC_B(_, _, _), _, CC_A(_)) => 16 
  case CC_D(_, _, CC_A(_)) => 17 
  case CC_D(CC_B(_, _, _), 12, _) => 18 
  case CC_D(CC_C(_, _), _, CC_A(_)) => 19 
  case CC_D(CC_C(_, _), 12, CC_B(_, _, _)) => 20 
  case CC_D(CC_A(_), 12, CC_C(_, _)) => 21 
  case CC_D(CC_B(_, _, _), _, CC_B(_, _, _)) => 22 
  case CC_D(CC_C(_, _), 12, _) => 23 
  case CC_D(CC_C(_, _), _, CC_B(_, _, _)) => 24 
  case CC_D(CC_A(_), _, _) => 25 
}
}
// This is not matched: (CC_E Int Boolean (T_B Int))
// This is not matched: (CC_B (CC_A (T_B T_A))
//      (CC_B Boolean Wildcard Byte Boolean (T_B Boolean))
//      Wildcard
//      Wildcard
//      (T_B (CC_A (T_B T_A))))