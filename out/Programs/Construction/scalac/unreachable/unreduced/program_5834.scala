package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Int]], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_B(a: CC_A, b: Boolean, c: Char) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_C(CC_C(_, _), CC_A(_, _, _))