package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: Int, c: CC_A[D]) extends T_A[D]
case class CC_C[E](a: T_B[E], b: E, c: CC_B[E]) extends T_A[E]
case class CC_D[F](a: CC_A[F], b: (T_B[Byte],CC_C[Int])) extends T_B[CC_B[(Boolean,(Char,Byte))]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_B(_, _, CC_A())