package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[(T_A,CC_A)], b: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: CC_B, b: T_B[Char], c: T_A) extends T_B[Char]
case class CC_E[B](a: B, b: B) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_)) => 3 
  case CC_C(CC_B(_, _)) => 4 
}
}