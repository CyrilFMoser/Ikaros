package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: CC_A[D], c: T_A[Int, T_A[D, D]]) extends T_A[Int, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}