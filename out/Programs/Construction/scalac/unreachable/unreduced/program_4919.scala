package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_A[T_A[D, D], D], c: Int) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C[F](a: Char, b: (T_A[Int, Char],T_A[Int, Int])) extends T_A[T_A[F, F], F]
case class CC_D(a: T_B[CC_B[Char]], b: T_A[T_B[Char], T_B[Char]], c: CC_C[T_A[Boolean, Boolean]]) extends T_B[T_A[(Boolean,Int), CC_A[Boolean]]]
case class CC_E(a: Byte, b: T_A[T_A[Int, Int], Int]) extends T_B[T_A[(Boolean,Int), CC_A[Boolean]]]
case class CC_F(a: T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]) extends T_B[T_A[(Boolean,Int), CC_A[Boolean]]]

val v_a: T_B[T_A[(Boolean,Int), CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_E(0, CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_E(0, CC_A(_, CC_B(_), _)) => 1 
  case CC_E(0, CC_A(_, CC_C(_, _), _)) => 2 
  case CC_E(0, CC_B(CC_A(_, _, _))) => 3 
  case CC_E(0, CC_B(CC_B(_))) => 4 
  case CC_E(0, CC_B(CC_C(_, _))) => 5 
  case CC_E(0, CC_C(_, (_,_))) => 6 
  case CC_E(_, CC_A(_, CC_A(_, _, _), _)) => 7 
  case CC_E(_, CC_A(_, CC_B(_), _)) => 8 
  case CC_E(_, CC_A(_, CC_C(_, _), _)) => 9 
  case CC_E(_, CC_B(CC_A(_, _, _))) => 10 
  case CC_E(_, CC_B(CC_B(_))) => 11 
  case CC_E(_, CC_B(CC_C(_, _))) => 12 
  case CC_E(_, CC_C(_, (_,_))) => 13 
  case CC_F(CC_A(_, _, _)) => 14 
  case CC_F(CC_B(CC_A(_, _, _))) => 15 
  case CC_F(CC_B(CC_B(_))) => 16 
  case CC_F(CC_B(CC_C(_, _))) => 17 
  case CC_F(CC_C(_, (_,_))) => 18 
}
}
// This is not matched: CC_D(_, _, _)