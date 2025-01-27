package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: T_B[C, C], c: T_B[C, C]) extends T_A
case class CC_B(a: CC_A[CC_A[(Boolean,Int)]], b: Int, c: (CC_A[T_A],T_B[T_A, (Char,Boolean)])) extends T_A
case class CC_C(a: T_A, b: Byte) extends T_A
case class CC_D[D](a: T_A, b: D, c: Char) extends T_B[D, T_B[D, D]]
case class CC_E[E](a: T_B[E, CC_B]) extends T_B[E, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _), _, _), _, _) => 2 
  case CC_A(CC_B(_, _, _), _, _) => 3 
  case CC_A(CC_C(CC_A(_, _, _), _), _, _) => 4 
  case CC_A(CC_C(CC_B(_, _, _), _), _, _) => 5 
  case CC_A(CC_C(CC_C(_, _), _), _, _) => 6 
  case CC_B(CC_A(_, _, _), _, _) => 7 
  case CC_C(_, _) => 8 
}
}