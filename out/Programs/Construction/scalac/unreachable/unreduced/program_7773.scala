package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_B[E, T_A[T_A[Byte]]]
case class CC_C[F, G](a: T_B[G, F], b: T_A[G]) extends T_B[F, T_A[T_A[Byte]]]

val v_a: T_B[Int, T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A()) => 0 
  case CC_C(_, _) => 1 
}
}