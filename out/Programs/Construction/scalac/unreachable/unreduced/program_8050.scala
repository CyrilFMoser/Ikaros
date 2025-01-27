package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[Int, C], C]
case class CC_B(a: T_A[(T_B,Char), T_A[T_B, T_B]], b: T_B) extends T_B
case class CC_C(a: CC_B, b: CC_A[T_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 1 
  case CC_B(_, CC_B(_, CC_D())) => 2 
  case CC_B(_, CC_C(CC_B(_, _), CC_A())) => 3 
  case CC_B(_, CC_D()) => 4 
  case CC_C(_, CC_A()) => 5 
  case CC_D() => 6 
}
}