package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Boolean], T_A[Char]]]
case class CC_B(a: T_B[T_B[CC_A, CC_A], T_B[CC_A, CC_A]], b: T_A[Byte]) extends T_A[T_B[T_A[Boolean], T_A[Char]]]
case class CC_C[D]() extends T_B[D, (CC_B,T_A[Char])]
case class CC_D[E](a: T_B[E, E], b: E, c: E) extends T_B[E, (CC_B,T_A[Char])]

val v_a: T_B[CC_B, (CC_B,T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}