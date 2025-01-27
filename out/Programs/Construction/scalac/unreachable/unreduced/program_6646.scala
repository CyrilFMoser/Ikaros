package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_B(a: CC_A, b: T_A[(CC_A,(Byte,Int))], c: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_C(a: CC_A, b: T_B[CC_B, Char], c: T_A[(Int,CC_B)]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_D[D](a: (CC_B,T_B[Byte, CC_A]), b: Char) extends T_B[D, CC_A]

val v_a: T_A[T_A[T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}