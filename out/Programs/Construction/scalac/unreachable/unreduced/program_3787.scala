package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C) extends T_A[(T_A[T_B, T_B],T_A[T_B, T_B]), C]
case class CC_B(a: T_B, b: T_A[Int, T_B]) extends T_B
case class CC_C(a: T_B, b: CC_A[CC_A[T_B]]) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_B(_, _), _), _) => 0 
  case CC_C(CC_B(CC_C(_, _), _), _) => 1 
  case CC_C(CC_B(CC_D(), _), _) => 2 
  case CC_C(CC_C(_, CC_A(_, _)), _) => 3 
  case CC_C(CC_D(), _) => 4 
}
}