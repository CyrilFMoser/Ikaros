package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D]() extends T_A[Int, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_B() => 2 
}
}