package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_A, T_A], c: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C, D](a: CC_B, b: (Boolean,CC_A)) extends T_B[C, ((T_A,CC_B),CC_A)]
case class CC_D[E](a: E, b: CC_C[E, E]) extends T_B[E, ((T_A,CC_B),CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}