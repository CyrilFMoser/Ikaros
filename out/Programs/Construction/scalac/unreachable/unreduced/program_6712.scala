package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: (T_A[Int],T_A[(Boolean,Boolean)]), c: Int) extends T_A[(T_A[Byte],Byte)]
case class CC_B(a: CC_A) extends T_A[(T_A[Byte],Byte)]
case class CC_C(a: T_A[CC_A], b: CC_A, c: T_A[Boolean]) extends T_A[(T_A[Byte],Byte)]

val v_a: T_A[(T_A[Byte],Byte)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_A(_, _, _)