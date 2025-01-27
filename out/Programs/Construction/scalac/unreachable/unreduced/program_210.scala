package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: (Int,(CC_A,CC_A)), b: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_A[CC_A], b: Byte) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)