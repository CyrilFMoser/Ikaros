package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: T_B[(T_A,Byte)]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D(a: T_A) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B()) => 1 
  case CC_D(CC_C(_, _)) => 2 
}
}