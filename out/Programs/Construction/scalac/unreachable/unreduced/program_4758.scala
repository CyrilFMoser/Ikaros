package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Byte,Char)]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_B[Int], b: T_A[T_B[CC_A]], c: T_A[T_B[CC_A]]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_B[T_A[(Byte,Int)]]) extends T_A[T_A[T_A[Int]]]
case class CC_D[C](a: Boolean, b: CC_A, c: C) extends T_B[C]
case class CC_E[D](a: D, b: T_B[D]) extends T_B[D]

val v_a: T_B[T_A[T_A[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_), CC_D(_, _, _)) => 0 
  case CC_E(CC_B(CC_D(_, _, _), _, _), CC_D(_, _, _)) => 1 
  case CC_E(CC_B(CC_E(_, _), _, _), CC_D(_, _, _)) => 2 
  case CC_E(CC_C(_), CC_D(_, _, _)) => 3 
  case CC_E(CC_A(_), CC_E(_, _)) => 4 
  case CC_E(CC_B(CC_D(_, _, _), _, _), CC_E(_, _)) => 5 
  case CC_E(CC_B(CC_E(_, _), _, _), CC_E(_, _)) => 6 
  case CC_E(CC_C(_), CC_E(_, _)) => 7 
}
}
// This is not matched: CC_D(_, CC_A(_), _)