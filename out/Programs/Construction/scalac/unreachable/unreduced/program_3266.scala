package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: (CC_A,T_A[(Byte,Byte)]), b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: CC_B, c: Boolean) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_), _) => 1 
  case CC_C(_, _, _) => 2 
}
}