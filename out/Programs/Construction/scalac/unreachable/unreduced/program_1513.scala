package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[Int]) extends T_A[Int]
case class CC_B[F, E]() extends T_B[E, F]
case class CC_C[G](a: T_A[G], b: G, c: T_B[G, G]) extends T_B[G, CC_B[CC_A[G], G]]
case class CC_D(a: Boolean, b: T_A[Int]) extends T_B[Byte, CC_B[CC_A[Byte], Byte]]

val v_a: T_B[Byte, CC_B[CC_A[Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_B()) => 1 
  case CC_D(_, _) => 2 
}
}