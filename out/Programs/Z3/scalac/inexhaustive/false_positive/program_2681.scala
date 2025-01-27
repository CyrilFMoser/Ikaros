package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A (T_A Boolean Boolean) Boolean))
// This is not matched: (CC_A Boolean Boolean (T_A (T_A Boolean Boolean) Boolean))