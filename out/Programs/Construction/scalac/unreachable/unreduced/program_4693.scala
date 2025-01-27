package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: D, c: D) extends T_A[T_B, D]

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}