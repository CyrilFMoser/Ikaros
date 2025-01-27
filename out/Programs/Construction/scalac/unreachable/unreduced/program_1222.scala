package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[T_B[(Int,Boolean)]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: (Char,CC_A)) extends T_A[T_B[T_A[Byte]]]
case class CC_C(a: T_B[CC_A], b: T_A[CC_A], c: Boolean) extends T_A[T_B[T_A[Byte]]]
case class CC_D[C](a: CC_C) extends T_B[C]
case class CC_E[D](a: CC_A, b: CC_A, c: D) extends T_B[D]
case class CC_F() extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _), _, CC_B(_)) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_D(CC_C(_, _, _))