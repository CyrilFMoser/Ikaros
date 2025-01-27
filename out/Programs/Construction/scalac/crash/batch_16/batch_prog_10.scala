package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: T_B) extends T_A[Int, C]
case class CC_B(a: T_A[Int, T_A[Int, Boolean]]) extends T_A[Int, Boolean]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}