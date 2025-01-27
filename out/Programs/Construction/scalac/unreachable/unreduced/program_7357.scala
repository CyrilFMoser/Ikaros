package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B[C](a: T_A[Int], b: T_B[C]) extends T_B[C]
case class CC_C(a: CC_A, b: CC_B[T_B[CC_A]]) extends T_B[T_A[(CC_A,Byte)]]
case class CC_D(a: (((Boolean,Char),Byte),T_B[CC_C])) extends T_B[T_A[(CC_A,Byte)]]

val v_a: T_B[T_A[(CC_A,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(((_,_),CC_B(_, _))) => 2 
}
}