package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Byte,Byte), T_A[Boolean, Boolean]]]
case class CC_B[D](a: T_A[CC_A[D], CC_A[D]], b: CC_A[CC_A[D]]) extends T_A[D, T_A[(Byte,Byte), T_A[Boolean, Boolean]]]

val v_a: T_A[Int, T_A[(Byte,Byte), T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}