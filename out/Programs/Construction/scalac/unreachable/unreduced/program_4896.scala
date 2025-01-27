package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], (T_A,Boolean)], b: T_A, c: T_A) extends T_A
case class CC_B[C, D](a: T_B[C, D], b: CC_A, c: (CC_A,T_B[CC_A, Byte])) extends T_B[C, T_A]
case class CC_C[E]() extends T_B[E, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),_)) => 0 
  case CC_C() => 1 
}
}