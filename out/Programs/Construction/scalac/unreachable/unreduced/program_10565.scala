package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B[D](a: (CC_A[Int],T_A[Byte])) extends T_B[D]
case class CC_C[E](a: CC_A[E], b: CC_B[E], c: E) extends T_B[E]
case class CC_D(a: Boolean) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_), CC_B(_)) => 0 
  case CC_C(_, CC_B(_), CC_C(CC_A(_, _), CC_B(_), 0)) => 1 
  case CC_C(_, CC_B(_), CC_C(CC_A(_, _), CC_B(_), _)) => 2 
  case CC_D(_) => 3 
}
}
// This is not matched: CC_B(_)