package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_B[T_B[(Int,Byte)]]]
case class CC_B[D](a: Char, b: CC_A[D]) extends T_A[D]
case class CC_C[E](a: E, b: CC_A[E], c: T_A[E]) extends T_A[E]
case class CC_D(a: T_A[T_A[Int]]) extends T_B[T_A[CC_B[Byte]]]
case class CC_E(a: T_A[T_A[(Int,Int)]], b: T_A[T_B[CC_D]]) extends T_B[T_A[CC_B[Byte]]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_, CC_A()), CC_B(_, CC_A())) => 0 
  case CC_E(CC_C(CC_B(_, _), CC_A(), _), CC_B(_, CC_A())) => 1 
  case CC_E(CC_C(CC_C(_, _, _), CC_A(), _), CC_B(_, CC_A())) => 2 
  case CC_E(CC_B(_, CC_A()), CC_C(_, _, CC_B(_, _))) => 3 
  case CC_E(CC_C(CC_B(_, _), CC_A(), _), CC_C(_, _, CC_B(_, _))) => 4 
  case CC_E(CC_C(CC_C(_, _, _), CC_A(), _), CC_C(_, _, CC_B(_, _))) => 5 
  case CC_E(CC_B(_, CC_A()), CC_C(_, _, CC_C(_, _, _))) => 6 
  case CC_E(CC_C(CC_B(_, _), CC_A(), _), CC_C(_, _, CC_C(_, _, _))) => 7 
  case CC_E(CC_C(CC_C(_, _, _), CC_A(), _), CC_C(_, _, CC_C(_, _, _))) => 8 
}
}