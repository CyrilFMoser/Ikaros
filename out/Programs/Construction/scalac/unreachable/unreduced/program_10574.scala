package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int, b: T_B, c: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], Char]]
case class CC_B(a: T_A[Int, Boolean]) extends T_A[T_B, T_A[T_A[T_B, T_B], Char]]

val v_a: T_A[T_B, T_A[T_A[T_B, T_B], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}