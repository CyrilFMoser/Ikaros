package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Char) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}