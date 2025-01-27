package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_A, b: Byte, c: CC_A) extends T_B[Boolean, CC_A]
case class CC_E(a: CC_A) extends T_B[Boolean, CC_A]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _, _) => 0 
  case CC_D(CC_B(_, CC_B(_, _)), _, _) => 1 
  case CC_D(CC_B(_, CC_C()), _, _) => 2 
  case CC_D(CC_C(), _, _) => 3 
  case CC_E(CC_A()) => 4 
}
}
// This is not matched: CC_D(CC_B(_, CC_A()), _, _)