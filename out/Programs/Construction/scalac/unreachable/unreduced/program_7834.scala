package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, T_A[T_A[Boolean, Int], (Int,Boolean)]]
case class CC_B[D](a: T_A[D, CC_A[D]]) extends T_A[D, T_A[T_A[Boolean, Int], (Int,Boolean)]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Int], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}