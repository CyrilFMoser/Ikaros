package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[Int, T_A]], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: Byte, b: Byte) extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_A(_, CC_C(_))) => 2 
  case CC_A(_, CC_B()) => 3 
  case CC_A(_, CC_C(_)) => 4 
  case CC_B() => 5 
  case CC_C(_) => 6 
}
}