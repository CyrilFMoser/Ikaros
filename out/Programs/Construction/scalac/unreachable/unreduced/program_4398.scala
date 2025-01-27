package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: (T_B[T_A, T_A],(T_A,Byte)), b: CC_A[(T_A,T_A)]) extends T_A
case class CC_C[D](a: D) extends T_B[CC_B, D]
case class CC_D(a: CC_B, b: CC_A[Boolean], c: CC_A[Char]) extends T_B[CC_B, CC_C[(T_A,CC_B)]]
case class CC_E(a: T_B[CC_B, CC_D]) extends T_B[CC_B, CC_B]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B((_,_), CC_A())) => 1 
}
}