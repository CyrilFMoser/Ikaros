package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, Char], c: (T_B,T_B)) extends T_A[C, Char]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, Char]) extends T_B

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_D())) => 0 
}
}
// This is not matched: Pattern match is empty without constants