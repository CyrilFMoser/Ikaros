package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char) extends T_A[C, D]
case class CC_B[E](a: CC_A[E, E], b: CC_A[E, E]) extends T_A[E, Int]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
}
}