package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B[D](a: Char, b: (T_A,(Boolean,Byte)), c: T_B[Byte, D]) extends T_B[Byte, D]
case class CC_C[E](a: CC_A[E], b: T_B[E, E], c: CC_B[E]) extends T_B[Byte, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_B Boolean Char Wildcard Wildcard (T_A Char Boolean))