package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, T_B], b: (CC_A[T_B],CC_A[T_B]), c: CC_A[D]) extends T_A[D, T_B]
case class CC_C[E](a: Int, b: Byte, c: CC_A[E]) extends T_A[E, T_B]
case class CC_D(a: CC_B[T_A[T_B, T_B]]) extends T_B
case class CC_E(a: T_A[T_A[T_B, Int], T_B], b: T_A[T_A[CC_D, CC_D], T_B]) extends T_B
case class CC_F(a: CC_B[Char], b: T_A[T_A[Char, Int], T_B], c: T_A[T_A[T_B, T_B], Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_B(CC_B(_, _, _), (_,_), CC_A(_)), CC_B(_, _, _)) => 1 
  case CC_E(CC_B(CC_C(_, _, _), (_,_), CC_A(_)), CC_B(_, _, _)) => 2 
  case CC_E(CC_B(CC_B(_, _, _), (_,_), CC_A(_)), CC_C(_, _, CC_A(_))) => 3 
  case CC_E(CC_B(CC_C(_, _, _), (_,_), CC_A(_)), CC_C(_, _, CC_A(_))) => 4 
  case CC_E(CC_C(_, _, _), CC_C(_, _, CC_A(_))) => 5 
  case CC_F(_, _, CC_A(CC_B(_, _, _))) => 6 
  case CC_F(_, _, CC_A(CC_C(_, _, _))) => 7 
}
}
// This is not matched: CC_E(CC_C(_, _, _), CC_B(_, _, _))