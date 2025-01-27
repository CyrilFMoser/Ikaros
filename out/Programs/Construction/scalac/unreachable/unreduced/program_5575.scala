package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_A[Byte, Int]], T_B[T_A[Int, Byte]]]
case class CC_B(a: T_A[T_B[(Int,Byte)], Boolean], b: T_A[T_A[CC_A, (Boolean,Boolean)], T_B[CC_A]], c: T_B[T_A[CC_A, CC_A]]) extends T_A[T_B[T_A[Byte, Int]], T_B[T_A[Int, Byte]]]
case class CC_C(a: Byte, b: Byte) extends T_A[T_B[T_A[Byte, Int]], T_B[T_A[Int, Byte]]]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: E) extends T_B[E]
case class CC_F[F, G](a: T_A[G, G], b: T_B[F]) extends T_B[F]

val v_a: T_A[T_B[T_A[Byte, Int]], T_B[T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)