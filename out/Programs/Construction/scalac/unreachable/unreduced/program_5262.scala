package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, T_A[C, C]]) extends T_A[C, (T_A[Boolean, Char],T_A[Int, Int])]
case class CC_B[D](a: Char) extends T_A[D, (T_A[Boolean, Char],T_A[Int, Int])]

val v_a: T_A[Boolean, (T_A[Boolean, Char],T_A[Int, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}