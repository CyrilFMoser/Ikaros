package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: (T_B[T_A, CC_A],T_B[T_A, T_A])) extends T_B[C, T_A]
case class CC_C[D](a: (CC_A,CC_A), b: T_B[D, D], c: CC_A) extends T_B[D, T_A]
case class CC_D[E](a: Byte) extends T_B[CC_C[E], E]

val v_a: T_B[CC_C[T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_C(_, _, _))) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_) => 2 
}
}
// This is not matched: CC_B((_,CC_B(_)))