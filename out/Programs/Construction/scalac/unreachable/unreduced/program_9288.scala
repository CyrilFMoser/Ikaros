package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, (Byte,Byte)], Int], b: T_A[Boolean, T_A[Char, Byte]], c: T_A[T_A[Boolean, Byte], T_A[Char, Int]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Char,Boolean), Char]], Int]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Char,Boolean), Char]], Int]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[(Char,Boolean), Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}