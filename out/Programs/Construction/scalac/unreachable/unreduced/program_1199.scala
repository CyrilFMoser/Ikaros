package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: ((T_B,(Char,Boolean)),Int)) extends T_A[T_A[T_A[T_B, Boolean], (Byte,T_B)], Boolean]
case class CC_B(a: T_B, b: T_B) extends T_A[T_A[T_A[T_B, Boolean], (Byte,T_B)], Boolean]
case class CC_C[C](a: Char, b: C) extends T_A[C, CC_B]
case class CC_D(a: T_A[T_B, CC_B], b: T_A[CC_C[T_B], CC_B]) extends T_B
case class CC_E(a: T_A[Char, Boolean]) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[T_A[T_B, Boolean], (Byte,T_B)], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _), CC_D(_, _)) => 0 
  case CC_B(CC_E(_), CC_D(_, _)) => 1 
  case CC_B(CC_F(), CC_D(_, _)) => 2 
  case CC_B(CC_D(_, _), CC_E(_)) => 3 
  case CC_B(CC_E(_), CC_E(_)) => 4 
  case CC_B(CC_F(), CC_E(_)) => 5 
  case CC_B(CC_D(_, _), CC_F()) => 6 
  case CC_B(CC_E(_), CC_F()) => 7 
  case CC_B(CC_F(), CC_F()) => 8 
}
}
// This is not matched: CC_A(_)