package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: T_A[T_B]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_B, b: Byte) extends T_B
case class CC_C(a: T_A[(CC_B,CC_B)], b: T_A[T_A[Boolean]], c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 1 
  case CC_B(CC_B(CC_D(), _), _) => 2 
  case CC_B(CC_C(_, CC_A(_, _, _), CC_B(_, _)), _) => 3 
  case CC_B(CC_C(_, CC_A(_, _, _), CC_C(_, _, _)), _) => 4 
  case CC_B(CC_C(_, CC_A(_, _, _), CC_D()), _) => 5 
  case CC_C(_, _, _) => 6 
  case CC_D() => 7 
}
}
// This is not matched: CC_B(CC_D(), _)