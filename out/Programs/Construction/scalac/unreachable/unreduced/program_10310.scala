package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E], c: T_A[E, T_B[E, E]]) extends T_A[E, T_B[E, E]]
case class CC_B[F]() extends T_B[F, T_B[T_A[Byte, Int], T_A[Char, (Boolean,Int)]]]
case class CC_C(a: CC_B[(Boolean,Byte)]) extends T_B[CC_A[CC_A[Boolean]], CC_A[(Boolean,Byte)]]
case class CC_D(a: CC_C, b: CC_C, c: T_A[T_A[CC_C, CC_C], T_B[T_A[CC_C, CC_C], T_A[CC_C, CC_C]]]) extends T_B[CC_A[CC_A[Boolean]], CC_A[(Boolean,Byte)]]

val v_a: T_B[CC_A[CC_A[Boolean]], CC_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(CC_C(_), CC_C(CC_B()), CC_A(_, _, CC_A(_, _, _))) => 1 
}
}