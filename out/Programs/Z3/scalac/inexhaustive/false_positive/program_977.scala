package Program_30 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Boolean]]
case class CC_B[C, D]() extends T_B[C]
case class CC_C[E]() extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Char Boolean (T_B Char))
// This is not matched: (CC_B (T_A Char) Wildcard Wildcard (T_A (T_A Char)))