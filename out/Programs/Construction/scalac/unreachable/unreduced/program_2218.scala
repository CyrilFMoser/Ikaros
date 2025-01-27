package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_A), b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], c: Int) extends T_A
case class CC_B(a: Int, b: T_B[CC_A, CC_A]) extends T_A
case class CC_C(a: CC_A, b: T_B[T_A, T_B[CC_B, T_A]]) extends T_A
case class CC_D[C](a: C) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_A((_,CC_B(_, _)), _, _) => 1 
  case CC_A((_,CC_C(_, _)), _, _) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_, _) => 4 
}
}