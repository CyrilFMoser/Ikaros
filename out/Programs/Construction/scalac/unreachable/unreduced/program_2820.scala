package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[(T_A,Byte)], b: Int, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_B) extends T_B[CC_A]
case class CC_E(a: CC_A) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}