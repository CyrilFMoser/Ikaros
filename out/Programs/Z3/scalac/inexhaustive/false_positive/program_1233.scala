package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Int, c: C) extends T_A[C]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: CC_A[E], b: Int, c: CC_A[Char]) extends T_B[E]
case class CC_D[F, G](a: T_A[F]) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
  case CC_C(CC_A(_, _, _), 12, _) => 3 
  case CC_C(_, 12, CC_A(_, _, _)) => 4 
  case CC_C(CC_A(_, _, _), 12, CC_A(_, _, _)) => 5 
  case CC_D(CC_A(_, _, _)) => 6 
}
}
// This is not matched: (CC_D Boolean Boolean Wildcard (T_B Boolean))
// This is not matched: (CC_A Int Wildcard (T_A Int))