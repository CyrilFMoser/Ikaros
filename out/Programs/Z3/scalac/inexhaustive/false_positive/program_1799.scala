package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[G](a: Char) extends T_A[G, T_B[G, G]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_B Boolean Byte (T_A Boolean Byte))