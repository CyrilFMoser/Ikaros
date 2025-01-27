package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: Byte) extends T_A[T_A[T_A[Char, Byte], ((Int,Byte),Byte)], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]
case class CC_B(a: CC_A, b: Char) extends T_A[T_A[T_A[Char, Byte], ((Int,Byte),Byte)], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]
case class CC_C(a: T_A[CC_A, CC_B]) extends T_A[T_A[T_A[Char, Byte], ((Int,Byte),Byte)], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[Char, Byte], ((Int,Byte),Byte)], T_A[T_A[Byte, Int], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), 'x') => 1 
  case CC_B(CC_A(_, _), _) => 2 
  case CC_C(_) => 3 
}
}