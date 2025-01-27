package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Byte], T_B[T_A, Char]], b: T_B[T_B[(Char,Char), T_A], T_A]) extends T_A
case class CC_B[C](a: (T_B[Int, T_A],CC_A)) extends T_B[Boolean, C]
case class CC_C[D](a: T_B[D, D], b: T_B[Boolean, D]) extends T_B[Boolean, D]
case class CC_D[E](a: T_B[E, E]) extends T_B[Boolean, E]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_, _)