package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: D) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_A[E]
case class CC_C(a: T_A[T_A[Boolean]], b: T_B[CC_A[Byte], CC_B[Boolean]]) extends T_B[CC_A[Byte], CC_B[Boolean]]
case class CC_D() extends T_B[CC_A[Byte], CC_B[Boolean]]

val v_a: T_B[CC_A[Byte], CC_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, CC_A(_, _, _)), CC_C(_, _)) => 0 
  case CC_C(CC_A(_, _, CC_A(_, _, _)), CC_D()) => 1 
  case CC_C(CC_A(_, _, CC_B(_)), CC_D()) => 2 
  case CC_C(CC_B(_), CC_C(_, _)) => 3 
  case CC_C(CC_B(_), CC_D()) => 4 
  case CC_D() => 5 
}
}
// This is not matched: CC_C(CC_A(_, _, CC_B(_)), CC_C(_, _))