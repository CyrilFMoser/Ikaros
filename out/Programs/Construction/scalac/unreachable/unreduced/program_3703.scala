package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Char)], b: (T_A[Boolean],(Int,Int)), c: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B[B](a: B, b: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(_,_)), _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}