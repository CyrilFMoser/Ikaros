package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[T_B[Char, Int], Byte], Byte]) extends T_A[E, Byte]
case class CC_B[G](a: (T_A[Boolean, Byte],(Char,Byte)), b: T_A[G, G], c: CC_A[G]) extends T_A[G, Byte]
case class CC_C() extends T_A[CC_B[T_A[Boolean, Byte]], Byte]

val v_a: T_A[CC_B[T_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _, CC_A(_))) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _)))