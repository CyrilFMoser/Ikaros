package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], T_A[Char, Boolean]], b: T_A[T_A[Boolean, Boolean], (Int,Int)], c: T_A[T_A[Byte, Int], T_A[Byte, Char]]) extends T_A[(T_A[Char, Int],Boolean), T_A[Byte, T_A[Byte, (Int,Char)]]]
case class CC_B() extends T_A[(T_A[Char, Int],Boolean), T_A[Byte, T_A[Byte, (Int,Char)]]]
case class CC_C[C](a: C, b: T_A[C, C], c: CC_A) extends T_A[C, T_A[T_A[CC_A, CC_A], Boolean]]

val v_a: T_A[(T_A[Char, Int],Boolean), T_A[Byte, T_A[Byte, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}