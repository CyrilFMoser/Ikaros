package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Byte], T_A], b: T_A, c: T_B[T_A, Byte]) extends T_A
case class CC_B(a: T_B[(CC_A,Boolean), Char], b: T_A, c: T_A) extends T_A
case class CC_C[C]() extends T_B[CC_B, C]
case class CC_D[D](a: (T_B[T_A, CC_B],T_B[Int, (Char,Int)])) extends T_B[CC_B, D]
case class CC_E[E](a: E) extends T_B[CC_B, E]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_D((_,_)) => 0 
  case CC_E(true) => 1 
  case CC_E(false) => 2 
}
}
// This is not matched: CC_C()