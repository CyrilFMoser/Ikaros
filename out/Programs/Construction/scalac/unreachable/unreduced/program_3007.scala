package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Boolean]], C]
case class CC_B[D](a: T_A[D, CC_A[D]]) extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Boolean]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Boolean]], E]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[(Boolean,Char), Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()