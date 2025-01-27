package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Byte,Char), Char], Int]) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], T_A[(Char,Char), T_A[Byte, Byte]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], T_A[(Char,Char), T_A[Byte, Byte]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], T_A[(Char,Char), T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], T_A[(Char,Char), T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
}
}