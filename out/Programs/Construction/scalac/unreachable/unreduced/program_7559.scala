package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Char,Char), b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: (Char,T_B[Int, Boolean]), b: T_B[Char, CC_A[Boolean]]) extends T_B[T_A[T_A[Byte]], (Char,CC_C[Char])]
case class CC_E(a: T_A[Char], b: CC_C[CC_D], c: CC_A[CC_C[CC_D]]) extends T_B[T_A[T_A[Byte]], (Char,CC_C[Char])]
case class CC_F() extends T_B[T_A[T_A[Byte]], (Char,CC_C[Char])]

val v_a: T_B[T_A[T_A[Byte]], (Char,CC_C[Char])] = null
val v_b: Int = v_a match{
  case CC_D((_,_), _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F() => 2 
}
}