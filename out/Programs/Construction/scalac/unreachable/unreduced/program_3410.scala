package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: T_A[C, C], c: C) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int]) extends T_A[D, Int]
case class CC_C[E, F](a: Int, b: Char) extends T_A[E, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_)