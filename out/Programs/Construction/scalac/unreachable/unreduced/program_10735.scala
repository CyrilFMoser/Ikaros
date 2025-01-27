package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(Char,T_A[Boolean, Byte]), C]
case class CC_B[D](a: (T_A[Byte, Byte],T_A[Int, Int])) extends T_A[(Char,T_A[Boolean, Byte]), D]
case class CC_C[E](a: Boolean, b: CC_B[E], c: T_A[E, E]) extends T_A[(Char,T_A[Boolean, Byte]), E]

val v_a: T_A[(Char,T_A[Boolean, Byte]), Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}