package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[Int], b: C, c: T_B[T_A[C]]) extends T_A[Int]
case class CC_B[D](a: Byte) extends T_A[Int]
case class CC_C(a: T_A[CC_B[Char]], b: T_A[Int]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}