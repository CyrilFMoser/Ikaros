package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: C) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: T_B[CC_A[Boolean]]) extends T_A[T_B[T_A[Byte]]]
case class CC_C(a: Boolean, b: (CC_B,CC_B)) extends T_A[T_B[T_A[Byte]]]
case class CC_D() extends T_B[Boolean]
case class CC_E(a: CC_A[CC_A[CC_D]], b: Boolean) extends T_B[(Int,Char)]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, (CC_B(_),CC_B(_)))