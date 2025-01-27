package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Char], T_A[Int, (Byte,Boolean)]]]
case class CC_B[D](a: (CC_A[Byte],T_A[Byte, Char])) extends T_A[D, T_A[T_A[Boolean, Char], T_A[Int, (Byte,Boolean)]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Boolean, Char], T_A[Int, (Byte,Boolean)]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Char], T_A[Int, (Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B((CC_A(_, _, _),_))