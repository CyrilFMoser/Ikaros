package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: T_A[T_A[Int]]) extends T_B[T_A[CC_A[Byte]]]
case class CC_C(a: (CC_B,T_A[CC_B]), b: T_B[T_A[CC_B]], c: Boolean) extends T_B[T_A[CC_A[Byte]]]

val v_a: T_B[T_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_))) => 0 
  case CC_C((CC_B(_),CC_A(_)), _, _) => 1 
}
}