package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: T_A[(Boolean,Char)]) extends T_A[T_B[Boolean]]
case class CC_B(a: T_A[T_B[CC_A]], b: T_A[T_B[Boolean]]) extends T_B[(T_B[CC_A],T_B[CC_A])]
case class CC_C[C](a: CC_B, b: T_A[T_B[Boolean]]) extends T_B[C]

val v_a: T_B[(T_B[CC_A],T_B[CC_A])] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_C(_, _) => 1 
}
}