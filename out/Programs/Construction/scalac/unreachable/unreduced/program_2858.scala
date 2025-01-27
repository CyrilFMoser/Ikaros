package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Char, C], b: Byte) extends T_A[Char, C]
case class CC_B[D](a: T_A[D, D], b: T_A[Char, D]) extends T_A[Char, D]
case class CC_C[E](a: T_A[Char, E], b: CC_A[E]) extends T_A[Char, E]
case class CC_D(a: ((T_B,(Boolean,Boolean)),T_A[Char, T_B]), b: T_A[Char, CC_C[T_B]]) extends T_B
case class CC_E(a: Boolean, b: Boolean, c: CC_C[Int]) extends T_B

val v_a: T_A[Char, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_A(CC_C(_, _), _) => 2 
  case CC_B(_, CC_A(_, _)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_C(CC_A(_, _), CC_A(CC_A(_, _), 0)) => 6 
  case CC_C(CC_A(_, _), CC_A(CC_A(_, _), _)) => 7 
  case CC_C(CC_A(_, _), CC_A(CC_B(_, _), 0)) => 8 
  case CC_C(CC_A(_, _), CC_A(CC_B(_, _), _)) => 9 
  case CC_C(CC_A(_, _), CC_A(CC_C(_, _), 0)) => 10 
  case CC_C(CC_A(_, _), CC_A(CC_C(_, _), _)) => 11 
  case CC_C(CC_B(_, CC_A(_, _)), CC_A(CC_A(_, _), 0)) => 12 
  case CC_C(CC_B(_, CC_A(_, _)), CC_A(CC_A(_, _), _)) => 13 
  case CC_C(CC_B(_, CC_A(_, _)), CC_A(CC_B(_, _), 0)) => 14 
  case CC_C(CC_B(_, CC_A(_, _)), CC_A(CC_B(_, _), _)) => 15 
  case CC_C(CC_B(_, CC_A(_, _)), CC_A(CC_C(_, _), 0)) => 16 
  case CC_C(CC_B(_, CC_A(_, _)), CC_A(CC_C(_, _), _)) => 17 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(CC_A(_, _), 0)) => 18 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(CC_A(_, _), _)) => 19 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(CC_B(_, _), 0)) => 20 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(CC_B(_, _), _)) => 21 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(CC_C(_, _), 0)) => 22 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(CC_C(_, _), _)) => 23 
  case CC_C(CC_B(_, CC_C(_, _)), CC_A(CC_A(_, _), 0)) => 24 
  case CC_C(CC_B(_, CC_C(_, _)), CC_A(CC_A(_, _), _)) => 25 
  case CC_C(CC_B(_, CC_C(_, _)), CC_A(CC_B(_, _), 0)) => 26 
  case CC_C(CC_B(_, CC_C(_, _)), CC_A(CC_B(_, _), _)) => 27 
  case CC_C(CC_B(_, CC_C(_, _)), CC_A(CC_C(_, _), 0)) => 28 
  case CC_C(CC_B(_, CC_C(_, _)), CC_A(CC_C(_, _), _)) => 29 
  case CC_C(CC_C(_, _), CC_A(CC_A(_, _), 0)) => 30 
  case CC_C(CC_C(_, _), CC_A(CC_A(_, _), _)) => 31 
  case CC_C(CC_C(_, _), CC_A(CC_B(_, _), 0)) => 32 
  case CC_C(CC_C(_, _), CC_A(CC_C(_, _), 0)) => 33 
  case CC_C(CC_C(_, _), CC_A(CC_C(_, _), _)) => 34 
}
}
// This is not matched: CC_C(CC_C(_, _), CC_A(CC_B(_, _), _))