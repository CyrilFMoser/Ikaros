package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[T_A[Byte, (Int,Byte)], T_A[Byte, Char]], c: Int) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], T_A[T_A[Int, (Byte,Boolean)], (Int,Char)]]
case class CC_B(a: (Int,Int), b: (CC_A,CC_A), c: T_A[T_A[Char, CC_A], Boolean]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], T_A[T_A[Int, (Byte,Boolean)], (Int,Char)]]
case class CC_C() extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], T_A[T_A[Int, (Byte,Boolean)], (Int,Char)]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], T_A[T_A[Int, (Byte,Boolean)], (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}