package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: C, c: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D](a: Char) extends T_A[D, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_B(_) => 2 
}
}