package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int, c: Byte) extends T_A[C, T_A[T_A[Byte, Boolean], Char]]
case class CC_B(a: T_A[CC_A[Boolean], T_A[Boolean, Boolean]], b: CC_A[T_A[Char, Char]]) extends T_A[CC_A[CC_A[Int]], T_A[T_A[Byte, Boolean], Char]]
case class CC_C(a: Char, b: CC_B) extends T_A[CC_A[CC_A[Int]], T_A[T_A[Byte, Boolean], Char]]

val v_a: T_A[CC_A[CC_A[Int]], T_A[T_A[Byte, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}