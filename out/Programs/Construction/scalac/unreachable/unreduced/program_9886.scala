package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],T_B[Int]), b: T_B[Int], c: Byte) extends T_A[(T_B[Boolean],T_B[Byte])]
case class CC_B(a: T_A[T_B[CC_A]], b: T_B[CC_A]) extends T_A[(T_B[Boolean],T_B[Byte])]
case class CC_C[C](a: T_B[C], b: C, c: T_B[C]) extends T_B[C]
case class CC_D[D](a: T_B[D], b: CC_A) extends T_B[D]
case class CC_E[E](a: T_B[E], b: Byte) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A((_,_), CC_D(_, _), _)) => 1 
  case CC_D(_, CC_A((_,_), CC_E(_, _), _)) => 2 
  case CC_E(_, _) => 3 
}
}
// This is not matched: CC_D(_, CC_A((_,_), CC_C(_, _, _), _))