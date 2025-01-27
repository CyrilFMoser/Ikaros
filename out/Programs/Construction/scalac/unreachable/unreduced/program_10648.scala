package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Boolean,Int), T_A[Boolean, (Char,Byte)]], b: (((Int,Int),(Char,Boolean)),T_A[Boolean, Boolean]), c: T_A[Int, T_A[Boolean, Byte]]) extends T_A[T_A[T_A[(Char,Int), Byte], T_A[Int, Byte]], T_A[Int, T_A[Boolean, Char]]]
case class CC_B() extends T_A[T_A[T_A[(Char,Int), Byte], T_A[Int, Byte]], T_A[Int, T_A[Boolean, Char]]]
case class CC_C() extends T_A[T_A[T_A[(Char,Int), Byte], T_A[Int, Byte]], T_A[Int, T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[(Char,Int), Byte], T_A[Int, Byte]], T_A[Int, T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}