package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte) extends T_A[T_B]
case class CC_B(a: T_A[T_A[(Char,Int)]], b: T_A[T_B], c: T_B) extends T_A[T_B]
case class CC_C(a: T_A[CC_B], b: CC_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(0), CC_C(_, _)) => 1 
  case CC_B(_, CC_B(_, CC_A(_), CC_C(_, _)), CC_C(_, _)) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_C(_, _)), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_B(_, CC_A(_), CC_C(_, _))