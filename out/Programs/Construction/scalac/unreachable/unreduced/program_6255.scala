package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B(a: T_B[(T_A,CC_A), T_B[T_A, (Boolean,Char)]]) extends T_A
case class CC_C(a: CC_B, b: T_B[(Boolean,(Byte,Boolean)), CC_B], c: CC_B) extends T_A
case class CC_D[C](a: CC_B, b: T_A, c: C) extends T_B[C, T_B[T_B[Char, T_A], (CC_B,Int)]]
case class CC_E[D]() extends T_B[D, T_B[T_B[Char, T_A], (CC_B,Int)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(CC_B(_), _, CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _, CC_A(_, _, _)), _, _) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_)), _, _) => 3 
  case CC_A(CC_A(CC_B(_), _, CC_B(_)), _, _) => 4 
  case CC_A(CC_A(CC_C(_, _, _), _, CC_B(_)), _, _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C(_, _, _)), _, _) => 6 
  case CC_A(CC_A(CC_B(_), _, CC_C(_, _, _)), _, _) => 7 
  case CC_A(CC_A(CC_C(_, _, _), _, CC_C(_, _, _)), _, _) => 8 
  case CC_A(CC_B(_), _, _) => 9 
  case CC_A(CC_C(_, _, _), _, _) => 10 
  case CC_B(_) => 11 
  case CC_C(CC_B(_), _, _) => 12 
}
}