package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: T_A[C], c: Boolean) extends T_A[C]
case class CC_C[D](a: CC_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_D() extends T_B

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_D()), _, _) => 0 
}
}