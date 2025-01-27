package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Byte],T_B[(Char,Int)]), b: T_A[T_A[Boolean]], c: T_A[T_B[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (T_A[CC_A],Boolean), b: Char, c: T_A[T_B[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A, b: CC_B, c: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B((_,_), _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}