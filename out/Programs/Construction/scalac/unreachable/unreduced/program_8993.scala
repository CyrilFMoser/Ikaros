package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], Boolean], b: Byte, c: T_A[T_A[Boolean, Char], T_A[Int, (Byte,Char)]]) extends T_A[T_A[T_A[Char, Int], T_A[Char, (Int,Byte)]], T_A[T_A[Char, Byte], Int]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Char, Int], T_A[Char, (Int,Byte)]], T_A[T_A[Char, Byte], Int]]
case class CC_C() extends T_A[T_A[T_A[Char, Int], T_A[Char, (Int,Byte)]], T_A[T_A[Char, Byte], Int]]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, (Int,Byte)]], T_A[T_A[Char, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}