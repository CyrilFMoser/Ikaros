package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Byte, (Char,Boolean)]], b: T_A[(Boolean,Boolean), (Int,Char)], c: T_A[T_A[Char, Byte], T_A[(Boolean,Byte), Int]]) extends T_A[T_A[T_A[Byte, Char], (Boolean,Boolean)], T_A[Char, Int]]
case class CC_B() extends T_A[T_A[T_A[Byte, Char], (Boolean,Boolean)], T_A[Char, Int]]

val v_a: T_A[T_A[T_A[Byte, Char], (Boolean,Boolean)], T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}