package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Char], T_B[Int, Byte]]) extends T_A[T_A[T_B[Boolean, Int]]]
case class CC_B() extends T_A[T_A[T_B[Boolean, Int]]]
case class CC_C[D, E](a: E, b: Int, c: T_A[D]) extends T_B[E, D]
case class CC_D[F](a: F, b: F, c: ((CC_A,CC_B),CC_A)) extends T_B[F, CC_A]

val v_a: T_A[T_A[T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_B() => 1 
}
}