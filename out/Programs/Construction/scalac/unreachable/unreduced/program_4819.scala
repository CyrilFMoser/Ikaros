package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], C]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], T_A[(Char,Byte), T_A[Char, (Int,Char)]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[(Char,Int), Boolean]], T_A[(Char,Byte), T_A[Char, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}