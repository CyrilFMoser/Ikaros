package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Byte, c: T_A[D, D]) extends T_A[D, T_B[T_B[Boolean]]]
case class CC_B() extends T_B[T_B[CC_A[Byte]]]
case class CC_C[E](a: Boolean, b: E) extends T_B[T_B[CC_A[Byte]]]
case class CC_D(a: T_A[Char, Char], b: T_B[(CC_B,Char)], c: CC_B) extends T_B[T_B[CC_A[Byte]]]

val v_a: T_B[T_B[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _, _) => 2 
}
}