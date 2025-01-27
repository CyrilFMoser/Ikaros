package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Char)], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]], b: Boolean) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_A(_, CC_C(_, _)) => 2 
  case CC_B(CC_A(_, CC_A(_, _)), _) => 3 
  case CC_B(CC_A(_, CC_B(_, _)), _) => 4 
  case CC_B(CC_A(_, CC_C(_, _)), _) => 5 
  case CC_B(CC_B(CC_A(_, _), true), _) => 6 
  case CC_B(CC_B(CC_B(_, _), true), _) => 7 
  case CC_B(CC_B(CC_C(_, _), true), _) => 8 
  case CC_B(CC_B(CC_A(_, _), false), _) => 9 
  case CC_B(CC_B(CC_B(_, _), false), _) => 10 
  case CC_B(CC_B(CC_C(_, _), false), _) => 11 
  case CC_B(CC_C(CC_B(_, _), CC_A(_, _)), _) => 12 
  case CC_C(CC_B(_, _), CC_A(_, _)) => 13 
}
}