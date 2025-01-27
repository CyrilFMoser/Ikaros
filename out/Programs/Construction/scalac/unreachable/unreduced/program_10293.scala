package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[Int, Boolean],T_A), b: T_A, c: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: T_A, b: T_A, c: Int) extends T_A
case class CC_C[C](a: CC_B, b: Int, c: T_B[C, C]) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_A((_,CC_B(_, _, _)), _, _) => 1 
  case CC_B(CC_A((_,_), CC_A(_, _, _), _), _, _) => 2 
  case CC_B(CC_A((_,_), CC_B(_, _, _), _), _, _) => 3 
  case CC_B(CC_B(_, _, _), _, _) => 4 
}
}