package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B[D](a: T_B, b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[T_B, T_A[T_B, T_B]], D]
case class CC_C[E](a: T_B, b: T_A[E, E]) extends T_A[T_A[T_B, T_A[T_B, T_B]], E]
case class CC_D(a: (CC_B[Byte],CC_A[T_B]), b: (Boolean,Byte)) extends T_B

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)