package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_B(a: Byte) extends T_B[T_B[T_A[Byte]]]
case class CC_C(a: (T_B[CC_B],T_B[CC_B])) extends T_B[T_B[T_A[Byte]]]
case class CC_D(a: T_A[(CC_B,Int)]) extends T_B[T_B[T_A[Byte]]]

val v_a: T_B[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((_,_)) => 1 
  case CC_D(CC_A(_, _)) => 2 
}
}