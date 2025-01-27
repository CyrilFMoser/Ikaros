package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[D, T_A[D, D]], D]

val v_a: T_A[T_A[Int, T_A[Int, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}