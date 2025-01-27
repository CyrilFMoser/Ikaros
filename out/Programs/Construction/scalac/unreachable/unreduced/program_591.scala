package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, (Char,Byte)], T_A[Byte, (Char,Int)]], b: T_A[T_A[Int, Char], Char], c: T_A[Int, T_A[Byte, Byte]]) extends T_A[T_A[T_A[Boolean, (Int,Int)], T_A[Byte, Int]], T_A[T_A[Boolean, Char], T_A[Char, Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Boolean, (Int,Int)], T_A[Byte, Int]], T_A[T_A[Boolean, Char], T_A[Char, Int]]]
case class CC_C() extends T_A[T_A[T_A[Boolean, (Int,Int)], T_A[Byte, Int]], T_A[T_A[Boolean, Char], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Boolean, (Int,Int)], T_A[Byte, Int]], T_A[T_A[Boolean, Char], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}