package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[T_A[Boolean]], c: T_A[T_A[Byte]]) extends T_A[T_A[Boolean]]
case class CC_B(a: (CC_A,T_A[Byte]), b: T_A[CC_A]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: CC_A, c: Byte) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_C(CC_B(_, _), CC_A(_, _, _), _), _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_A(_, CC_B((_,_), _), _)