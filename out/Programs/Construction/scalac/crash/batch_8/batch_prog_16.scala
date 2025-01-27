package Program_16 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: Int, b: Int) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
}
}