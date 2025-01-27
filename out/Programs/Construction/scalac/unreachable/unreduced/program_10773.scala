package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char) extends T_A[T_A[T_B[Char, Byte]]]
case class CC_B() extends T_A[T_A[T_B[Char, Byte]]]
case class CC_C(a: T_A[T_A[CC_B]], b: CC_A) extends T_A[T_A[T_B[Char, Byte]]]
case class CC_D[D](a: T_A[D], b: D, c: T_A[D]) extends T_B[D, (T_B[(Byte,Byte), Char],T_B[CC_C, CC_B])]
case class CC_E(a: Byte, b: T_B[CC_D[CC_C], CC_B]) extends T_B[CC_D[CC_A], (T_B[(Byte,Byte), Char],T_B[CC_C, CC_B])]

val v_a: T_A[T_A[T_B[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()