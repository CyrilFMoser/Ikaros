package Program_30 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G]() extends T_A[F, E]
case class CC_B() extends T_A[Int, T_B[(Int,Char), Byte]]
case class CC_C[H]() extends T_B[H, Boolean]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean (T_A Int Byte))
// This is not matched: Pattern match is empty without constants