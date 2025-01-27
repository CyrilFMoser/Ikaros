package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: (T_A[Boolean],Char)) extends T_A[D]
case class CC_C(a: T_A[T_A[Int]], b: T_B[CC_A[Byte]]) extends T_A[T_A[(Int,Byte)]]
case class CC_D(a: T_A[T_A[CC_C]]) extends T_B[T_A[CC_A[CC_C]]]
case class CC_E(a: T_A[CC_C]) extends T_B[T_B[T_A[CC_D]]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_D(CC_B(_, _)) => 1 
}
}