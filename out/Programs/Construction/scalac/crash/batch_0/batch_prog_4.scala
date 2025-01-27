package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Int, c: T_A[B]) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, 12, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}