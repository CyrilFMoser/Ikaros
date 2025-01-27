package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Boolean, b: T_A[T_A[F, F], F]) extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, H], b: T_A[G, G]) extends T_A[G, H]
case class CC_C(a: T_A[Boolean, CC_A[(Byte,Char), Byte]], b: CC_A[T_A[Boolean, Int], T_A[Boolean, Boolean]]) extends T_A[T_B[(Boolean,Boolean), Int], CC_B[Boolean, CC_B[Byte, Char]]]

val v_a: CC_A[Boolean, T_A[T_B[(Boolean,Boolean), Int], CC_B[Boolean, CC_B[Byte, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 1 
  case CC_A(_, CC_B(_, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_A()