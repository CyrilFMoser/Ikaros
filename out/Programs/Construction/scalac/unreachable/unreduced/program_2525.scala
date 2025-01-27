package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_B]
case class CC_B(a: T_A[T_A[T_B, T_B], T_B], b: T_A[T_B, T_B], c: Boolean) extends T_B
case class CC_C(a: (CC_B,T_A[CC_B, Int]), b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_B(_, _, _)), _) => 0 
  case CC_B(_, CC_A(CC_C(_, _)), _) => 1 
  case CC_C((CC_B(_, _, _),_), CC_B(CC_A(_), _, _)) => 2 
}
}