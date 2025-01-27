package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_B[Int, CC_A], b: (CC_A,T_B[CC_A, T_A]), c: T_B[T_B[Char, (Boolean,Char)], T_B[T_A, T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A, b: CC_B, c: CC_C) extends T_B[T_A, C]
case class CC_E[D](a: (T_B[T_A, Char],(T_A,CC_C)), b: Boolean, c: CC_D[D]) extends T_B[T_A, D]
case class CC_F[E]() extends T_B[T_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _)) => 0 
  case CC_A(_, CC_E(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(_, CC_F())