package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: (T_A[Byte, Char],T_A[Char, Int]), c: Boolean) extends T_A[Boolean, E]
case class CC_B(a: (Int,CC_A[Byte])) extends T_A[Byte, T_A[Boolean, Boolean]]
case class CC_C[F]() extends T_A[Boolean, F]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12, (_,_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, (_,_), _)