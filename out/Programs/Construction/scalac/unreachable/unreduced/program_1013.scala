package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[Byte, T_A[Byte, Byte]]) extends T_A[T_A[Int, Int], Int]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
}
}