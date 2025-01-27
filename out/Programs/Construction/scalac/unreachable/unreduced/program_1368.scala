package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: CC_A, b: (CC_B,T_B[CC_B, Int]), c: C) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}