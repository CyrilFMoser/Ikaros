package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: T_A[E, E]) extends T_A[E, T_A[Boolean, T_A[Boolean, (Char,Boolean)]]]
case class CC_B[G, F]() extends T_B[G, F]
case class CC_C[I, H](a: T_B[I, I], b: T_B[H, H]) extends T_B[I, H]
case class CC_D[K, J](a: K, b: CC_A[J], c: T_B[J, J]) extends T_B[K, J]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_A(0, _), CC_B()) => 2 
  case CC_D(_, CC_A(0, _), CC_C(CC_B(), _)) => 3 
  case CC_D(_, CC_A(0, _), CC_C(CC_C(_, _), _)) => 4 
  case CC_D(_, CC_A(0, _), CC_C(CC_D(_, _, _), _)) => 5 
  case CC_D(_, CC_A(0, _), CC_D(_, CC_A(_, _), CC_B())) => 6 
  case CC_D(_, CC_A(0, _), CC_D(_, CC_A(_, _), CC_C(_, _))) => 7 
  case CC_D(_, CC_A(0, _), CC_D(_, CC_A(_, _), CC_D(_, _, _))) => 8 
  case CC_D(_, CC_A(_, _), CC_B()) => 9 
  case CC_D(_, CC_A(_, _), CC_C(CC_B(), _)) => 10 
  case CC_D(_, CC_A(_, _), CC_C(CC_C(_, _), _)) => 11 
  case CC_D(_, CC_A(_, _), CC_C(CC_D(_, _, _), _)) => 12 
  case CC_D(_, CC_A(_, _), CC_D(_, CC_A(_, _), CC_B())) => 13 
  case CC_D(_, CC_A(_, _), CC_D(_, CC_A(_, _), CC_D(_, _, _))) => 14 
}
}
// This is not matched: CC_D(_, CC_A(_, _), CC_D(_, CC_A(_, _), CC_C(_, _)))