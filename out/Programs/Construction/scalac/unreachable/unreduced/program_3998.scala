package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Boolean)]], b: T_A[Char], c: T_A[T_A[Int]]) extends T_A[Char]
case class CC_B[B](a: Byte, b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[CC_A], b: Int) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B(_, CC_C(_, _))