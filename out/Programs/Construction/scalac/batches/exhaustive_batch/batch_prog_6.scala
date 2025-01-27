package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Int, T_A[Int, T_A[Char, Boolean]]]) extends T_A[Int, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
}
}