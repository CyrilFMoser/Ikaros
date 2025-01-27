package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_B[T_A, Byte]), b: Byte, c: T_A) extends T_A
case class CC_B[C](a: T_B[T_A, C], b: T_B[C, (CC_A,T_A)]) extends T_B[C, (CC_A,T_A)]
case class CC_C[D](a: T_B[D, D]) extends T_B[D, (CC_A,T_A)]
case class CC_D[E](a: E, b: E) extends T_B[E, (CC_A,T_A)]

val v_a: T_B[T_A, (CC_A,T_A)] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)