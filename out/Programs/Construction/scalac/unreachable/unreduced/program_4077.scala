package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], (Boolean,Char)], C]
case class CC_B(a: T_A[CC_A[Int], T_A[Char, Byte]]) extends T_A[T_A[T_A[Byte, Int], (Boolean,Char)], T_A[Boolean, Int]]
case class CC_C[D]() extends T_A[T_A[T_A[Byte, Int], (Boolean,Char)], D]

val v_a: T_A[T_A[T_A[Byte, Int], (Boolean,Char)], T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)