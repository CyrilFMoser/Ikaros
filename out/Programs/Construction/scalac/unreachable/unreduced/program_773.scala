package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Int,Int), Byte], (Byte,Byte)], T_A[T_A[Int, Char], T_A[Boolean, Boolean]]]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A]) extends T_A[T_A[T_A[(Int,Int), Byte], (Byte,Byte)], T_A[T_A[Int, Char], T_A[Boolean, Boolean]]]
case class CC_C(a: Byte, b: CC_A, c: Int) extends T_A[Char, CC_A]

val v_a: T_A[T_A[T_A[(Int,Int), Byte], (Byte,Byte)], T_A[T_A[Int, Char], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}