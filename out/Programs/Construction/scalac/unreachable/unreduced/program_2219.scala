package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[(Int,T_A[Boolean, Byte]), T_A[T_B[(Char,Boolean)], T_B[Boolean]]]
case class CC_B() extends T_A[(Int,T_A[Boolean, Byte]), T_A[T_B[(Char,Boolean)], T_B[Boolean]]]
case class CC_C(a: CC_A) extends T_B[Char]
case class CC_D(a: T_B[Char], b: T_A[T_B[Byte], CC_A], c: CC_A) extends T_B[Char]
case class CC_E[D]() extends T_B[D]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A()) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C(_)