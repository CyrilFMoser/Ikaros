package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_A[T_A[Byte]], c: T_B[T_A[Int]]) extends T_A[T_B[T_B[Char]]]
case class CC_B() extends T_A[T_B[T_B[Char]]]
case class CC_C(a: Byte, b: CC_A, c: T_B[(CC_B,CC_A)]) extends T_A[T_B[T_B[Char]]]
case class CC_D[C](a: CC_C, b: CC_A, c: Byte) extends T_B[C]
case class CC_E[D](a: CC_A, b: T_A[D]) extends T_B[D]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_, _, 0)) => 0 
  case CC_A(_, _, CC_D(_, _, _)) => 1 
  case CC_A(_, _, CC_E(CC_A(_, _, _), _)) => 2 
  case CC_B() => 3 
  case CC_C(0, CC_A(_, _, CC_D(_, _, _)), CC_D(CC_C(_, _, _), CC_A(_, _, _), _)) => 4 
  case CC_C(0, CC_A(_, _, CC_D(_, _, _)), CC_E(_, _)) => 5 
  case CC_C(_, CC_A(_, _, CC_D(_, _, _)), CC_E(_, _)) => 6 
  case CC_C(0, CC_A(_, _, CC_E(_, _)), CC_D(CC_C(_, _, _), CC_A(_, _, _), _)) => 7 
  case CC_C(0, CC_A(_, _, CC_E(_, _)), CC_E(_, _)) => 8 
  case CC_C(_, CC_A(_, _, CC_E(_, _)), CC_D(CC_C(_, _, _), CC_A(_, _, _), _)) => 9 
  case CC_C(_, CC_A(_, _, CC_E(_, _)), CC_E(_, _)) => 10 
}
}
// This is not matched: CC_C(_, CC_A(_, _, CC_D(_, _, _)), CC_D(CC_C(_, _, _), CC_A(_, _, _), _))