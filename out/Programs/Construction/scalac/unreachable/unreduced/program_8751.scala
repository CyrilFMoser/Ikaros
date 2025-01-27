package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: (T_B[Byte],T_B[(Char,Byte)]), c: T_A[C]) extends T_A[C]
case class CC_B(a: Byte, b: T_A[CC_A[Byte]], c: T_A[Byte]) extends T_B[T_B[T_B[Byte]]]
case class CC_C(a: CC_A[T_A[CC_B]], b: T_B[T_B[Char]]) extends T_B[T_B[T_B[Byte]]]

val v_a: T_B[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(0, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, (_,_), CC_A(_, _, _)), _) => 2 
}
}