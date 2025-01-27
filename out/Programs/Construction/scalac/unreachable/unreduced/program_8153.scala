package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C], c: C) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: CC_B[T_B[Byte]], b: Char, c: T_A[T_A[Char]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_E(a: Int) extends T_B[T_A[T_A[Boolean]]]
case class CC_F(a: CC_C[Int], b: T_A[T_B[CC_E]], c: T_A[CC_B[CC_E]]) extends T_B[T_A[T_A[Boolean]]]

val v_a: T_B[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_D(CC_B(), _, CC_A(_, _, CC_B())) => 1 
  case CC_D(CC_B(), _, CC_A(_, _, CC_C())) => 2 
  case CC_D(CC_B(), _, CC_C()) => 3 
  case CC_E(_) => 4 
  case CC_F(CC_C(), _, _) => 5 
}
}
// This is not matched: CC_D(CC_B(), _, CC_B())