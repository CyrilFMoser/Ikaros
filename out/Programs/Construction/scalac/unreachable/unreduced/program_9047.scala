package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: Boolean, c: T_B[T_B[CC_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_C(a: Byte, b: CC_B) extends T_A
case class CC_D[C]() extends T_B[CC_A, (CC_B,CC_C)]
case class CC_E(a: Char) extends T_B[CC_A, (CC_B,CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(_, _)) => 4 
  case CC_B(CC_A(CC_A(_)), _, _) => 5 
  case CC_B(CC_A(CC_B(_, _, _)), _, _) => 6 
  case CC_B(CC_A(CC_C(_, _)), _, _) => 7 
  case CC_B(CC_B(CC_A(_), _, _), _, _) => 8 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 9 
  case CC_B(CC_B(CC_C(_, _), _, _), _, _) => 10 
  case CC_B(CC_C(_, CC_B(_, _, _)), _, _) => 11 
  case CC_C(_, CC_B(_, _, _)) => 12 
}
}