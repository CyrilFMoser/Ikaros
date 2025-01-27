package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Int,T_B[Byte, Byte]), b: T_A[T_B[Boolean, Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_B[(CC_A,CC_A), (CC_A,(Boolean,Char))], b: T_B[CC_A, T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}