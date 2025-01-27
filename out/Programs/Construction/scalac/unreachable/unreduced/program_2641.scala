package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[Byte]), b: T_B, c: Byte) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B, b: T_B, c: Char) extends T_A[T_A[T_A[T_B]]]

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, 0) => 0 
  case CC_A((_,_), _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}