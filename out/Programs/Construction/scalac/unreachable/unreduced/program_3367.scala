package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Boolean],T_A[(Int,Boolean)]), b: C, c: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[Byte]) extends T_B[T_A[T_A[Byte]]]
case class CC_D(a: Boolean, b: T_A[T_A[Int]]) extends T_B[T_A[T_A[Byte]]]
case class CC_E(a: (T_A[CC_D],T_A[CC_D])) extends T_B[T_A[T_A[Byte]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}