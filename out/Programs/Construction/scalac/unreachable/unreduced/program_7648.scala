package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Byte, c: (Char,T_A[Char])) extends T_A[C]
case class CC_B[D](a: T_B[D], b: D) extends T_A[D]
case class CC_C(a: CC_A[T_A[Char]], b: T_A[CC_A[Byte]]) extends T_B[T_B[T_A[Byte]]]
case class CC_D(a: CC_C, b: T_B[Char]) extends T_B[T_B[T_A[Byte]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), 0, (_,_)), _, (_,CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_A(_, _, _), 0, (_,_)), _, (_,CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), _, (_,CC_A(_, _, _))) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), _, (_,CC_B(_, _))) => 3 
  case CC_A(CC_A(CC_B(_, _), 0, (_,_)), _, (_,CC_A(_, _, _))) => 4 
  case CC_A(CC_A(CC_B(_, _), 0, (_,_)), _, (_,CC_B(_, _))) => 5 
  case CC_A(CC_A(CC_B(_, _), _, (_,_)), _, (_,CC_A(_, _, _))) => 6 
  case CC_A(CC_A(CC_B(_, _), _, (_,_)), _, (_,CC_B(_, _))) => 7 
  case CC_A(CC_B(_, _), _, (_,CC_B(_, _))) => 8 
  case CC_B(_, _) => 9 
}
}
// This is not matched: CC_A(CC_B(_, _), _, (_,CC_A(_, _, _)))