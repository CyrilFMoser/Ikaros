package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: T_B[T_A[Byte]]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: Boolean) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: T_A[C], b: CC_A) extends T_B[C]
case class CC_E[D](a: T_B[D]) extends T_B[D]
case class CC_F[E, F]() extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, CC_D(_, _))) => 0 
  case CC_D(_, CC_A(_, CC_E(_))) => 1 
  case CC_E(_) => 2 
  case CC_F() => 3 
}
}
// This is not matched: CC_D(_, CC_A(_, CC_F()))