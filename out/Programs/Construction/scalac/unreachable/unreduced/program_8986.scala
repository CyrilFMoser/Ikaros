package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[T_A[Byte, Int], T_A[Byte, Char]]]
case class CC_B(a: T_A[Byte, CC_A]) extends T_A[Int, T_A[T_A[Byte, Int], T_A[Byte, Char]]]
case class CC_C(a: Byte) extends T_A[Int, T_A[T_A[Byte, Int], T_A[Byte, Char]]]

val v_a: T_A[Int, T_A[T_A[Byte, Int], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}