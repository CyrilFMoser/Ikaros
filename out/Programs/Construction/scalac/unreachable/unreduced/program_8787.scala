package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],Int), b: T_A[(Char,Char)], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: T_A[(CC_B,Byte)]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _) => 2 
}
}