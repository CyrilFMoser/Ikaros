package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[C](a: T_B, b: (T_B,T_B)) extends T_A[C]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants