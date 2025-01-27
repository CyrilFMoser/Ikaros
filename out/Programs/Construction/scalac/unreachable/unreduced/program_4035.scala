package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_A[Byte, Char]]]
case class CC_B[E](a: CC_A[E], b: T_B[E]) extends T_B[E]
case class CC_C[F](a: (T_B[Boolean],T_A[Boolean, Boolean]), b: F, c: CC_B[F]) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(CC_A(), CC_B(_, _))) => 0 
  case CC_B(_, CC_B(CC_A(), CC_C(_, _, _))) => 1 
  case CC_B(_, CC_C((_,_), _, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_C(_, _, _)