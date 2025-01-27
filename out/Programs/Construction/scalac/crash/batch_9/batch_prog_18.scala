package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (T_A[Char],Int), b: B) extends T_A[B]
case class CC_B[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A((_,_), _)) => 1 
  case CC_B(_, CC_B(12, CC_A(_, _))) => 2 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 3 
  case CC_B(_, CC_B(12, CC_B(_, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(12, CC_C())) => 6 
  case CC_B(_, CC_B(_, CC_C())) => 7 
  case CC_B(_, CC_C()) => 8 
}
}
// This is not matched: CC_C()