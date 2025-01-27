package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: T_B[T_A[Boolean], T_B[Byte, Int]], b: T_A[T_B[Boolean, Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]
case class CC_D[E](a: CC_B, b: E, c: CC_A[E]) extends T_B[E, CC_A[T_A[CC_B]]]
case class CC_E[F](a: T_A[F]) extends T_B[F, CC_A[T_A[CC_B]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C())) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(CC_C())