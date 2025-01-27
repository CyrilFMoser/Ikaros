package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D]) extends T_A[D, T_A[T_B[Char], Byte]]
case class CC_B() extends T_B[CC_A[T_A[Byte, Boolean]]]
case class CC_C(a: (T_A[Boolean, CC_B],T_B[Char]), b: CC_B) extends T_B[CC_A[T_A[Byte, Boolean]]]

val v_a: T_B[CC_A[T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_), CC_B()) => 1 
}
}