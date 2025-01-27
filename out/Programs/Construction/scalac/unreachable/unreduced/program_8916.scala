package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D]) extends T_A[Int, D]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}