package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[T_A[Char, Byte], T_A[Int, Byte]]]
case class CC_B(a: Byte, b: Char, c: T_A[Int, (Char,CC_A)]) extends T_A[Int, T_A[T_A[Char, Byte], T_A[Int, Byte]]]
case class CC_C(a: Boolean, b: T_A[T_A[CC_B, (Char,Byte)], T_A[Char, Int]], c: CC_B) extends T_A[Int, T_A[T_A[Char, Byte], T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[T_A[Char, Byte], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _, CC_B(_, _, _)) => 3 
}
}