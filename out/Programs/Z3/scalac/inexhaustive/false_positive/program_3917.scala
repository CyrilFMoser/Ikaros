package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[D, D], c: Int) extends T_A[C, T_A[C, C]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F, G]() extends T_A[F, G]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(12, CC_C(), 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A T_A)