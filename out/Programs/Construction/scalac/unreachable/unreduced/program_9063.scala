package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, (T_A[Byte, Byte],T_A[Boolean, Int])]
case class CC_B[D](a: Int) extends T_A[D, (T_A[Byte, Byte],T_A[Boolean, Int])]
case class CC_C[E](a: Int, b: CC_A[E], c: CC_B[E]) extends T_A[E, (T_A[Byte, Byte],T_A[Boolean, Int])]

val v_a: T_A[Boolean, (T_A[Byte, Byte],T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_A(_, _, _), CC_B(12)) => 2 
  case CC_C(_, CC_A(_, _, _), CC_B(_)) => 3 
}
}