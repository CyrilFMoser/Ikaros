package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Byte]], b: T_B[T_B[Byte, (Int,Byte)], T_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_B[D]() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B[CC_B[CC_A]], b: (Int,Int)) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), (_,_)) => 2 
}
}