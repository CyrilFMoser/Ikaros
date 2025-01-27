package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B[E, F](a: T_B[F]) extends T_A[T_B[E], E]
case class CC_C[G]() extends T_A[T_B[G], G]

val v_a: T_A[T_B[Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B Char Boolean Wildcard (T_A (T_B Char) Char))
// This is not matched: (CC_A Boolean Boolean Wildcard (CC_C Boolean (T_A Boolean)) (T_A Boolean))