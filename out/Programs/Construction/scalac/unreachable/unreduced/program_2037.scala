package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[T_A[Byte]]) extends T_A[Boolean]
case class CC_B[B](a: (Boolean,(CC_A,CC_A)), b: Char, c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,(_,_)), _, CC_A(_, _)) => 0 
  case CC_B((_,(_,_)), _, CC_B((_,_), 'x', _)) => 1 
  case CC_B((_,(_,_)), _, CC_B((_,_), _, _)) => 2 
}
}
// This is not matched: CC_A(_, _)