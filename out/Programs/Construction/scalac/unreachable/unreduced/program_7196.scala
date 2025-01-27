package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, (Char,Int)]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: CC_A[D]) extends T_A[D, T_A[D, (Char,Int)]]

val v_a: T_A[Int, T_A[Int, (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}