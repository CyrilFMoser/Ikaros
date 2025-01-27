package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: CC_A[D], b: Boolean, c: T_A[D, Char]) extends T_A[D, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}