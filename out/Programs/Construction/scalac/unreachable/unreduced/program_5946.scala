package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, Int]
case class CC_B(a: T_A[T_A[Char, Int], T_A[Byte, Int]], b: CC_A[CC_A[(Char,Boolean)]]) extends T_A[CC_A[T_A[(Int,Char), Byte]], Int]
case class CC_C[D]() extends T_A[D, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}