package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, (Int,T_B[Boolean])]
case class CC_B(a: Int) extends T_A[(T_A[Int, Boolean],Char), (Int,T_B[Boolean])]
case class CC_C[E]() extends T_B[E]
case class CC_D[F](a: F) extends T_B[F]
case class CC_E[G](a: (CC_A[Int],T_A[CC_B, CC_B])) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E((CC_A(_),_)) => 1 
}
}
// This is not matched: CC_D(_)