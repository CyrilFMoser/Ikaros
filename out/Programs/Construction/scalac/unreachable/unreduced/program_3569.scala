package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Boolean, T_A[T_A[(Byte,Char), Byte], T_A[Int, Int]]]
case class CC_B(a: T_B[T_B[CC_A, Char], T_B[(Int,Int), Byte]]) extends T_A[Boolean, T_A[T_A[(Byte,Char), Byte], T_A[Int, Int]]]
case class CC_C[E](a: E, b: T_B[E, E], c: CC_B) extends T_B[E, CC_B]
case class CC_D[F](a: Byte) extends T_B[F, CC_B]

val v_a: T_B[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(0, _, CC_B(_)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_, _, CC_B(_))