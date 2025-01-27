package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Int], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: Byte) extends T_B[C, T_B[C, C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_B() => 2 
}
}