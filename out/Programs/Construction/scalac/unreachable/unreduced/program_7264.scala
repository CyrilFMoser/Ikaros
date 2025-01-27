package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[((Int,Byte),T_A), T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Int, b: T_B[T_B[Byte, CC_A], Int], c: (Byte,T_A)) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C]() extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_A(CC_C(CC_A(_, _)), _) => 4 
  case CC_A(CC_C(CC_B(_, _, _)), _) => 5 
  case CC_A(CC_C(CC_C(_)), _) => 6 
  case CC_B(_, _, _) => 7 
  case CC_C(CC_A(_, _)) => 8 
  case CC_C(CC_B(_, _, _)) => 9 
  case CC_C(CC_C(CC_A(_, _))) => 10 
  case CC_C(CC_C(CC_B(_, _, _))) => 11 
  case CC_C(CC_C(CC_C(_))) => 12 
}
}