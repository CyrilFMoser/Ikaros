package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B() extends T_B[T_A[T_B[Boolean]]]
case class CC_C[D](a: CC_B, b: T_A[D], c: T_A[D]) extends T_B[T_A[T_B[Boolean]]]
case class CC_D(a: CC_A[T_B[CC_B]], b: T_B[Byte], c: Boolean) extends T_B[T_A[T_B[Boolean]]]

val v_a: T_B[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_A(), _, _) => 2 
}
}