package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]]) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: Char) extends T_A[T_B[T_B[Int]]]
case class CC_C[C](a: T_A[C]) extends T_B[C]
case class CC_D(a: CC_B, b: T_B[CC_B], c: T_B[CC_B]) extends T_B[CC_B]
case class CC_E(a: Byte, b: CC_D) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(_), _, _) => 1 
  case CC_E(_, CC_D(CC_B(_), CC_C(_), CC_C(_))) => 2 
  case CC_E(_, CC_D(CC_B(_), CC_C(_), CC_D(_, _, _))) => 3 
  case CC_E(_, CC_D(CC_B(_), CC_C(_), CC_E(_, _))) => 4 
  case CC_E(_, CC_D(CC_B(_), CC_D(_, _, _), CC_C(_))) => 5 
  case CC_E(_, CC_D(CC_B(_), CC_D(_, _, _), CC_D(_, _, _))) => 6 
  case CC_E(_, CC_D(CC_B(_), CC_D(_, _, _), CC_E(_, _))) => 7 
  case CC_E(_, CC_D(CC_B(_), CC_E(_, _), CC_C(_))) => 8 
  case CC_E(_, CC_D(CC_B(_), CC_E(_, _), CC_E(_, _))) => 9 
}
}
// This is not matched: CC_E(_, CC_D(CC_B(_), CC_E(_, _), CC_D(_, _, _)))