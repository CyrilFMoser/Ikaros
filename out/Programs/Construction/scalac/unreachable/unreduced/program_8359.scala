package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F, G](a: G) extends T_A[F, G]
case class CC_C(a: T_B[Int], b: T_A[T_B[Int], (Char,Int)]) extends T_B[Int]
case class CC_D(a: T_A[T_A[CC_C, Boolean], T_B[Int]], b: Boolean, c: T_A[T_B[Int], T_B[Boolean]]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), CC_A()) => 0 
  case CC_C(CC_D(_, true, CC_A()), CC_A()) => 1 
  case CC_C(CC_D(_, true, CC_B(_)), CC_A()) => 2 
  case CC_C(CC_D(_, false, CC_A()), CC_A()) => 3 
  case CC_C(CC_D(_, false, CC_B(_)), CC_A()) => 4 
  case CC_C(CC_C(_, _), CC_B(_)) => 5 
  case CC_C(CC_D(_, true, CC_A()), CC_B(_)) => 6 
  case CC_C(CC_D(_, true, CC_B(_)), CC_B(_)) => 7 
  case CC_C(CC_D(_, false, CC_A()), CC_B(_)) => 8 
  case CC_C(CC_D(_, false, CC_B(_)), CC_B(_)) => 9 
}
}
// This is not matched: CC_D(_, _, _)