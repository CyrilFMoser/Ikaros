package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[T_A[Boolean, Byte], (Int,Boolean)]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Char]], T_A[T_A[(Char,Byte), (Byte,Int)], T_A[(Char,Boolean), Boolean]]]
case class CC_B(a: T_A[Byte, CC_A]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Char]], T_A[T_A[(Char,Byte), (Byte,Int)], T_A[(Char,Boolean), Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Char]], T_A[T_A[(Char,Byte), (Byte,Int)], T_A[(Char,Boolean), Boolean]]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Char]], T_A[T_A[(Char,Byte), (Byte,Int)], T_A[(Char,Boolean), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}