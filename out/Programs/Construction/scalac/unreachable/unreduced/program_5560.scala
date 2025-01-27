package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A) extends T_A
case class CC_B(a: CC_A[Boolean], b: T_B[Byte, Int]) extends T_A
case class CC_C[D](a: CC_B, b: T_A, c: D) extends T_B[Int, D]
case class CC_D[E](a: CC_B, b: CC_B) extends T_B[Int, E]

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(CC_A(_), _)) => 2 
}
}