package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: (T_A[Byte],CC_A[Boolean])) extends T_A[CC_A[T_B[(Byte,Byte)]]]
case class CC_C(a: CC_B, b: T_B[Int], c: T_A[CC_A[CC_B]]) extends T_B[CC_A[T_A[CC_B]]]
case class CC_D(a: (CC_C,(CC_B,CC_B))) extends T_B[CC_A[T_A[CC_B]]]
case class CC_E() extends T_B[CC_A[T_A[CC_B]]]

val v_a: T_A[CC_A[T_B[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_) => 1 
}
}