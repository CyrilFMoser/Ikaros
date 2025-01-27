package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, T_A[(Char,Byte), C]]]
case class CC_B(a: CC_A[(Boolean,Boolean)]) extends T_A[Boolean, T_A[Boolean, T_A[(Char,Byte), Boolean]]]
case class CC_C(a: T_A[CC_B, CC_B]) extends T_A[T_A[CC_A[CC_B], CC_A[CC_B]], T_A[T_A[CC_A[CC_B], CC_A[CC_B]], T_A[(Char,Byte), T_A[CC_A[CC_B], CC_A[CC_B]]]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[(Char,Byte), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}