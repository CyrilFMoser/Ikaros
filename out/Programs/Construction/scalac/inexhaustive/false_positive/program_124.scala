package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_B, b: CC_A) extends T_B[T_A]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_C())) => 0 
}
}
// This is not matched: CC_A(CC_B(_), _)