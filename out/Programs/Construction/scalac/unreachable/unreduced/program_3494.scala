package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Char], T_A[Char, (Char,Int)]], C]
case class CC_B(a: CC_A[(Int,Byte)]) extends T_A[T_A[T_A[Boolean, Char], T_A[Char, (Char,Int)]], T_A[T_A[Byte, Char], CC_A[Char]]]
case class CC_C[D]() extends T_A[T_A[T_A[Boolean, Char], T_A[Char, (Char,Int)]], D]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Char, (Char,Int)]], CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}