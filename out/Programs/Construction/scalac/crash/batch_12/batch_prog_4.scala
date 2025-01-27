package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Int) extends T_A[B]
case class CC_B[C, D](a: T_A[D], b: Char, c: T_A[C]) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}