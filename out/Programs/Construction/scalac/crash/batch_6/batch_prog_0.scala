package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[D, C]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}