package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Boolean, Byte], T_A[Int, Char]], b: T_A[T_A[Byte, Int], T_B[Char, Boolean]], c: T_A[T_A[(Byte,Char), Char], Char]) extends T_A[Char, T_B[T_B[Char, Byte], Int]]
case class CC_B[F, E](a: CC_A) extends T_B[F, E]
case class CC_C(a: Boolean, b: T_B[T_B[CC_A, Byte], (CC_A,CC_A)]) extends T_B[CC_A, CC_B[Boolean, T_B[CC_A, (Byte,Boolean)]]]
case class CC_D(a: T_A[T_B[CC_A, CC_A], CC_A], b: (T_B[CC_C, CC_A],Char)) extends T_B[CC_A, CC_B[Boolean, T_B[CC_A, (Byte,Boolean)]]]

val v_a: T_B[CC_A, CC_B[Boolean, T_B[CC_A, (Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_C(true, _) => 0 
  case CC_C(false, _) => 1 
  case CC_D(_, _) => 2 
}
}
// This is not matched: CC_B(CC_A(CC_B(_), _, _))