package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[(Int,Byte)],T_A[Char]), b: T_A[(Byte,Char)]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Boolean) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}