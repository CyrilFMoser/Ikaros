package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[(Byte,Byte)]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 2 
  case CC_A(CC_B(CC_A(_, _)), _) => 3 
  case CC_A(CC_B(CC_B(_)), _) => 4 
  case CC_A(CC_B(CC_C(_, _, _)), _) => 5 
  case CC_A(CC_C(CC_A(_, _), _, _), _) => 6 
  case CC_B(CC_A(_, _)) => 7 
  case CC_B(CC_B(CC_A(_, _))) => 8 
  case CC_B(CC_B(CC_B(_))) => 9 
  case CC_B(CC_B(CC_C(_, _, _))) => 10 
  case CC_B(CC_C(_, CC_A(_, _), CC_A(_, _))) => 11 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(_, _), CC_A(CC_A(_, _), _)) => 12 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(_, _), CC_A(CC_B(_), _)) => 13 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(_, _), CC_A(CC_C(_, _, _), _)) => 14 
  case CC_C(CC_A(CC_B(_), _), CC_A(_, _), CC_A(CC_A(_, _), _)) => 15 
  case CC_C(CC_A(CC_B(_), _), CC_A(_, _), CC_A(CC_B(_), _)) => 16 
  case CC_C(CC_A(CC_B(_), _), CC_A(_, _), CC_A(CC_C(_, _, _), _)) => 17 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_A(_, _), CC_A(CC_A(_, _), _)) => 18 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_A(_, _), CC_A(CC_B(_), _)) => 19 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_A(_, _), CC_A(CC_C(_, _, _), _)) => 20 
}
}