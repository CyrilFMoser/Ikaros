package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_D[G](a: G) extends T_B[G]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_A T_A T_A)