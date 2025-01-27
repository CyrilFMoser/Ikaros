package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[Boolean, T_B[T_A[Boolean, Boolean]]], c: T_A[D, D]) extends T_A[Boolean, D]
case class CC_B[F]() extends T_A[Boolean, F]
case class CC_C[G](a: CC_B[G]) extends T_A[Boolean, G]
case class CC_D(a: CC_A[T_A[Boolean, Boolean]], b: T_B[Byte], c: CC_A[CC_A[Byte]]) extends T_B[Byte]
case class CC_E() extends T_B[Byte]

val v_a: T_A[Boolean, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}