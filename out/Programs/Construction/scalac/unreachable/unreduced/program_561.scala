package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[(Char,Byte)]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: (Boolean,CC_A)) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_)) => 1 
}
}