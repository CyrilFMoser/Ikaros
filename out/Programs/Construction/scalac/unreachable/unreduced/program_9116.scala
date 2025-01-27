package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean], b: (T_A,T_A)) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[T_A, Byte], b: CC_A, c: T_B[CC_B, CC_B]) extends T_B[CC_B, Int]
case class CC_E[C]() extends T_B[C, T_B[C, C]]
case class CC_F(a: CC_D) extends T_B[CC_B, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
  case CC_B(_, _, CC_B(CC_A(_, _), _, CC_A(_, _))) => 2 
  case CC_B(_, _, CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 3 
  case CC_B(_, _, CC_B(CC_A(_, _), _, CC_C())) => 4 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 5 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 6 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_C())) => 7 
  case CC_B(_, _, CC_B(CC_C(), _, CC_A(_, _))) => 8 
  case CC_B(_, _, CC_B(CC_C(), _, CC_B(_, _, _))) => 9 
  case CC_B(_, _, CC_B(CC_C(), _, CC_C())) => 10 
  case CC_B(_, _, CC_C()) => 11 
  case CC_C() => 12 
}
}