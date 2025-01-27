package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Byte)], b: T_A[T_A[(Int,Byte)]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_B[T_A[CC_A]], b: CC_A) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: (T_B[(Byte,Int)],T_A[CC_A])) extends T_A[T_A[T_B[Byte]]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C((_,_)) => 1 
}
}
// This is not matched: CC_A(_, _)