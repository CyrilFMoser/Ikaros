package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: C, c: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_C(a: CC_A[T_A[(Boolean,Char)]], b: Byte) extends T_A[Int]
case class CC_D(a: Char) extends T_B[(Char,T_A[Int])]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_A(_, _, _), _), _) => 0 
  case CC_B(CC_A(_, CC_C(_, _), _), _, CC_A(CC_C(_, _), CC_C(_, _), _)) => 1 
  case CC_B(CC_B(_, _, _), _, CC_A(CC_C(_, _), CC_C(_, _), _)) => 2 
  case CC_B(CC_A(_, CC_C(_, _), _), _, CC_B(_, _, CC_A(_, _, _))) => 3 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, CC_A(_, _, _))) => 4 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, CC_B(_, _, _))) => 5 
}
}
// This is not matched: CC_B(CC_A(_, CC_C(_, _), _), _, CC_B(_, _, CC_B(_, _, _)))