package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D](a: D, b: CC_A[D], c: T_B[D]) extends T_A[D]
case class CC_C(a: (CC_B[Char],CC_B[Char]), b: T_A[CC_A[Int]], c: Int) extends T_B[T_A[T_B[Byte]]]
case class CC_D(a: T_B[(CC_C,CC_C)]) extends T_B[T_A[T_B[Byte]]]
case class CC_E(a: Boolean, b: Boolean) extends T_B[T_A[T_B[Byte]]]

val v_a: CC_A[T_B[T_A[T_B[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
}
}