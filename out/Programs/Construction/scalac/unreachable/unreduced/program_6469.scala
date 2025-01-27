package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B(a: T_A[CC_A[Byte], T_B[Int, Byte]], b: CC_A[CC_A[Boolean]], c: T_B[Byte, T_A[Char, Byte]]) extends T_B[CC_A[T_A[Byte, Boolean]], T_A[T_B[(Boolean,Int), (Boolean,Int)], (Boolean,Int)]]
case class CC_C[G, F](a: T_B[F, F], b: T_A[F, G], c: T_A[G, G]) extends T_B[F, G]
case class CC_D() extends T_B[CC_A[T_A[Byte, Boolean]], T_A[T_B[(Boolean,Int), (Boolean,Int)], (Boolean,Int)]]

val v_a: T_B[CC_A[T_A[Byte, Boolean]], T_A[T_B[(Boolean,Int), (Boolean,Int)], (Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}