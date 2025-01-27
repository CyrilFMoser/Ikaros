package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[(Int,Boolean)]
case class CC_C(a: T_A[T_A[Boolean]], b: T_A[(Int,Boolean)]) extends T_A[(Int,Boolean)]
case class CC_D[D](a: Int, b: CC_B) extends T_B[CC_C, D]
case class CC_E(a: T_A[(Int,Boolean)], b: T_B[CC_C, CC_B]) extends T_B[CC_C, T_A[Boolean]]

val v_a: T_B[CC_C, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
  case CC_E(CC_B(), _) => 1 
  case CC_E(CC_C(_, CC_B()), _) => 2 
}
}
// This is not matched: CC_E(CC_C(_, CC_C(_, _)), _)