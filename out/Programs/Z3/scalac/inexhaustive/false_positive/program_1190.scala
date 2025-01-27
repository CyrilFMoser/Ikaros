package Program_30 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Int, (Char,Boolean)]]
case class CC_B(a: Byte, b: (CC_A,CC_A)) extends T_A[T_B[Int, (Char,Boolean)]]
case class CC_C[D, E]() extends T_A[D]
case class CC_D[G, F](a: Byte, b: T_B[G, G]) extends T_B[F, G]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C (CC_B (T_A Boolean) Boolean Boolean)
//      Boolean
//      (T_A (CC_B (T_A Boolean) Boolean Boolean)))
// This is not matched: Pattern match is empty without constants