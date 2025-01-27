package Program_14 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: Char) extends T_A[D]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A T_A)