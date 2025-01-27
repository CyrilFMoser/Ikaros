package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Boolean, (Byte,Int)], T_A[Char, Char]], Int]
case class CC_B(a: (CC_A,CC_A)) extends T_A[T_A[T_A[Boolean, (Byte,Int)], T_A[Char, Char]], Int]

val v_a: T_A[T_A[T_A[Boolean, (Byte,Int)], T_A[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}