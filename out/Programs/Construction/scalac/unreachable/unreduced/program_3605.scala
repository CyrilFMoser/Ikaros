package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Int]]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: T_B[Byte, Int], b: T_B[T_A[CC_A], T_A[(Boolean,Char)]], c: CC_A) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C[E, D]() extends T_B[D, E]
case class CC_D[G, F](a: T_A[F], b: T_B[G, G], c: Boolean) extends T_B[G, F]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C(), _) => 1 
  case CC_D(_, CC_D(_, CC_C(), _), _) => 2 
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 3 
}
}