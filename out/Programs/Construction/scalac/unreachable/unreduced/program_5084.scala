package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]]) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: Byte, b: (((Boolean,Char),CC_A),T_A[CC_A])) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: T_B[T_B[(Boolean,Int)]]) extends T_A[T_B[T_A[Int]]]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, ((_,_),_)) => 1 
  case CC_C(_) => 2 
}
}