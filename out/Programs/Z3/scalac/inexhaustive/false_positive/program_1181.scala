package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[G](a: Byte) extends T_B[T_A[G, G], G]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Int (T_A Int))