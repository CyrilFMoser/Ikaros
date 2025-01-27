package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: Char, c: T_A[E, F]) extends T_A[F, E]
case class CC_B(a: T_A[Char, Char], b: T_A[Boolean, Byte], c: T_B[Boolean, Int]) extends T_B[Boolean, Boolean]
case class CC_C[G, H, I](a: T_B[I, I]) extends T_B[G, H]

val v_a: T_A[T_B[Boolean, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), 'x', _) => 0 
  case CC_A(CC_C(_), 'x', CC_A(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), _, _) => 2 
  case CC_A(CC_C(_), _, _) => 3 
  case CC_A(CC_C(_), _, CC_A(_, _, _)) => 4 
  case CC_A(CC_B(_, _, _), _, CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_A (T_B Boolean Boolean)
//      Int
//      (CC_C Boolean Boolean Boolean Wildcard (T_B Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_A (T_B Boolean Boolean) Int))
// This is not matched: (CC_B (CC_C (CC_A T_A) T_A) T_A)