package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_C[F]() extends T_A[F]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
  case CC_C() => 1 
}
}