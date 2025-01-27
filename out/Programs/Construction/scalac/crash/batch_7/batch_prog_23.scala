package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Byte) extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}