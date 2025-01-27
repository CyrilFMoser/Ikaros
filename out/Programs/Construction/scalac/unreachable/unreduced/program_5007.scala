package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_A[T_B[CC_A]], b: CC_A) extends T_A[T_B[T_A[Boolean]]]
case class CC_C(a: T_B[(CC_B,CC_B)], b: CC_B, c: T_B[T_A[CC_B]]) extends T_B[T_A[CC_B]]
case class CC_D() extends T_B[T_A[CC_B]]
case class CC_E(a: Boolean, b: ((CC_B,CC_C),CC_C), c: CC_C) extends T_B[T_A[CC_B]]

val v_a: T_B[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, CC_A()), CC_C(_, CC_B(_, _), _)) => 0 
  case CC_C(_, CC_B(_, CC_A()), CC_E(true, (_,_), CC_C(_, _, _))) => 1 
  case CC_C(_, CC_B(_, CC_A()), CC_E(false, (_,_), CC_C(_, _, _))) => 2 
  case CC_D() => 3 
  case CC_E(_, ((_,_),CC_C(_, _, _)), CC_C(_, _, _)) => 4 
}
}
// This is not matched: CC_C(_, CC_B(_, CC_A()), CC_D())