package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E]() extends T_A[D]
case class CC_C[F]() extends T_A[F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B Boolean Boolean (T_A Boolean))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Char Char) Int))