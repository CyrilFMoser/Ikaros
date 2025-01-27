package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Int]], c: Byte) extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_B(a: Char, b: T_A[CC_A]) extends T_A[CC_A]
case class CC_C(a: Int, b: CC_A, c: CC_A) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B('x', CC_B('x', CC_B(_, _))) => 0 
  case CC_B(_, CC_B('x', CC_B(_, _))) => 1 
  case CC_B('x', CC_B('x', CC_C(_, _, _))) => 2 
  case CC_B(_, CC_B('x', CC_C(_, _, _))) => 3 
  case CC_B('x', CC_B(_, CC_B(_, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_B('x', CC_B(_, CC_C(_, _, _))) => 6 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 7 
  case CC_B('x', CC_C(_, CC_A(_, _, _), CC_A(_, _, _))) => 8 
  case CC_B(_, CC_C(_, CC_A(_, _, _), CC_A(_, _, _))) => 9 
  case CC_C(_, _, _) => 10 
}
}