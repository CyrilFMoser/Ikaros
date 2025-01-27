package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: (T_A[Boolean, Int],T_A[Boolean, Int]), c: Int) extends T_A[C, Int]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[D, Int]) extends T_A[D, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}