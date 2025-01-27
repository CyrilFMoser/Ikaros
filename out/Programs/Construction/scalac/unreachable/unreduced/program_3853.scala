package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Int],T_A[Boolean, Char])) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], D]
case class CC_C[E](a: Boolean) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], E]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)