package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[T_A[C, C], C]) extends T_A[T_A[Int, T_A[Int, Byte]], C]
case class CC_B[D, E](a: (CC_A[Byte],(Byte,Boolean)), b: T_A[E, E], c: CC_A[E]) extends T_A[T_A[Int, T_A[Int, Byte]], D]

val v_a: T_A[T_A[Int, T_A[Int, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}