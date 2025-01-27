package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Boolean]], c: Byte) extends T_A[Byte]
case class CC_B(a: CC_A, b: (T_A[CC_A],(CC_A,CC_A)), c: T_B[Boolean]) extends T_A[Byte]
case class CC_C(a: T_A[T_A[Int]], b: CC_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_B(CC_A(_, _, _), (_,_), _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)