package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B(a: T_B) extends T_A[Int]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D()) => 0 
}
}
// This is not matched: CC_A(_, _, _)