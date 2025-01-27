package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: ((Int,Boolean),(Byte,Byte)), c: T_A[Byte]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),(_,_)), _) => 0 
  case CC_B() => 1 
}
}