package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, (Byte,Int)]], T_A[T_A[Int, Int], T_A[Char, Byte]]]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, (Byte,Int)]], T_A[T_A[Int, Int], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, (Byte,Int)]], T_A[T_A[Int, Int], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}