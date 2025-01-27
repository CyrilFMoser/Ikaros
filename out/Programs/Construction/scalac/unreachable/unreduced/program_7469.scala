package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Char,Byte), T_A[Boolean, Int]], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[(Char,Byte), T_A[Boolean, Int]], D]
case class CC_C[E](a: CC_B[CC_A[E]], b: CC_B[E]) extends T_A[T_A[(Char,Byte), T_A[Boolean, Int]], E]

val v_a: T_A[T_A[(Char,Byte), T_A[Boolean, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, _)