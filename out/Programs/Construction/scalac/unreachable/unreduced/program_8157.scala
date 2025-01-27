package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: C) extends T_A[C]
case class CC_B[D, E](a: T_B[D]) extends T_A[D]
case class CC_C[F](a: Byte) extends T_A[F]
case class CC_D(a: CC_C[(Char,Byte)]) extends T_B[CC_A[T_A[Int]]]
case class CC_E() extends T_B[CC_A[T_A[Int]]]
case class CC_F() extends T_B[CC_A[T_A[Int]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, _)