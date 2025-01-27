package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, Char], b: T_A[T_B[Byte, Byte]]) extends T_A[T_B[(Int,Boolean), T_B[Int, Byte]]]
case class CC_B() extends T_A[T_B[(Int,Boolean), T_B[Int, Byte]]]
case class CC_C[D](a: T_B[D, D]) extends T_A[T_B[(Int,Boolean), T_B[Int, Byte]]]
case class CC_D[E]() extends T_B[E, CC_A]
case class CC_E[F](a: T_B[Int, CC_A], b: Int) extends T_B[F, CC_A]

val v_a: T_A[T_B[(Int,Boolean), T_B[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}