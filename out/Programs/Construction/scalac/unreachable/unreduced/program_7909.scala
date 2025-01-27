package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, Int], c: T_A[C, C]) extends T_A[C, Int]
case class CC_B(a: Int) extends T_A[T_A[CC_A[T_B], Int], Int]
case class CC_C[D, E](a: (T_B,T_A[CC_B, Int]), b: T_A[E, D]) extends T_A[D, Int]
case class CC_D(a: Byte, b: CC_B, c: Char) extends T_B
case class CC_E(a: CC_B, b: T_A[CC_B, Int]) extends T_B

val v_a: T_A[T_A[CC_A[T_B], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_), _) => 1 
  case CC_A(_, CC_C((_,_), _), _) => 2 
  case CC_B(_) => 3 
  case CC_C((CC_D(_, _, _),CC_A(_, _, _)), _) => 4 
  case CC_C((CC_D(_, _, _),CC_C(_, _)), _) => 5 
  case CC_C((CC_E(_, _),CC_A(_, _, _)), _) => 6 
  case CC_C((CC_E(_, _),CC_C(_, _)), _) => 7 
}
}