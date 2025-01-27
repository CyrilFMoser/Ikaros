package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[Boolean], b: T_A) extends T_A
case class CC_C(a: CC_B) extends T_B[(Boolean,T_A)]
case class CC_D(a: Char) extends T_B[(Boolean,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, CC_A())) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B(_, CC_A())