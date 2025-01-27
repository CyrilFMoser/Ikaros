package Program_29 

object Test {
sealed trait T_A
case class CC_A(a: (Int,T_A), b: T_A) extends T_A
case class CC_B(a: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: CC_A(_, _)