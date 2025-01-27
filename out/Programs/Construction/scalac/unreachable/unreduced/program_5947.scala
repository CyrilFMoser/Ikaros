package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_A[Byte, Char],Byte), c: T_B[D]) extends T_A[D, T_A[(Boolean,Char), (Char,(Byte,Int))]]
case class CC_B() extends T_B[T_B[CC_A[Byte]]]
case class CC_C(a: T_A[T_A[Char, CC_B], Char], b: CC_B, c: CC_A[T_A[CC_B, CC_B]]) extends T_B[T_B[CC_A[Byte]]]

val v_a: T_B[T_B[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}