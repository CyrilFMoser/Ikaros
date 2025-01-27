package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B, c: Char) extends T_A[C, T_A[C, Byte]]
case class CC_B[D, E](a: (T_A[Boolean, Char],T_A[T_B, T_B])) extends T_A[D, T_A[D, Byte]]
case class CC_C(a: T_A[T_A[(Char,Boolean), (Byte,Boolean)], CC_B[Int, T_B]]) extends T_B
case class CC_D(a: CC_A[CC_B[T_B, T_B]], b: Char) extends T_B

val v_a: T_A[T_B, T_A[T_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), CC_C(_), _) => 0 
  case CC_A(CC_C(_), CC_D(_, _), _) => 1 
  case CC_A(CC_D(CC_A(_, _, _), _), CC_C(_), _) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_A(CC_D(CC_A(_, _, _), _), CC_D(_, _), _)