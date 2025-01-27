package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, T_B[E]], b: T_A[E, E], c: Byte) extends T_A[E, T_B[E]]
case class CC_C[F]() extends T_A[F, T_B[F]]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()