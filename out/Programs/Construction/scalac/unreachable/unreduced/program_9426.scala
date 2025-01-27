package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[(Char,Char)], D]
case class CC_B[E](a: E, b: (T_B[Int],T_B[Byte]), c: E) extends T_B[E]
case class CC_C() extends T_B[T_A[T_B[Byte], T_B[Int]]]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[T_A[T_B[Byte], T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C()