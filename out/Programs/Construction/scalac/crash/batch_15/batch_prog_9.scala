package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Char, b: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C[D](a: T_A[D], b: CC_B[D], c: T_A[D]) extends T_A[D]
case class CC_D() extends T_B
case class CC_E(a: CC_B[CC_C[T_B]], b: (Boolean,CC_B[CC_D]), c: Boolean) extends T_B
case class CC_F() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A('x', CC_A('x', CC_A(_, _))) => 0 
  case CC_A('x', CC_A(_, CC_A(_, _))) => 1 
  case CC_A('x', CC_A('x', CC_B(_))) => 2 
  case CC_A('x', CC_A(_, CC_B(_))) => 3 
  case CC_A('x', CC_A('x', CC_C(_, _, _))) => 4 
  case CC_A('x', CC_A(_, CC_C(_, _, _))) => 5 
  case CC_A('x', CC_B(_)) => 6 
  case CC_A('x', CC_C(CC_A(_, _), CC_B(_), _)) => 7 
  case CC_A('x', CC_C(CC_B(_), CC_B(_), _)) => 8 
  case CC_A('x', CC_C(CC_C(_, _, _), CC_B(_), _)) => 9 
  case CC_A(_, CC_A('x', CC_A(_, _))) => 10 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 11 
  case CC_A(_, CC_A('x', CC_B(_))) => 12 
  case CC_A(_, CC_A(_, CC_B(_))) => 13 
  case CC_A(_, CC_A('x', CC_C(_, _, _))) => 14 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 15 
  case CC_A(_, CC_B(_)) => 16 
  case CC_A(_, CC_C(CC_A(_, _), CC_B(_), _)) => 17 
  case CC_A(_, CC_C(CC_B(_), CC_B(_), _)) => 18 
  case CC_A(_, CC_C(CC_C(_, _, _), CC_B(_), _)) => 19 
  case CC_B(CC_A(_, _)) => 20 
  case CC_B(CC_B(CC_B(_))) => 21 
  case CC_B(CC_B(CC_C(_, _, _))) => 22 
  case CC_B(CC_C(_, _, CC_A(_, _))) => 23 
  case CC_B(CC_C(_, _, CC_B(_))) => 24 
  case CC_B(CC_C(_, _, CC_C(_, _, _))) => 25 
  case CC_C(_, _, _) => 26 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _)))