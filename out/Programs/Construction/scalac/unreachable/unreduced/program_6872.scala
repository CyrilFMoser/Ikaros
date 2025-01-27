package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Byte], T_A[Byte, (Int,Byte)]], b: T_A[(Boolean,Char), T_A[Byte, (Int,Boolean)]], c: T_A[T_A[(Char,Boolean), Int], Char]) extends T_A[T_A[T_A[Int, Boolean], (Char,Byte)], T_A[T_A[Int, Byte], T_A[Int, Char]]]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], (Char,Byte)], T_A[T_A[Int, Byte], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[Int, Boolean], (Char,Byte)], T_A[T_A[Int, Byte], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}