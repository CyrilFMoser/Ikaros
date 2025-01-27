package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B() extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: CC_B, b: CC_B, c: T_A[CC_A[CC_B]]) extends T_B[Boolean]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}