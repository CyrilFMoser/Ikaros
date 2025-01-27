package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[Char]]) extends T_B[Char, T_A[CC_A]]
case class CC_C(a: T_B[Char, T_A[CC_A]], b: CC_A, c: CC_A) extends T_B[Char, T_A[CC_A]]
case class CC_D(a: CC_C, b: CC_B, c: T_A[CC_B]) extends T_B[Char, T_A[CC_A]]

val v_a: T_B[Char, T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_), _, _) => 1 
  case CC_C(CC_C(CC_B(_), CC_A(), CC_A()), _, _) => 2 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(), CC_A()), _, _) => 3 
  case CC_C(CC_C(CC_D(_, _, _), CC_A(), CC_A()), _, _) => 4 
  case CC_C(CC_D(_, CC_B(_), _), _, _) => 5 
  case CC_D(_, _, _) => 6 
}
}