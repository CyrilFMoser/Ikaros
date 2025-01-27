package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[E, D], b: T_A[D]) extends T_A[D]
case class CC_B[F]() extends T_A[F]
case class CC_C[G]() extends T_B[G, T_B[G, (Byte,Int)]]
case class CC_D(a: T_A[T_B[Byte, Byte]]) extends T_B[Int, T_B[Int, (Byte,Int)]]

val v_a: T_B[Int, T_B[Int, (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_A(_, _))) => 1 
  case CC_D(CC_A(_, CC_B())) => 2 
  case CC_D(CC_B()) => 3 
}
}