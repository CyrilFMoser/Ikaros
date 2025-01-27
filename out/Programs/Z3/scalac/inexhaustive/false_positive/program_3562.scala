package Program_15 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D](a: (T_A,Byte), b: T_A) extends T_B[D, C]
case class CC_C[E, F](a: (CC_A,CC_A), b: T_B[F, E]) extends T_B[T_A, E]

val v_a: T_B[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),_), CC_A()) => 0 
  case CC_C((CC_A(),CC_A()), CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_C Char (CC_A T_A) Wildcard Wildcard (T_B T_A Char))
// This is not matched: (CC_A Boolean (T_A Boolean))