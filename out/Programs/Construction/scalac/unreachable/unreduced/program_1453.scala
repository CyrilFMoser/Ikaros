package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Boolean,T_A), T_B[T_A, T_A]], b: T_B[(T_A,T_A), T_B[Int, T_A]]) extends T_A
case class CC_B(a: (T_A,T_A), b: (T_A,Boolean)) extends T_A
case class CC_C[C](a: (Int,T_B[CC_B, CC_A]), b: CC_B, c: T_A) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}