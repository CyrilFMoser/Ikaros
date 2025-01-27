package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Int],T_A[Boolean]), b: T_B[(Byte,Char), T_B[Char, (Int,Int)]], c: T_A[T_B[Int, (Byte,Byte)]]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]
case class CC_D[D, E](a: T_A[D]) extends T_B[D, E]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()