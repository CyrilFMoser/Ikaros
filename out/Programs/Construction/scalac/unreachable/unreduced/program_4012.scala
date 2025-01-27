package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B[D](a: T_B[T_A[D]]) extends T_A[D]
case class CC_C(a: CC_B[T_A[Int]]) extends T_A[T_A[CC_B[Boolean]]]
case class CC_D(a: Byte) extends T_B[T_A[T_A[CC_C]]]
case class CC_E(a: T_B[T_A[(Int,Byte)]], b: T_A[T_A[CC_D]], c: CC_A[T_B[CC_C]]) extends T_B[T_A[T_A[CC_C]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_B(_) => 1 
}
}