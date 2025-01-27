package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Char)], b: T_A[T_A[Boolean]], c: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: Byte, b: (CC_B,CC_A)) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, (_,_)) => 2 
}
}