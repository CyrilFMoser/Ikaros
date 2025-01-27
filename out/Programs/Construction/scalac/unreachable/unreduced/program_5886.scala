package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Boolean], T_B[Boolean, Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C[D](a: CC_A, b: D) extends T_B[D, T_B[Int, CC_B]]
case class CC_D(a: Boolean) extends T_B[CC_A, T_B[Int, CC_B]]

val v_a: T_B[CC_A, T_B[Int, CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_D(_) => 1 
}
}