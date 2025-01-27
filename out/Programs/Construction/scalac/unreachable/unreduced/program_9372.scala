package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[(Byte,Byte), T_A[Byte, Char]], c: T_A[T_A[Byte, Byte], T_A[Boolean, Char]]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int]
case class CC_B() extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int]
case class CC_C() extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()