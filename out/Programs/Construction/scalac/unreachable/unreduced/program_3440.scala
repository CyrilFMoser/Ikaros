package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[(T_B,CC_A)], b: Int) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}