package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_B[Byte, (Boolean,Byte)]]) extends T_A[(T_A[Char],Boolean)]
case class CC_B(a: Byte, b: CC_A) extends T_A[(T_A[Char],Boolean)]
case class CC_C() extends T_A[(T_A[Char],Boolean)]
case class CC_D[D]() extends T_B[D, CC_A]
case class CC_E[E, F](a: (T_A[CC_A],(CC_A,CC_B))) extends T_B[E, F]

val v_a: T_A[(T_A[Char],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()