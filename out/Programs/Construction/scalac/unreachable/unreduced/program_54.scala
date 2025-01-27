package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: D, c: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(12, _, 12) => 1 
  case CC_B(_, _, 12) => 2 
  case CC_B(12, _, _) => 3 
  case CC_B(_, _, _) => 4 
}
}