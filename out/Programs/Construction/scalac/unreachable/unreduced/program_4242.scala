package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[T_B[T_B[Int]]]) extends T_A[C]
case class CC_B[E](a: T_B[E]) extends T_A[E]
case class CC_C(a: (T_A[Boolean],CC_A[Boolean]), b: T_A[T_A[Int]], c: Boolean) extends T_B[T_B[CC_A[Boolean]]]
case class CC_D(a: Char, b: CC_B[CC_B[CC_C]], c: T_A[T_A[CC_C]]) extends T_B[T_B[CC_A[Boolean]]]
case class CC_E(a: Char) extends T_B[T_B[CC_A[Boolean]]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_C((_,_), CC_A(_, _), _), _) => 0 
  case CC_A(CC_C((_,_), CC_B(_), _), _) => 1 
  case CC_B(_) => 2 
}
}