package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Byte],T_A[Char]), b: T_A[T_B[Boolean, Boolean]]) extends T_A[Boolean]
case class CC_B[D, E](a: CC_A, b: E) extends T_B[E, D]
case class CC_C[F]() extends T_B[F, ((CC_A,CC_A),T_A[CC_A])]

val v_a: T_B[CC_A, ((CC_A,CC_A),T_A[CC_A])] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A((_,_), _)) => 0 
  case CC_C() => 1 
}
}