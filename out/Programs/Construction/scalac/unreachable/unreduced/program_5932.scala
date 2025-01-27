package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Char)]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[Byte], b: T_A[T_A[(Boolean,Int)]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)