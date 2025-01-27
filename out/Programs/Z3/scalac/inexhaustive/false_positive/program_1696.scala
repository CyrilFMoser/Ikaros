package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F]() extends T_A[E]
case class CC_C[G](a: T_B[G, G], b: T_A[(Boolean,Char)]) extends T_B[T_A[Int], G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_B Boolean Boolean (T_A Boolean))
// This is not matched: (CC_B (CC_A T_A) T_A Wildcard (T_B (CC_A T_A)))