package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_B[T_A[Byte]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B() extends T_A[(T_A[CC_A],Byte)]
case class CC_C[C](a: C) extends T_B[C]
case class CC_D(a: (T_A[CC_B],CC_B)) extends T_B[((CC_B,CC_B),CC_B)]
case class CC_E() extends T_B[((CC_B,CC_B),CC_B)]

val v_a: T_B[((CC_B,CC_B),CC_B)] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D((_,CC_B())) => 1 
}
}
// This is not matched: CC_E()