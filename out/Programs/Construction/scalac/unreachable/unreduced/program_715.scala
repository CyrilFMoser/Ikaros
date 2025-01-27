package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: CC_A[T_B], b: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_B(_, _)) => 2 
  case CC_D(_, CC_C()) => 3 
  case CC_D(_, CC_D(_, _)) => 4 
}
}