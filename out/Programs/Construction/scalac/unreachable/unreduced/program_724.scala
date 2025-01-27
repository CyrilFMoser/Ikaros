package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[(Byte,Boolean), (Byte,Byte)], CC_A[Int]]) extends T_A[T_A[T_A[CC_A[Byte], CC_A[Boolean]], T_A[CC_A[Byte], CC_A[Boolean]]], T_A[CC_A[Byte], CC_A[Boolean]]]
case class CC_C(a: T_A[T_A[CC_B, CC_B], CC_B], b: Char) extends T_A[T_A[T_A[CC_A[Byte], CC_A[Boolean]], T_A[CC_A[Byte], CC_A[Boolean]]], T_A[CC_A[Byte], CC_A[Boolean]]]

val v_a: T_A[T_A[T_A[CC_A[Byte], CC_A[Boolean]], T_A[CC_A[Byte], CC_A[Boolean]]], T_A[CC_A[Byte], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}