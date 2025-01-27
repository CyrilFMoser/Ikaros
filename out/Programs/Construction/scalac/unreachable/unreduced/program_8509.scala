package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[(Byte,(Byte,Int)), T_A[Char, Int]], C]
case class CC_B[D](a: CC_A[D], b: (T_A[Char, Boolean],CC_A[Char])) extends T_A[T_A[(Byte,(Byte,Int)), T_A[Char, Int]], D]
case class CC_C[E]() extends T_A[T_A[(Byte,(Byte,Int)), T_A[Char, Int]], E]

val v_a: T_A[T_A[(Byte,(Byte,Int)), T_A[Char, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), (_,CC_A(_, _)))