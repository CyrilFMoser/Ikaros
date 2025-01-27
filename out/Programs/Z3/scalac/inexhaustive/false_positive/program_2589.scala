package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[Int], b: (Boolean,Boolean)) extends T_A[C]
case class CC_B[D](a: D, b: D, c: Int) extends T_A[D]
case class CC_C[E, F](a: F, b: T_A[F]) extends T_B[E]
case class CC_D[G](a: CC_A[G], b: T_A[G]) extends T_B[G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(12, 12, 12) => 0 
  case CC_B(_, 12, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(_, 12, 12) => 3 
  case CC_B(12, _, _) => 4 
  case CC_B(_, _, 12) => 5 
  case CC_B(12, _, 12) => 6 
  case CC_A(CC_C(_, _), _) => 7 
  case CC_A(CC_D(_, _), _) => 8 
}
}
// This is not matched: (CC_A Int (CC_C Int Boolean Wildcard Wildcard (T_B Int)) Wildcard (T_A Int))
// This is not matched: (CC_C Int Boolean Int (T_A Int Char))