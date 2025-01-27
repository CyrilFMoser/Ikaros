package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: ((Byte,Boolean),(Byte,(Int,Char)))) extends T_A[T_A[T_A[(Boolean,Boolean), Byte], T_B[Char, Boolean]], E]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Boolean), Byte], T_B[Char, Boolean]], (T_A[Char, Int],Byte)]
case class CC_C[F](a: CC_B) extends T_B[CC_A[CC_B], F]
case class CC_D[H, G](a: Boolean, b: T_A[G, H], c: H) extends T_B[G, H]

val v_a: T_B[CC_A[CC_B], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(_, _, _) => 1 
}
}