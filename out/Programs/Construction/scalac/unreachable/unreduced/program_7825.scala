package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E, c: T_A[Boolean, T_A[E, Char]]) extends T_A[E, (T_A[Byte, Byte],T_A[Byte, Boolean])]
case class CC_B[F]() extends T_A[F, (T_A[Byte, Byte],T_A[Byte, Boolean])]
case class CC_C[G](a: T_B[G, G]) extends T_B[G, Boolean]
case class CC_D(a: CC_C[CC_B[Boolean]], b: CC_C[T_B[Boolean, (Boolean,Int)]]) extends T_B[CC_A[CC_A[Int]], Boolean]
case class CC_E[H](a: T_A[H, Boolean], b: CC_C[H]) extends T_B[H, Boolean]

val v_a: T_A[T_B[CC_A[CC_A[Int]], Boolean], (T_A[Byte, Byte],T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}