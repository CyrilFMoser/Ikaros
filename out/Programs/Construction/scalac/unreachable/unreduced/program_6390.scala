package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[(Boolean,Boolean), Char]), b: T_B, c: T_B) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char], b: D) extends T_A[D, Char]
case class CC_C(a: T_A[(T_B,T_B), CC_B[T_B]], b: T_A[T_A[T_B, T_B], Char], c: T_A[Boolean, Char]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A((_,_), _, CC_C(_, _, _)), CC_D()) => 1 
  case CC_B(CC_B(_, _), CC_D()) => 2 
}
}
// This is not matched: CC_B(CC_A((_,_), _, CC_D()), CC_D())