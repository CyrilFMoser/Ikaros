package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D) extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_D Int
//      (CC_B Byte (T_B Byte))
//      (CC_B Boolean (T_B Boolean))
//      (T_B (CC_B Boolean Boolean)))