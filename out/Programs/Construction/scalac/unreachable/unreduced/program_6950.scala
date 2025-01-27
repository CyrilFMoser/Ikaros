package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_B[(CC_A,CC_A)], c: T_B[T_A[Char]]) extends T_A[Char]
case class CC_C[C](a: C, b: T_A[Char], c: T_A[C]) extends T_B[C]
case class CC_D(a: T_B[T_A[Char]]) extends T_B[T_A[T_B[Char]]]
case class CC_E() extends T_B[T_A[T_B[Char]]]

val v_a: T_B[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_C(_, CC_B(CC_A(_), _, _), _) => 1 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), _) => 2 
  case CC_D(CC_C(CC_A(_), CC_A(_), _)) => 3 
  case CC_D(CC_C(CC_A(_), CC_B(_, _, _), _)) => 4 
  case CC_D(CC_C(CC_B(_, _, _), CC_A(_), _)) => 5 
  case CC_E() => 6 
}
}
// This is not matched: CC_D(CC_C(CC_B(_, _, _), CC_B(_, _, _), _))