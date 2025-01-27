package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: Int, c: T_A[Int, T_A[T_B, Int]]) extends T_A[Int, T_A[T_B, Int]]
case class CC_B(a: CC_A, b: Char) extends T_B
case class CC_C(a: T_A[CC_B, CC_B], b: T_B, c: CC_A) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_B(_, _),CC_B(_, _)), _, CC_A(_, _, _)) => 0 
  case CC_A((CC_B(_, _),CC_C(_, _, _)), _, CC_A(_, _, _)) => 1 
  case CC_A((CC_C(_, _, _),CC_B(_, _)), _, CC_A(_, _, _)) => 2 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, CC_A(_, _, _)) => 3 
}
}