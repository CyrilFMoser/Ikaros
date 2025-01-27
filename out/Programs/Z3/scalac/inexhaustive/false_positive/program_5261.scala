package Program_15 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: CC_A[D], b: Int) extends T_A[C]
case class CC_C[E]() extends T_A[E]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
  case CC_B(CC_A(), 12) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants