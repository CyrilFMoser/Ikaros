package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[(Byte,Byte), Int], T_A[Char, (Int,Int)]], C]
case class CC_B[D]() extends T_A[T_A[T_A[(Byte,Byte), Int], T_A[Char, (Int,Int)]], D]
case class CC_C(a: CC_A[T_A[(Boolean,Boolean), Char]], b: Byte, c: CC_B[(Byte,Int)]) extends T_A[T_A[T_A[(Byte,Byte), Int], T_A[Char, (Int,Int)]], CC_A[T_A[Byte, (Int,Int)]]]

val v_a: T_A[T_A[T_A[(Byte,Byte), Int], T_A[Char, (Int,Int)]], CC_A[T_A[Byte, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}