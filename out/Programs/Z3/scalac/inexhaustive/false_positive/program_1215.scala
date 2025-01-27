package Program_31 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: D) extends T_A[D]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_B Int (T_A Int))