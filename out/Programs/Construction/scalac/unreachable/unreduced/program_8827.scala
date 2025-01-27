package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B(a: (T_B[Byte, Boolean],CC_A[Char, Boolean]), b: T_A[T_B[Boolean, Byte], T_A[Boolean, Int]]) extends T_B[T_A[CC_A[Int, Int], Byte], T_A[T_A[Char, Int], T_A[Byte, (Char,Boolean)]]]
case class CC_C() extends T_B[T_A[CC_A[Int, Int], Byte], T_A[T_A[Char, Int], T_A[Byte, (Char,Boolean)]]]

val v_a: T_B[T_A[CC_A[Int, Int], Byte], T_A[T_A[Char, Int], T_A[Byte, (Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A()), CC_A()) => 0 
  case CC_C() => 1 
}
}