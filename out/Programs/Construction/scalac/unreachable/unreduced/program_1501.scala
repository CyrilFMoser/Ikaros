package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[(Byte,Int), Boolean], T_A[Char, (Boolean,Int)]], T_A[T_A[Byte, Byte], T_A[Int, Char]]]
case class CC_B() extends T_A[T_A[T_A[(Byte,Int), Boolean], T_A[Char, (Boolean,Int)]], T_A[T_A[Byte, Byte], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[(Byte,Int), Boolean], T_A[Char, (Boolean,Int)]], T_A[T_A[Byte, Byte], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}