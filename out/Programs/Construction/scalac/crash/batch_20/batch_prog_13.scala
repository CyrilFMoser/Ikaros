package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, C], b: T_A[C, C]) extends T_A[C, D]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}