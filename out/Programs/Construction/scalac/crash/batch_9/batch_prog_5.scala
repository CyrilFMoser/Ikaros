package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Boolean, b: Char) extends T_A
case class CC_C[B](a: Boolean, b: B, c: B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(true, _, _) => 1 
  case CC_C(false, _, _) => 2 
}
}
// This is not matched: CC_A()