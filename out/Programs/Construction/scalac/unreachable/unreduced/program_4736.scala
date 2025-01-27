package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[T_A[Boolean, (Int,Boolean)], T_A[Int, Int]]) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Byte, Int]], T_A[T_A[(Char,Boolean), Int], T_A[Boolean, (Char,Char)]]]
case class CC_B(a: T_A[Char, Byte]) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Byte, Int]], T_A[T_A[(Char,Boolean), Int], T_A[Boolean, (Char,Char)]]]
case class CC_C(a: Int) extends T_A[T_A[T_A[Char, (Int,Int)], T_A[Byte, Int]], T_A[T_A[(Char,Boolean), Int], T_A[Boolean, (Char,Char)]]]

val v_a: T_A[T_A[T_A[Char, (Int,Int)], T_A[Byte, Int]], T_A[T_A[(Char,Boolean), Int], T_A[Boolean, (Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}