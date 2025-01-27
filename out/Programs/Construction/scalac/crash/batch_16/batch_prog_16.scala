package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, Byte]) extends T_A[T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]], CC_A[CC_A[Boolean]]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}