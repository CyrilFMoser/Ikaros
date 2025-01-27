package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B() extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_C(a: T_B[CC_A, CC_B]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_D[D, E](a: T_B[E, D]) extends T_B[D, Int]
case class CC_E[F](a: CC_B) extends T_B[F, Int]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_B()) => 1 
}
}