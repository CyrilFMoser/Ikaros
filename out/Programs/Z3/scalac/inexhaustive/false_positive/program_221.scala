package Program_30 

object Test {
sealed trait T_A[A]
case class CC_B(a: Char) extends T_A[(Boolean,Boolean)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Int (CC_B Char Wildcard (T_A Char)) (T_A Int))