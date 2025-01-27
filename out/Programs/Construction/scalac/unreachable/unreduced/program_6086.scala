package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: (T_B[T_A, T_A],Int)) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[T_A, CC_A], CC_A], c: T_B[T_A, Boolean]) extends T_A
case class CC_C[C](a: C, b: CC_B) extends T_B[C, ((T_A,CC_B),T_A)]
case class CC_D[D](a: T_A) extends T_B[D, ((T_A,CC_B),T_A)]
case class CC_E[E]() extends T_B[E, ((T_A,CC_B),T_A)]

val v_a: T_B[CC_A, ((T_A,CC_B),T_A)] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(CC_A(_, _), _, _)) => 0 
  case CC_D(CC_A(_, (_,_))) => 1 
  case CC_D(CC_B(CC_A(_, _), _, _)) => 2 
  case CC_E() => 3 
}
}