package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_A[D, T_B[D]]) extends T_A[((Byte,Char),T_A[Byte, Int]), D]
case class CC_B() extends T_B[T_B[T_A[Boolean, Char]]]
case class CC_C(a: CC_A[T_B[(Boolean,Boolean)]], b: T_A[T_A[CC_B, CC_B], CC_A[CC_B]], c: CC_B) extends T_B[T_B[T_A[Boolean, Char]]]

val v_a: T_B[T_B[T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), _, CC_B()) => 1 
}
}