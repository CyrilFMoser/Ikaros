package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_B[T_B[CC_A]], b: Boolean, c: T_B[T_B[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (T_A[Char],Int)) extends T_B[CC_B]
case class CC_D[C](a: Int, b: CC_B, c: C) extends T_B[C]
case class CC_E(a: CC_C, b: T_B[Byte]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _, _), CC_B(CC_D(_, _, _), _, _)) => 0 
  case CC_E(CC_C((_,_)), _) => 1 
}
}
// This is not matched: CC_C((_,_))