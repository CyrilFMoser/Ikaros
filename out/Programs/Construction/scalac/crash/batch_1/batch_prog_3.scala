package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_A[C]) extends T_A[C]
case class CC_B[D, E](a: T_B[E]) extends T_A[D]
case class CC_C[F](a: T_A[F], b: (T_A[Int],T_B[Int])) extends T_B[T_B[(Boolean,Byte)]]
case class CC_D(a: Boolean, b: CC_A[CC_B[Int, Byte]]) extends T_B[T_B[(Boolean,Byte)]]
case class CC_E(a: Char, b: T_A[CC_C[CC_D]]) extends T_B[T_B[(Boolean,Byte)]]

val v_a: T_B[T_B[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_E(_, _)